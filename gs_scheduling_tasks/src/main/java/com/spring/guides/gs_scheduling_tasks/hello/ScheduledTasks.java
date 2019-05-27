package com.spring.guides.gs_scheduling_tasks.hello;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.ScheduledTasksBeanDefinitionParser;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class ScheduledTasks {
    private static final Logger log =LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
