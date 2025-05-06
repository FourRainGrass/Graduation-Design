package com.xiangmu.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.ZuoweiMapper;
import com.xiangmu.pojo.Zuowei;
import com.xiangmu.util.JsonResult;

@RestController
public class ZuoweiControler extends BaseController
{

	@Autowired
	private ZuoweiMapper zuoweiMapper;
	
	@RequestMapping("/zuoweiAdd")
	public JsonResult<Void> zuoweiAdd(@RequestBody Zuowei zuowei) 
	{
		List zuoweiList=zuoweiMapper.selectByFang(zuowei.getFangId(),zuowei.getBianhao()); 
		if(zuoweiList.size()>0)
		{
			return new JsonResult<>(200);
		}
		zuoweiMapper.insert(zuowei);
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/zuoweiByfang")
	public JsonResult<List> zuoweiByfang(int fangId,String bianhao) 
	{
		System.out.println(fangId+"&&&&&&&&&&");
		List<Zuowei> zuoweiList=zuoweiMapper.selectByFang(fangId,"");
		for(Zuowei zuowei :zuoweiList)
		{
			
		}
		
		return new JsonResult<>(66,zuoweiList);
		
    }
	
	@RequestMapping("/zuoweiDel")
	public JsonResult<Void> zuoweiDel(int id) 
	{
		zuoweiMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/zuoweiUpdate")
	public JsonResult<Void> update(@RequestBody Zuowei zuowei) 
	{
		List zuoweiList=zuoweiMapper.selectByFang(zuowei.getFangId(),zuowei.getBianhao()); 
		if(zuoweiList.size()>0)
		{
			return new JsonResult<>(200);
		}
		
		zuoweiMapper.update(zuowei);
		return new JsonResult<>(66);
    }
	
}
