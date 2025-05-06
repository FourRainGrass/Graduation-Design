package com.xiangmu.controler;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.FangMapper;
import com.xiangmu.mappers.ZuoweiMapper;
import com.xiangmu.pojo.Fang;
import com.xiangmu.util.JsonResult;

@RestController
public class FangControler extends BaseController
{

	@Autowired
	private FangMapper fangMapper;
	
	@Autowired
	private ZuoweiMapper zuoweiMapper;
	
	
	@RequestMapping("/fangAdd")
	public JsonResult<Void> fangAdd(@RequestBody Fang fang) 
	{
		fangMapper.insert(fang);
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/fangMana")
	public JsonResult<List> fangMana() 
	{
		List fangList=fangMapper.select("");
		return new JsonResult<>(66,fangList);
		
    }
	
	@RequestMapping("/fangDel")
	public JsonResult<Void> fangDel(int id) 
	{
		fangMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/fangUpdate")
	public JsonResult<Void> update(@RequestBody Fang fang) 
	{
		fangMapper.update(fang);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/fangRes")
	public JsonResult<List> fangRes(String mingcheng) 
	{
		List fangList=fangMapper.select(mingcheng.trim());
		return new JsonResult<>(66,fangList);
		
    }
	
	@RequestMapping("/fangAll")
	public JsonResult<List> fangAll(String mingcheng) 
	{
		List fangList=fangMapper.select("");
		return new JsonResult<>(66,fangList);
		
    }
	
	
	@RequestMapping("/fangDetailQian")
	public JsonResult<Fang> fangDetailQian(int id) 
	{
		Fang fang=fangMapper.findByid(id);
		fang.setZuoweiList(zuoweiMapper.selectByFang(fang.getId(), ""));
		return new JsonResult<>(66,fang);
		
    }
	
	
}
