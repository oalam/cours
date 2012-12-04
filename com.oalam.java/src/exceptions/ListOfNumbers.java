package exceptions;

import java.io.*;
import java.util.ArrayList;

public class ListOfNumbers {

    private ArrayList<Integer> victor;
    private static final int SIZE = 10;

    public ListOfNumbers() {
	victor = new ArrayList<>(SIZE);
	for (int i = 0; i < SIZE; i++) {
	    victor.add(new Integer(i));
	}
    }

    public void writeList() {
	PrintWriter out = null;

	try {
	    System.out.println("Entering try statement");
	    out = new PrintWriter(new FileWriter("OutFile.txt"));

	    for (int i = 0; i < SIZE + 1; i++) {
		out.println("Value at: " + i + " = " + victor.get(i));
	    }
	} catch (IndexOutOfBoundsException e) {
	    System.err.println("Caught IndexOutOfBoundsException: "
		    + e.getMessage());
	} catch (IOException e) {
	    System.err.println("Caught IOException: " + e.getMessage());
	} finally {
	    if (out != null) {
		System.out.println("Closing PrintWriter");
		out.close();
	    } else {
		System.out.println("PrintWriter not open");
	    }
	}
    }

    public static void main(String[] args) {
	new ListOfNumbers().writeList();
    }
}
