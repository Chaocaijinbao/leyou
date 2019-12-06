package com.leyou.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leyou.item.mapper.SpecificationGroupMapper;
import com.leyou.item.mapper.SpecificationParamsMapper;
import com.leyou.item.pojo.SpecificationGroups;
import com.leyou.item.pojo.SpecificationParams;

@Service
public class SpecificationService {

	@Autowired
	private SpecificationGroupMapper specificationGroupMapper;
	
	@Autowired
	private SpecificationParamsMapper specificationParamsMapper;
	
	public List<SpecificationGroups> querySpecificationGroupByCategoryId(Long cid) {
		SpecificationGroups record=new SpecificationGroups();
		record.setCid(cid);
		return this.specificationGroupMapper.select(record);
	}
	
	public List<SpecificationParams> querySpecificationParamsByGroupId(Long gid){
		SpecificationParams record =new SpecificationParams();
		record.setGroup_id(gid);
		return this.specificationParamsMapper.select(record);
	}
}
