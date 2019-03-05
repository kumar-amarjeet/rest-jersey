/**
 * 
 */
package org.ak.learn.rest.jersey.exception;

/**
 * @author Amarjeet Kumar
 *
 */
public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6416593437358119119L;

	public DataNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
