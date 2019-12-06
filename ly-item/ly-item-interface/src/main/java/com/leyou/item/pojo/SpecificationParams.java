package com.leyou.item.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_spec_param")
public class SpecificationParams {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long cid;
	private Long group_id;
	private String name;
	@Column(name = "`numeric`", nullable = false) 
	private Boolean numeric;
	private String unit;
	private Boolean generic;
	private Boolean searching;
	private String segments;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getNumeric() {
		return numeric;
	}
	public void setNumeric(Boolean numeric) {
		this.numeric = numeric;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Boolean getGeneric() {
		return generic;
	}
	public void setGeneric(Boolean generic) {
		this.generic = generic;
	}
	public Boolean getSearching() {
		return searching;
	}
	public void setSearching(Boolean searching) {
		this.searching = searching;
	}
	public String getSegments() {
		return segments;
	}
	public void setSegments(String segments) {
		this.segments = segments;
	}
	
	
}
