package com.test;

import com.std.user.domain.User;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by sence on 2015/7/9.
 */
public class T_CustomTest {

    private Validator validator;
    @Before
    public void before(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testUser(){
        Object user = new User();
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(user);
        Iterator<ConstraintViolation<Object>> it = constraintViolations.iterator();
        while(it.hasNext()){
            ConstraintViolation<Object> constr = it.next();
            System.out.println(constr.getPropertyPath()+"--"+constr.getMessage());
        }

    }

}
