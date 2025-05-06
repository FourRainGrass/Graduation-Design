package com.xiangmu.controler;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.JubenMapper;
import com.xiangmu.pojo.Juben;
import com.xiangmu.util.JsonResult;

@RestController
public class JubenControler extends BaseController
{

	@Autowired
	private JubenMapper jubenMapper;
	
	@RequestMapping("/jubenAdd")
	public JsonResult<Void> jubenAdd(@RequestBody Juben juben) 
	{
		jubenMapper.insert(juben);
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/jubenMana")
	public JsonResult<List> jubenMana() 
	{
		List jubenList=jubenMapper.select("");
		return new JsonResult<>(66,jubenList);
		
    }
	
	@RequestMapping("/jubenDel")
	public JsonResult<Void> jubenDel(int id) 
	{
		jubenMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/jubenUpdate")
	public JsonResult<Void> update(@RequestBody Juben juben) 
	{
		jubenMapper.update(juben);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/jubenRes")
	public JsonResult<List> jubenRes(String mingcheng) 
	{
		List jubenList=jubenMapper.select(mingcheng.trim());
		return new JsonResult<>(66,jubenList);
		
    }
	
	@RequestMapping("/jubenAll")
	public JsonResult<List> jubenAll(String mingcheng) 
	{
		List jubenList=jubenMapper.select("");
		return new JsonResult<>(66,jubenList);
		
    }
	
	
	@RequestMapping("/jubenDetailQian")
	public JsonResult<Juben> jubenDetailQian(int id) 
	{
		Juben juben=jubenMapper.findByid(id);
		return new JsonResult<>(66,juben);
		
    }
	
	
}
