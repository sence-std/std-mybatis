package com.std.commons.util;

import java.util.Collection;

/**
 * Created by sence on 2015/6/22.
 */
public class Check {

    /**
     * @param obj
     * @return boolean
     */
    public static boolean isNull(Object obj){
        return obj == null;
    }

    /**
     * @param str
     * @return
     */
    public static boolean isBlankStr(String str){
        if(isNull(str)){
            return true;
        }
        if("".equals(str)){
            return true;
        }
        return false;
    }

    /**
     * @param collect
     * @return
     */
    public static boolean isEmptyCollection(Collection collect){
        if(isNull(collect)){
            return true;
        }
        if(collect.size()==0){
            return true;
        }
        if(collect.contains(null)){
            return true;
        }
        return false;
    }

}
