package edu.gatech.oad.antlab.person;

import java.util.ArrayList;
import java.util.Random;



/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Tanay Ponkshe
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private static String calc(String input) {
		ArrayList<Character> chars = new ArrayList<Character>();
		int i=0;
		while(i<input.length()){
			char character = input.charAt(i);
			chars.add(character);
			i++;
			
		}
		Random rand = new Random();
	
		String returnString="";
		int j=0;
		while(j<input.length()){
			int r = rand.nextInt(chars.size());
			returnString = returnString + chars.get(r);
			chars.remove(r);
			j++;
		}
		  return returnString;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
