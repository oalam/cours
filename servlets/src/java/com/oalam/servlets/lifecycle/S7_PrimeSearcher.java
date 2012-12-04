package com.oalam.servlets.lifecycle;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet searches for prime numbers above one quadrillion.
 * The algorithm it uses couldn't be simpler: it selects odd-numbered 
 * candidates and attempts to divide them by every odd integer 
 * between 3 and their square root. 
 * If none of the integers evenly divides the candidate,
 * it is declared prime. 
 * Should be disabled to let the server's CPU handle important tasks.
 * 
 * @author bailett
 */
public class S7_PrimeSearcher extends HttpServlet implements Runnable {

    long lastprime = 0;                    // last prime found
    Date lastprimeModified = new Date();   // when it was found
    Thread searcher;                       // background search thread

    @Override
    public void init() throws ServletException {
        searcher = new Thread(this);
        searcher.setPriority(Thread.MIN_PRIORITY);  // be a good citizen
        searcher.start();
    }

    @Override
    public void run() {
        //               QTTTBBBMMMTTTOOO
        long candidate = 1000000000000001L;  // one quadrillion and one

        // Begin loop searching for primes
        while (true) {                       // search forever
            if (isPrime(candidate)) {
                lastprime = candidate;           // new prime
                lastprimeModified = new Date();  // new "prime time"
            }
            candidate += 2;                    // evens aren't prime

            // Between candidates take a 0.2 second break.
            // Another way to be a good citizen with system resources.
            try {
                searcher.sleep(200);
            } catch (InterruptedException ignored) {
            }
        }
    }

    private static boolean isPrime(long candidate) {
        // Try dividing the number by all odd numbers between 3 and its sqrt
        long sqrt = (long) Math.sqrt(candidate);
        for (long i = 3; i <= sqrt; i += 2) {
            if (candidate % i == 0) {
                return false;  // found a factor
            }
        }

        // Wasn't evenly divisible, so it's prime
        return true;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        if (lastprime == 0) {
            out.println("Still searching for first prime...");
        } else {
            out.println("The last prime discovered was " + lastprime);
            out.println(" at " + lastprimeModified);
        }
    }

    @Override
    public void destroy() {
        searcher.stop();
    }
}
