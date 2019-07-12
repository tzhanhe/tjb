package com.xztqd.tjb.mapper;


import com.xztqd.tjb.po.PersonProduct;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonProductMapper {
    //0insert
    @Insert("insert into PersonProduct(ppflwno,cstno,prono,buyamt,buydate,enddate,prostate) values(#{ppflwno},#{cstno},#{prono},#{buyamt},#{buydate},#{enddate},#{prostate})")
    public int personProductInsert(PersonProduct personProduct);
    //1delete
    @Delete("delete from PersonProduct where ppflwno = #{ppflwno}")
    public int personProductDelete(String ppflwno);
    //2update
    @Update("update PersonProduct set prostate = #{prostate} where ppflwno = #{ppflwno}")
    public int personProductUpdate(PersonProduct personProduct);
    //3selectOne
    @Select("select * from PersonProduct where title=#{title} and content =#{content} limit 1 ")
    public PersonProduct personProductSelectOne(PersonProduct personProduct);
    //4selectAll
    @Select("select * from PersonProduct order by id desc limit #{np},#{size}")
    public List<PersonProduct> personProductSelectAll(@Param("np") int np,@Param("size") int size);
}
