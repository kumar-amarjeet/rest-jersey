/**
 * 
 */
package org.ak.learn.rest.jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Amarjeet Kumar
 *
 */
@XmlRootElement
public class UserProfileModel {

	private long userId;
	private String firstName;
	private String lastName;
	private String userName;

	public UserProfileModel() {
	}

	public UserProfileModel(long userId, String firstName, String lastName, String userName) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
