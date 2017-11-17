package com.nianququye.service;

import com.nianququye.domain.PageBean;
import com.nianququye.domain.User;

public interface UserService {
    PageBean<User> getAllUserByPaging(PageBean<User> pageBean);
}
