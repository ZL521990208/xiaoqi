package com.zl.blog.dao;

import com.zl.blog.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    int[] batchInsert(List<User> studentList) throws SQLException;
    User findUserByMobile(String mobile) throws SQLException;
}
