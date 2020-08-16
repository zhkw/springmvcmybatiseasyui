package com.zkw;

import com.cisdi.enfi.pbs.controller.MonkeyController;
import com.cisdi.enfi.pbs.domain.Monkeys;
import com.cisdi.enfi.pbs.service.MonkeysService;
import com.cisdi.enfi.pbs.service.impl.MonkeysServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class testMonkey {

    @InjectMocks
    private MonkeyController monkeyController;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(monkeyController).build();
    }

    @Test
    public void getMonkeys() throws Exception{
        this.mockMvc.perform(get("/monkey"))
                .andExpect(status().isOk());
    }


}
