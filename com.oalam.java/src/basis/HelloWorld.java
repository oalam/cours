package basis;


import java.util.Arrays;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tom
 */
public class HelloWorld {

    private static void print(List<? extends Object> list) {
	for (Object o : list) {
	    System.out.println(o);
	}
    }

    public static void main(String[] args) {
	List<String> list = Arrays.asList(args);
	print(list);
    }
}
