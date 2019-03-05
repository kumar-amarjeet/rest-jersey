/**
 * 
 */
package org.ak.learn.rest.jersey.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.ak.learn.rest.jersey.model.ErrorMessageModel;

/**
 * @author Amarjeet Kumar
 *
 */
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {

		if (exception instanceof DataNotFoundException) {
			ErrorMessageModel error = new ErrorMessageModel(Status.NOT_FOUND.getStatusCode(), exception.getMessage(),
					"https://www.google.com/");
			return Response.status(Status.NOT_FOUND).entity(error).build();
		} else if (exception instanceof InvalidInputException) {
			ErrorMessageModel error = new ErrorMessageModel(Status.BAD_REQUEST.getStatusCode(), exception.getMessage(),
					"https://www.google.com/");
			return Response.status(Status.BAD_REQUEST).entity(error).build();
		} else {
			ErrorMessageModel error = new ErrorMessageModel(Status.INTERNAL_SERVER_ERROR.getStatusCode(),
					exception.getMessage(), "https://www.google.com/");
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
		}
	}

}
