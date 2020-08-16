package com.cisdi.enfi.pbs.module.listener;

import com.fore.util.GlobalConfigHolder;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;

public class StartupListener implements ServletContextListener {

    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void contextInitialized(ServletContextEvent event) {
        logger.info("系统初始化中....");
        ServletContext context = event.getServletContext();
        try {
            initSys();
        } catch ( Exception e ) {
            logger.error("启动触发器出错！");
            e.printStackTrace();
        }
        logger.info("系统初始化完成.");
        logger.info("每日3：00执行数据同步.");

    }

    private void initSys() throws IOException {
        GlobalConfigHolder.init();
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {

    }
}
