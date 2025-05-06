package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Zuowei;

@Mapper
public interface ZuoweiMapper
{
	 public int insert(Zuowei zuowei);
	 
	 public int delete(int id);
	 
	 public int update(Zuowei zuowei);
	 
	 public List select(String bianhao);
	 
	 public List selectByFang(int fangId,String bianhao);
	 
	 public Zuowei findByid(int id);
	 
}
