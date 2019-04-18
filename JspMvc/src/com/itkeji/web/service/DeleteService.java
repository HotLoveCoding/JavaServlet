package com.itkeji.web.service;

import com.itkeji.web.dao.DeleteDao;

/**
 * @author shkstart
 * @create 2019-04-18 20:29
 */
public class DeleteService {
    public void delete(int id) {
        DeleteDao dao = new DeleteDao();
       dao.delete(id);

    }
}
