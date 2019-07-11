package com.xztqd.tjb.dao;

import com.xztqd.tjb.bean.PersonProduct;
import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public class PersonProductDaoImpl implements PersonProductDao {
    private static final Logger _logger = LoggerFactory.getLogger(PersonProductDaoImpl.class) ;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<PersonProduct> select() {
        RowMapper<PersonProduct> rowMapper = new BeanPropertyRowMapper<PersonProduct>(PersonProduct.class);
        List<PersonProduct> personProduct =jdbcTemplate.query("select * from PersonProduct",rowMapper);
        return personProduct;
    }
}
