package com.neng.eloquasdk.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
 * The class {@code BadRequestException} is a subclasses of
 * {@code Exception} that indicates conditions that a reasonable
 * application might want to catch regarding a HTTP request.
 *
 * This class is a checked exception and needs to be declared in a
 * method or constructor's {@code throws} clause.
 *
 * @author  Nicholas Eng
 * @see     Exception
 */
public class BadRequestException extends Exception {
    
    private static final long serialVersionUID = 2266674636673598154L;

    @Getter
    private HttpStatus responseStatusCode;

    /**
     * Constructs a new bad request exception with {@code null} as its detail message and response status code.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public BadRequestException() {
        super();
    }

    /**
     * Constructs a new bad request exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     * @param responseStatusCode the response status code
     * @see HttpStatus
     */
    public BadRequestException(HttpStatus responseStatusCode) {
        super();
        this.responseStatusCode = responseStatusCode;
    }

    /**
     * Constructs a new bad request exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     * @param message the response message
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * Constructs a new bad request exception with the specified cause and a detail
     * message of <tt>(cause==null ? null : cause.toString())</tt> (which
     * typically contains the class and detail message of <tt>cause</tt>).
     * @param cause the cause
     */
    public BadRequestException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new bad request exception with the specified cause and detail
     * message.
     * @param message the response message
     * @param cause the cause
     */
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new bad request exception with the specified response status and detail
     * message.
     * @param responseStatusCode the response status code   
     * @param message the response message
     * @see HttpStatus
     */
    public BadRequestException(HttpStatus responseStatusCode, String message) {
        super(message);
        this.responseStatusCode = responseStatusCode;
    }

    /**
     * Constructs a new bad request exception with the specified response status and cause and a detail
     * message of <tt>(cause==null ? null : cause.toString())</tt> (which
     * typically contains the class and detail message of <tt>cause</tt>).
     * @param responseStatusCode the response status code   
     * @param cause the cause
     * @see HttpStatus
     */
    public BadRequestException(HttpStatus responseStatusCode, Throwable cause) {
        super(cause);
        this.responseStatusCode = responseStatusCode;
    }

    /**
     * Constructs a new bad request exception with the specified response status, cause and detail message.
     * @param responseStatusCode the response status code 
     * @param message the response message  
     * @param cause the cause
     * @see HttpStatus
     */
    public BadRequestException(HttpStatus responseStatusCode, String message, Throwable cause) {
        super(message, cause);
        this.responseStatusCode = responseStatusCode;
    }
}