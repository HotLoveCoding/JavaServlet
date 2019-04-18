package com.itkeji.web.dao;

import com.itkeji.web.utils.DataSourceUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author shkstart
 * @create 2019-04-18 20:29
 */
public class DeleteDao {
    private JdbcTemplate temp = new JdbcTemplate(DataSourceUtils.getDataSource());
    public void delete(int id) {
        String sql = "delete from contact where id = ?";
           temp.update(sql,  id);


    }
}
