/**
 * 
 */
package org.ak.learn.rest.jersey.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ak.learn.rest.jersey.dao.UserProfileDao;
import org.ak.learn.rest.jersey.exception.DataNotFoundException;
import org.ak.learn.rest.jersey.exception.InvalidInputException;
import org.ak.learn.rest.jersey.model.UserProfileModel;

/**
 * @author Amarjeet Kumar
 *
 */
public class UserProfileService {
	
	private Map<Long, UserProfileModel> userProfiles = UserProfileDao.getUsers();
	
	public UserProfileService() {
		UserProfileModel u1 = new UserProfileModel(1L, "REST", "Jersey", "rest.jersey");
		UserProfileModel u2 = new UserProfileModel(2L, "First", "Github", "first.github");
		UserProfileModel u3 = new UserProfileModel(3L, "Sample", "Project", "sample.project");
		UserProfileModel u4 = new UserProfileModel(4L, "Amarjeet", "Kumar", "amarjeet.kumar");
		
		userProfiles.put(1L, u1);
		userProfiles.put(2L, u2);
		userProfiles.put(3L, u3);
		userProfiles.put(4L, u4);
	}
	
	public List<UserProfileModel> getAllUserProfiles(){
		return new ArrayList<UserProfileModel>(userProfiles.values());
	}

	public UserProfileModel getUserProfile(long userId) {
		UserProfileModel userProfile = userProfiles.get(userId); 
		if(userProfile == null) {
			throw new DataNotFoundException("No user profile found for user id : " + userId);
		}
		return userProfile;
	}
	
	public UserProfileModel updateUserProfile(UserProfileModel userProfile) {
		
		if(userProfile.getUserId() < 0 || userProfiles.get(userProfile.getUserId()) == null) {
			throw new InvalidInputException("User id " + userProfile.getUserId() + " is not a valid user id");
		} else {
			userProfiles.put(userProfile.getUserId(), userProfile);
			return userProfile;
		}
		
	}
	
	public UserProfileModel addUserProfile (UserProfileModel userProfile) {
		userProfile.setUserId(userProfiles.size() + 1);
		userProfiles.put(userProfile.getUserId(), userProfile);
		return userProfile;
	}
	
	public UserProfileModel removeUserProfile(UserProfileModel userProfile) {
		if(userProfile.getUserId() < 0 || userProfiles.get(userProfile.getUserId()) == null) {
			throw new InvalidInputException("User id " + userProfile.getUserId() + " is not a valid user id");
		} else {
			 return userProfiles.remove(userProfile.getUserId());
		}
	}
}
