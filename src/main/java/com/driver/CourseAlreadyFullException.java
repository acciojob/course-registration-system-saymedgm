package com.driver;

public class CourseAlreadyFullException extends Exception {
    public CourseAlreadyFullException(String message) {
        super(message);
    }
}