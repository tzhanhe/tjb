package com.xztqd.tjb.mapper;


import com.xztqd.tjb.po.PersonProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonProductMapper {
    @Select("select * from PersonProduct where CSTNO = #{cstno}")
    public List<PersonProduct> queryPersonProduct(String cstno);
}
