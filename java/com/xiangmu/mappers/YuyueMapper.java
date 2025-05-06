package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Gonggao;
import com.xiangmu.pojo.Yuyue;


@Mapper
public interface YuyueMapper
{
	 public int insert(Yuyue yuyue);
	 
	 public int delete(int id);
	 
	 public int update(String fkzt,String fkfs,int id);
	 
	 public List select(String riqi,String xingming);
	 
	 public List selectByZuoweiAndDuan(int fangId,int zuoweiId,String duan);
	 
	 public List selectByUser(int userId);
	 
	 public Yuyue findById(int id);
	 
	 
}
