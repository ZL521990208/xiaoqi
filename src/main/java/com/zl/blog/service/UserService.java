package com.zl.blog.service;

import com.zl.blog.domain.UserDto;

import java.util.Map;

public interface UserService {
    Map<String,Object> signIn(UserDto userDto);

}
