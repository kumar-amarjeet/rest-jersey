/**
 * 
 */
package org.ak.learn.rest.jersey.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ak.learn.rest.jersey.model.UserProfileModel;
import org.ak.learn.rest.jersey.service.UserProfileService;

/**
 * @author Amarjeet Kumar
 *
 */
@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserProfileResource {

	private UserProfileService service = new UserProfileService();
	
	@GET
	public List<UserProfileModel> getAllUserProfiles(){
		return service.getAllUserProfiles();
	}
	
	@GET
	@Path("/{userid}")
	public UserProfileModel getUserProfileById(@PathParam("userid") long userId) {
		System.out.println("UserId is - " + userId);
		return service.getUserProfile(userId);		
	}
	
	@POST
	public UserProfileModel createUserProfile(UserProfileModel userProfile) {
		return service.addUserProfile(userProfile);
	}
	
	@PUT
	@Path("/{userid}")
	public UserProfileModel updateUserProfile(@PathParam("userid") long userId, UserProfileModel userProfile) {
		System.out.println("UserId is - " + userId);
		userProfile.setUserId(userId);
		return service.updateUserProfile(userProfile);
	}
	
	@DELETE
	@Path("/{userid}")
	public UserProfileModel removeUserProfile (@PathParam("userid") long userId) {
		System.out.println("UserId is - " + userId);
		return service.removeUserProfile(new UserProfileModel(userId, "", "", ""));
	}
}
