package com.std.commons.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sence on 6/23/2015.
 */
public class T_Check {

    @Test
    public void testEmptyCollection(){
        List<String> strs = new ArrayList<>();
        strs.add(null);
        strs.add("a");
        strs.add("b");
        Assert.assertEquals(3,strs.size());
        Assert.assertEquals(true,Check.isEmptyCollection(strs));
    }

}
