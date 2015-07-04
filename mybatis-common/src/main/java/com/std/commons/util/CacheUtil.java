package com.std.commons.util;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.authc.ExcessiveAttemptsException;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

public class CacheUtil {
	 private static Ehcache passwordRetryCache;
	
    public static void RetryLimitHashedCredentialsMatcher() {
        CacheManager cacheManager = CacheManager.create(CacheManager.class.getClassLoader().getResource("ehcache.xml"));
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }
    
    public static void main(String[] args) {
    	save();
	}
    
    public static void save(){
    	RetryLimitHashedCredentialsMatcher();
    	String username="zhangsan";
    	Element element = passwordRetryCache.get(username);
        if(element == null) {
            element = new Element(username , "username");
            passwordRetryCache.put(element);
        }
        String nickName = (String) element.getObjectValue();
        System.out.println(nickName);
    }
    
    public static void remove(){
    	RetryLimitHashedCredentialsMatcher();
    	String username="lisan";
    	Element element = passwordRetryCache.get(username);
//      passwordRetryCache.remove(username);
    }
    
    public static void be(String[] args) {
    	RetryLimitHashedCredentialsMatcher();
    	String username="lisan";
    	Element element = passwordRetryCache.get(username);
    	if(element == null) {
            element = new Element(username , new AtomicInteger(0));
            passwordRetryCache.put(element);
        }
        AtomicInteger retryCount = (AtomicInteger)element.getObjectValue();
        if(retryCount.incrementAndGet() > 0) {
	            //if retry count > 5 throw
        	System.out.println(retryCount.incrementAndGet());
        	System.out.println(retryCount);
	         //System.out.println("超过5次");
        }
        
        

	}
}
