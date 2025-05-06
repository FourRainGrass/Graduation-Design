package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Juben;

@Mapper
public interface JubenMapper
{
	 public int insert(Juben juben);
	 
	 public int delete(int id);
	 
	 public int update(Juben juben);
	 
	 public List select(String mingcheng);
	 
	 public Juben findByid(int id);
}
