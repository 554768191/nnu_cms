package com.nnu.dao;

import com.nnu.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    User selectByUsername(String username);
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}