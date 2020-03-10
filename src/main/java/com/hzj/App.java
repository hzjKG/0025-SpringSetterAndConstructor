package com.hzj;
import com.hzj.services.StuServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StuServices stuServices = context.getBean("stuServicesImp", StuServices.class);
        stuServices.getAllStu();

    }
}
