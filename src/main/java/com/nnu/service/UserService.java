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

    public User findMatch(String userid, String password){
        int length = userid.length();
        String id = userid.substring(userid.lastIndexOf('0')+1, length);

        try{
            System.out.println(id);
            System.out.println(password);
            User matchUser = userMapper.selectByPrimaryKey(Integer.parseInt(id));

            if(!matchUser.getPassword().equals(password)){
                System.out.print("wrong!");
                return null;
            }
            return matchUser;
        }catch (NumberFormatException e){
            return null;
        }

    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
