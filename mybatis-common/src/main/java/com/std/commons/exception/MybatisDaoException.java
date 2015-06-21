package com.std.commons.exception;

/**
 * Created by sence on 2015/6/21.
 */
public class MybatisDaoException extends Exception {

    public MybatisDaoException(){

    }

    public MybatisDaoException(String msg){
        super(msg);
    }
}
