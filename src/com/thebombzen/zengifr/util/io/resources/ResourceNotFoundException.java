package com.thebombzen.zengifr.util.io.resources;

import com.thebombzen.zengifr.PreLoadable;

/**
 * Represents the lack of existence of a resource. Sometimes this is fatal, and
 * sometimes it's not, depending on the resource.
 */
@PreLoadable
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	public final String pkg;

	public ResourceNotFoundException(String pkg) {
		super();
		this.pkg = pkg;
	}

	public ResourceNotFoundException(String pkg, String message) {
		super(message);
		this.pkg = pkg;
	}

	public ResourceNotFoundException(String pkg, Throwable cause) {
		super(cause);
		this.pkg = pkg;
	}

	public ResourceNotFoundException(String pkg, String message, Throwable cause) {
		super(message, cause);
		this.pkg = pkg;
	}
}
