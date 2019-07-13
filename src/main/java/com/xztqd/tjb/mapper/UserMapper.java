package com.xztqd.tjb.mapper;

import com.xztqd.tjb.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT hashpassword FROM `User` WHERE userid = #{userid}")
    public String userSelectPassword(String userid);
}
