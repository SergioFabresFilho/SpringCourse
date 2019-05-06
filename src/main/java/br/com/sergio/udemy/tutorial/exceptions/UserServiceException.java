package br.com.sergio.udemy.tutorial.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UserServiceException(String message) {
        super(message);
    }
}
