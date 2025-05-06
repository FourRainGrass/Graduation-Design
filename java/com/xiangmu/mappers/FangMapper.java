package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Fang;

@Mapper
public interface FangMapper
{
	 public int insert(Fang fang);
	 
	 public int delete(int id);
	 
	 public int update(Fang fang);
	 
	 public List select(String mingcheng);
	 
	 public Fang findByid(int id);
}
