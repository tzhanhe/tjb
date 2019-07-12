package com.xztqd.tjb.dao;

import com.xztqd.tjb.bean.RecomProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("recomProductDao")
public class RecomProductDaoImpl implements RecomProductDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<RecomProduct> query() {
        RowMapper<RecomProduct> rowMapper = new BeanPropertyRowMapper<RecomProduct>(RecomProduct.class);
        List<RecomProduct> recomProducts = jdbcTemplate.query("select * from recomProduct",rowMapper);
        return recomProducts;
    }
}
