package com.leyou.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leyou.item.pojo.SpecificationGroups;
import com.leyou.item.pojo.SpecificationParams;
import com.leyou.item.service.SpecificationService;

@RestController
@RequestMapping("spec")
public class SpecificationController {
	@Autowired
    private SpecificationService specificationService;
	
	@GetMapping("groups/{cid}")
	public ResponseEntity<List<SpecificationGroups>> querySpecificationGroupByCategoryId(@PathVariable("cid")Long cid){
		List<SpecificationGroups> specGroup=this.specificationService.querySpecificationGroupByCategoryId(cid);
		if(specGroup==null||specGroup.size()<1) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(specGroup);
	}
	
	@GetMapping("params")
	public ResponseEntity<List<SpecificationParams>> querySpecificationParamsByGroupId(@RequestParam("gid")Long gid){
		List<SpecificationParams> specParams=this.specificationService.querySpecificationParamsByGroupId(gid);
		if(specParams==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(specParams);
	}
	
}
