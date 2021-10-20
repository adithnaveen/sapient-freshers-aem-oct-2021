package com.naveen.exceptions;

public class NameTooShortException extends Exception {
	private String msg;

	public NameTooShortException() {
		msg = "Name Too Short";
	}

	public NameTooShortException(String msg) {
		this.msg = msg;
	}
}
