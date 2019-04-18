package com.itkeji.web.service;

import com.itkeji.web.dao.ContactDao;
import com.itkeji.web.entity.Contact;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-18 15:21
 */
public class ContactService {
    private ContactDao contactDao = new ContactDao();

    public List<Contact> findAll() {
        return contactDao.findAll();
    }
}
