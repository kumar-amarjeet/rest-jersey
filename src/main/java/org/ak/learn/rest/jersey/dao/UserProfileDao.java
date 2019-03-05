/**
 * 
 */
package org.ak.learn.rest.jersey.dao;

import java.util.HashMap;
import java.util.Map;

import org.ak.learn.rest.jersey.model.UserProfileModel;

/**
 * @author Amarjeet Kumar
 *
 */
public class UserProfileDao {

	private static Map<Long, UserProfileModel> userProfiles = new HashMap<Long, UserProfileModel>();

	public static Map<Long, UserProfileModel> getUsers() {
		return userProfiles;
	}

}
