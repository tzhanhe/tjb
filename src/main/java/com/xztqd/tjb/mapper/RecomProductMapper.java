package com.xztqd.tjb.mapper;

import com.xztqd.tjb.po.RecomProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecomProductMapper {
    @Select("select * from recomProduct")
    public List<RecomProduct> queryRecom();

//    @Update("update FinProdyct set INITMONEY = #{money} where id = #{id}" )
//    public int FinUpdate(int money,String id);
}
