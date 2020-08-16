package com.zkw;

import com.cisdi.enfi.pbs.controller.WelcomeController;
import com.cisdi.enfi.pbs.mapper.MonkeysMapper;
import com.cisdi.enfi.pbs.domain.Monkeys;
import com.cisdi.enfi.pbs.service.MonkeysService;
import com.cisdi.enfi.pbs.service.impl.MonkeysServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/conf/applicationContext.xml","file:src/main/webapp/WEB-INF/conf/dispatcherServlet.xml"})
@WebAppConfiguration
public class MonkeysTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setup(){

        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testMessage() throws Exception{
        ResultMatcher ok = MockMvcResultMatchers.status().isOk();
        ResultMatcher msg = MockMvcResultMatchers.model().attribute("monkey","a");

        MockHttpServletRequestBuilder builder = get("/monkey");
        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(msg);
    }

    @Test
    public void testDetail() throws Exception{
        this.mockMvc.perform(get("/monkey")).andDo(print());
    }
}
