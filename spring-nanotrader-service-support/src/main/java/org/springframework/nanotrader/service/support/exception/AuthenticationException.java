package org.springframework.nanotrader.service.support.exception;

/**
 * AuthenticationException should be thrown whenever a login attempt fails to
 * find the user
 * 
 * @author Brian Dussault
 */

@SuppressWarnings("serial")
public class AuthenticationException extends RuntimeException {
	public AuthenticationException() {
		super();
	}

	public AuthenticationException(String message) {
		super(message);
	}
}