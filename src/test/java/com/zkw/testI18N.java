package com.zkw;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import java.util.Locale;

public class testI18N {
    @Test
    public void testContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        String name = context.getMessage("customer.name",new Object[]{28,"http://www.mkong.com"}, Locale.US);
        System.out.println("english-->"+name);
        String namechinese = context.getMessage("customer.name",new Object[]{28,"http://www.mkong.com"}, Locale.SIMPLIFIED_CHINESE);
        System.out.println("english-->"+namechinese);
//        String h = context.getMessage("hello",null,Locale.US);
//        System.out.println(h);

    }
}
