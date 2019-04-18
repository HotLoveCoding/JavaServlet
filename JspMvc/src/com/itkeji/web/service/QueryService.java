package com.itkeji.web.service;

import com.itkeji.web.dao.QueryDao;
import com.itkeji.web.entity.Contact;

/**
 * @author shkstart
 * @create 2019-04-18 17:05
 */
public class QueryService {
    public Contact findById(int id) {
        QueryDao dao = new QueryDao();
        return  dao.findById(id);
    }
}
