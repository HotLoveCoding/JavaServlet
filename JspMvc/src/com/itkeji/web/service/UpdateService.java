package com.itkeji.web.service;

import com.itkeji.web.dao.UpdateDao;
import com.itkeji.web.entity.Contact;

/**
 * @author shkstart
 * @create 2019-04-18 16:52
 */
public class UpdateService {
    public void update(Contact contact) {
        UpdateDao dao = new UpdateDao();
        dao.update(contact);
    }
}
