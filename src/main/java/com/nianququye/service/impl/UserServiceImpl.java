package com.nianququye.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nianququye.dao.UserDao;
import com.nianququye.domain.PageBean;
import com.nianququye.domain.User;
import com.nianququye.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    public PageBean<User> getAllUserByPaging(PageBean<User> pageBean) {
        pageBean.setEntityList(userDao.queryAllUserByPaging(pageBean));
        pageBean.setTotalNum(userDao.queryAllUserTotalNum());
        return pageBean;
    }

}
