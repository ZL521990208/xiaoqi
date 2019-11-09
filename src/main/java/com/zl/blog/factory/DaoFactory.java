package com.zl.blog.factory;

import com.zl.blog.dao.UserDao;
import com.zl.blog.dao.impl.UserDaoImpl;

public class DaoFactory {
    public static UserDao getUserDaoInstance(){
        return new UserDaoImpl();
    }

}
