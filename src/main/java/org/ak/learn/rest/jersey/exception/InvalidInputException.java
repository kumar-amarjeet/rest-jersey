/**
 * 
 */
package org.ak.learn.rest.jersey.exception;

/**
 * @author Amarjeet Kumar
 *
 */
public class InvalidInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5619856466602319902L;

	public InvalidInputException(String exceptionMessage) {
		super(exceptionMessage);
	}

}
