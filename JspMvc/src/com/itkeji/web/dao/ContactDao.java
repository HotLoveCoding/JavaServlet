package com.itkeji.web.dao;

import com.itkeji.web.entity.Contact;
import com.itkeji.web.utils.DataSourceUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-18 15:17
 */
public class ContactDao {
    private JdbcTemplate temp = new JdbcTemplate(DataSourceUtils.getDataSource());

    public List<Contact> findAll() {
        String sql = "select * from contact ";

        return temp.query(sql, new BeanPropertyRowMapper<>(Contact.class));
    }
}
