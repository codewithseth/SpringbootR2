package com.codewithseth.springbootr2;

public class FileUploadException extends RuntimeException {
    public FileUploadException(String msg, Throwable cause) {
        super(msg, cause); 
    }
} 
