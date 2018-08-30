package com.nnu.service;

import com.nnu.dao.Rent_ContactMapper;
import com.nnu.domain.Rent_Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author shisj
 * @Date: 2018/8/30 9:40
 */

@Service
public class RentContactService {
    private Rent_ContactMapper rent_contactMapper;

    public void addNewConatctInfo(Rent_Contact rent_contact){
        rent_contactMapper.insert(rent_contact);
    }

    public void deleteContactInfo(int contactid){
        rent_contactMapper.deleteByPrimaryKey(contactid);
    }

    public void updateContact(Rent_Contact rent_contact){
        rent_contactMapper.updateByPrimaryKey(rent_contact);
    }


    @Autowired
    public void setRent_contactMapper(Rent_ContactMapper rent_contactMapper) {
        this.rent_contactMapper = rent_contactMapper;
    }
}
