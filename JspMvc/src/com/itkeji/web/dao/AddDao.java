package com.itkeji.web.dao;

import com.itkeji.web.entity.Contact;
import com.itkeji.web.utils.DataSourceUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author shkstart
 * @create 2019-04-18 16:16
 */
public class AddDao {
    private JdbcTemplate temp = new JdbcTemplate(DataSourceUtils.getDataSource());

    public void saveContact(Contact contact) {

        String sql = "insert into contact values(?, ?,?,?,?,?,?)";
        temp.update(sql, contact.getId(),contact.getName(),contact.getSex(),contact.getAge(),
                contact.getAddress(),contact.getQq(),contact.getEmail());


    }
}
