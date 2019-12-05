package com.leyou.item.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.common.Mapper;


public interface CategoryMapper extends Mapper<Category> {
	
	@Select("SELECT * FROM tb_category WHERE id IN (SELECT category_id FROM tb_category_brand WHERE brand_id = #{bid})")
	List<Category> queryCategoryByBrandId(Long bid);
}
