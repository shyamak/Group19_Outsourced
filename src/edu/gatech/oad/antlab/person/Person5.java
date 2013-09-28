package edu.gatech.oad.antlab.person;

import java.util.*;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Jerry Yee
 *  @version 1.1
 */
public class Person5 {
	/** Holds the persons real name */
	private String name;
	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person5(String pname) {
		name = pname;
	}
	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 3 positions.
	 * given "gtg123b" it should return
	 * "123bgtg".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		//Person 5 put your implementation here
		int rot = 3;
		StringBuilder ret = new StringBuilder(input.length());
		for ( int i = rot; i < input.length(); i++ )
			ret.append(input.charAt(i));

		for ( int i = 0; i < rot; i++)
			ret.append(input.charAt(i));

		return ret.toString();
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
