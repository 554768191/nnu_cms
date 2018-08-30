package com.nnu.service;

import com.nnu.dao.Rent_ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author shisj
 * @Date: 2018/8/30 9:40
 */

@Service
public class RentContactService {
    private Rent_ContactMapper rent_contactMapper;


    @Autowired
    public void setRent_contactMapper(Rent_ContactMapper rent_contactMapper) {
        this.rent_contactMapper = rent_contactMapper;
    }
}
