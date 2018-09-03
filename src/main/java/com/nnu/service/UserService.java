package com.nnu.service;


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

    public int getId(String username){
        User user = userMapper.selectByUsername(username);
        return user.getUserid();
    }

    /*
    查询匹配用户
     */
    public User findMatch(String userid, String password){
        int length = userid.length();
        String id = userid.substring(userid.lastIndexOf('0')+1, length);

        try{
            User matchUser = userMapper.selectByPrimaryKey(Integer.parseInt(id));

            if(!matchUser.getPassword().equals(password)){
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
