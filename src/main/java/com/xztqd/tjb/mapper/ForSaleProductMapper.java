package com.xztqd.tjb.mapper;

import com.xztqd.tjb.po.ForSaleProduct;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ForSaleProductMapper {

    @Insert("insert into ForSaleProduct(FSFLWNO,PPFLWNO,CSTNO,PRONO,SALEAMT,INVALIDDATE,ISCANTRADE) values(#{FSFLWNO},#{PPFLWNO},#{CSTNO},#{PRONO},#{SALEAMT},#{INVALIDDATE},#{ISCANTRADE})")
    public int forSaleProductInsert(ForSaleProduct forSaleProduct);

//    @Delete("delete from ForSaleProduct where ")
//    public int forSaleProductDelete(ForSaleProduct forSaleProduct);
}
