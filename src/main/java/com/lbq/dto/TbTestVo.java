package com.lbq.dto;

import java.util.Date;

public class TbTestVo {

	private Long id;
	
	private String name;
	
	private Integer age;
	
	private Date createTime;
	
	private Integer sort;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "tbTest [id=" + id + ", name=" + name + ", age=" + age + ", createTime=" + createTime + ", sort=" + sort
				+ "]";
	}
	
}
