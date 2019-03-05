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
public class ErrorMessageModel {

	private int errorCode;
	private String errorMessage;
	private String documentLink;
	
	public ErrorMessageModel() {
	}
	
	public ErrorMessageModel(int errorCode, String errorMessage, String documentLink) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.documentLink = documentLink;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDocumentLink() {
		return documentLink;
	}

	public void setDocumentLink(String documentLink) {
		this.documentLink = documentLink;
	}

}
