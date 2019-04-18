package com.itkeji.web.test;

import com.itkeji.web.dao.ContactDao;
import com.itkeji.web.entity.Contact;
import org.junit.Test;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-18 15:29
 */


public class TestContacct {
    @Test
    public void testDao() {
        ContactDao dao = new ContactDao();
        List<Contact> contacts = dao.findAll();
        System.out.println(contacts);
    }

}
