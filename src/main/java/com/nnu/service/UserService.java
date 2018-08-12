package com.nnu.service;


import com.nnu.dao.UserMapper;
import com.nnu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper userMapper;

    public String getName(int id){
        User user = userMapper.selectByPrimaryKey(id);
        return user.getUsername();
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
