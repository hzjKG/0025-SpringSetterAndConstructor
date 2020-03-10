package com.hzj.services;

import com.hzj.dao.StuDao;

public class StuServicesImp implements StuServices {



    StuDao stuDao;

////    //setter依赖注入（弱依赖）
//    public void setStuDao(StuDao stuDao) {
//        this.stuDao = stuDao;
//    }
//    //构造方法依赖注入(强依赖)
    public StuServicesImp(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    public void getAllStu() {
        stuDao.selectByAll();
        System.out.println("StuServicesImp------------------>");
    }
}
