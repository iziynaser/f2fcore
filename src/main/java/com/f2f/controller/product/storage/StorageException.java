package com.f2f.controller.product.storage;

public class StorageException extends RuntimeException{

    public StorageException(String message){
        super(message);
    }

    public StorageException(String message,Throwable e){
        super(message,e);
    }
}
