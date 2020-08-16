package com.zkw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Locale;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class testRunWith {

    @Autowired
    ApplicationContext context;

    @Test
    public void testSample(){
        String name = context.getMessage("customer.name",new Object[]{28,"http://www.mkong.com"}, Locale.US);
        System.out.println("english-->"+name);
        String namechinese = context.getMessage("customer.name",new Object[]{28,"http://www.mkong.com"}, Locale.SIMPLIFIED_CHINESE);
        System.out.println("english-->"+namechinese);
    }


}
