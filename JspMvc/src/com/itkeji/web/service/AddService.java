package com.itkeji.web.service;

import com.itkeji.web.dao.AddDao;
import com.itkeji.web.entity.Contact;

/**
 * @author shkstart
 * @create 2019-04-18 16:16
 */
public class AddService {
    public void save(Contact contact) {
        AddDao dao = new AddDao();

        dao.saveContact(contact);
    }
}
