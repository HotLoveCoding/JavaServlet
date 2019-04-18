package com.itkeji.web.dao;

import com.itkeji.web.entity.Contact;
import com.itkeji.web.utils.DataSourceUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author shkstart
 * @create 2019-04-18 17:05
 */
public class QueryDao {
    private JdbcTemplate temp = new JdbcTemplate(DataSourceUtils.getDataSource());

    public Contact findById(int id) {
        String sql = " select * from contact where id = ?";

        Contact contact = temp.queryForObject(sql, new BeanPropertyRowMapper<>(Contact.class), id);

        return contact;
    }
}
