package com.shiw.enterpriseusercenter.quartz;


import javafx.scene.input.DataFormat;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
@Configuration
@EnableScheduling
@CommonsLog
public class EmployeeAddTask {


     @Scheduled(cron = "1-6 * * * * ?")
     public void testShowTask(){
         LocalDate ld = LocalDate.now();
//         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//         ld.format(dtf);
//        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         System.out.println("EmployeeAddTask ---> testShowTask ---> running  ...."+ new Date());
     }

}
