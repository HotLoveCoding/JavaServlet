package com.itkeji.web.dao;

import com.itkeji.web.entity.Contact;
import com.itkeji.web.utils.DataSourceUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author shkstart
 * @create 2019-04-18 16:52
 */
public class UpdateDao {
    private JdbcTemplate temp = new JdbcTemplate(DataSourceUtils.getDataSource());
    public void update(Contact contact) {

        String sql= "update contact set sex = ?,age = ? ,address = ? ,qq = ? ,email = ? where id = ?";


        temp.update(sql,contact.getSex(),contact.getAge(),contact.getAddress(),contact.getQq(),
                contact.getEmail(),contact.getId());
    }
}
