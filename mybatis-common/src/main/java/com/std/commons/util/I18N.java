package com.std.commons.util;


import java.util.Locale;
import java.util.ResourceBundle;
/**
* @ClassName: I18NTest
* @Description: 编程实现固定文本的国际化
* @author: tao
* @date: 2014-8-29 下午9:34:05
*
*/ 
public class I18N {

    public static void main(String[] args) {
        //资源包基名(包名+myproperties)
        String basename = "i18n.myproperties";
        //设置语言环境
        Locale cn = Locale.CHINA;//中文
        Locale us = Locale.US;//英文
        //根据基名和语言环境加载对应的语言资源文件
        ResourceBundle myResourcesCN = ResourceBundle.getBundle(basename,cn);//加载myproperties_zh.properties
        ResourceBundle myResourcesUS = ResourceBundle.getBundle(basename,us);//加载myproperties_en.properties
        
        //加载资源文件后， 程序就可以调用ResourceBundle实例对象的 getString方法获取指定的资源信息名称所对应的值。
        //String value =  myResources.getString(“key");
        String usernameCN = myResourcesCN.getString("username");
        String passwordCN = myResourcesCN.getString("password");
        
        String usernameUS = myResourcesUS.getString("username");
        String passwordUS = myResourcesUS.getString("password");
        
        System.out.println(usernameCN+"--"+passwordCN);
        System.out.println(usernameUS+"--"+passwordUS);
    }
}