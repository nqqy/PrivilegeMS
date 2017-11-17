package com.nianququye.dao;

import java.util.List;

import com.nianququye.domain.PageBean;
import com.nianququye.domain.User;

public interface UserDao {
    List<User> queryAllUserByPaging(PageBean<User> pageBean);
    Integer queryAllUserTotalNum();
}
