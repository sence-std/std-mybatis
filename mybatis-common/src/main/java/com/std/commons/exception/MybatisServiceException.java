package com.std.commons.exception;

/**
 * Created by sence on 2015/6/22.
 */
public class MybatisServiceException extends Exception {

    public MybatisServiceException(){

    }

    public MybatisServiceException(String msg){
        super(msg);
    }

}
