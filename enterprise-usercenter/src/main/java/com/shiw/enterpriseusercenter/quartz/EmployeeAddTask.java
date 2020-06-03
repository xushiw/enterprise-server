package com.shiw.enterpriseusercenter.quartz;


import com.shiw.enterpriseusercenter.model.Employee;
import com.shiw.enterpriseusercenter.service.EmployeeService;
import com.shiw.enterpriseusercenter.utils.IdUtil;
import javafx.scene.input.DataFormat;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sun.net.ftp.impl.DefaultFtpClientProvider;

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


    @Autowired
    private EmployeeService employeeService;

//     @Scheduled(cron = "1-6 * * * * ?")
     @Scheduled(fixedRate = 1000*60) //每隔多久执行一次
//     @Scheduled(fixedDelay = 5000*1)  //延迟多久执行一次
     //@Scheduled(initialDelay = 5000*1,fixedDelay = 2000*1)  第一次执行延迟时间
     public void testShowTask() throws Exception {

         for(int num=0; num< 200;num++){
             Employee emp = new Employee();
             emp.setId(IdUtil.nextId());
             String nikeName= RandomStringUtils.randomAlphanumeric(5);
             emp.setNikeName(nikeName);
             emp.setAdress("hubei.wuhan."+nikeName);
             int randNum=(int)(Math.random()*101);
             emp.setAge(randNum);
             emp.setCardNo("420116"+randNum+num+randNum+num+randNum);
             emp.setRealName("wuhan."+nikeName);
             emp.setUpdateTime(new Date());
             emp.setCreateTime(new Date());
             String emailName= RandomStringUtils.randomAlphanumeric(5);
             emp.setEmail(emailName+"@126.com");

             employeeService.addEmployee(emp);
         }

//         System.out.println("EmployeeAddTask ---> testShowTask ---> running  id value ---> "+ IdUtil.nextId()+" <---> "+filename+" <---> "+num);
//         System.out.println("EmployeeAddTask ---> testShowTask ---> running  ...."+ new Date());
     }

}
