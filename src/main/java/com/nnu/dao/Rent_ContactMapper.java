package com.nnu.dao;

import com.nnu.domain.Rent_Contact;

public interface Rent_ContactMapper {
    int deleteByPrimaryKey(Integer contactid);

    int insert(Rent_Contact record);

    int insertSelective(Rent_Contact record);

    Rent_Contact selectByPrimaryKey(Integer contactid);

    int updateByPrimaryKeySelective(Rent_Contact record);

    int updateByPrimaryKey(Rent_Contact record);
}