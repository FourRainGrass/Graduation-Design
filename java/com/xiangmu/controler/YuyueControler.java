package com.xiangmu.controler;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiangmu.mappers.YuyueMapper;
import com.xiangmu.mappers.FangMapper;
import com.xiangmu.mappers.ZuoweiMapper;
import com.xiangmu.pojo.Gonggao;
import com.xiangmu.pojo.User;
import com.xiangmu.pojo.Yuyue;
import com.xiangmu.util.JsonResult;

@Controller
public class YuyueControler extends BaseController
{

	@Autowired
	private YuyueMapper yuyueMapper;
	
	@Autowired
	private FangMapper fangMapper;
	
	@Autowired
	private ZuoweiMapper zuoweiMapper;
	
	
	@RequestMapping("/yuyueAdd")
	@ResponseBody
	public JsonResult<Yuyue> yuyueAdd(@RequestBody Yuyue yuyue,HttpSession session) 
	{
		User user=(User)session.getAttribute("user");
		if(user==null)
		{
			return new JsonResult<Yuyue>(200);
		}
		
		List list=yuyueMapper.selectByZuoweiAndDuan(yuyue.getFangId(), yuyue.getZuoweiId(), yuyue.getDuan());
		if(list.size()>0)
		{
			return new JsonResult<Yuyue>(300);
		}
		
		yuyueMapper.insert(yuyue);
		
		return new JsonResult<Yuyue>(66,yuyue);
		
		
    }
	
	
	@RequestMapping("/yuyueMine")
	@ResponseBody
	public JsonResult<List> yuyueMine(HttpSession session) 
	{
		User user=(User)session.getAttribute("user");
		if(user==null)
		{
			return new JsonResult<>(200);
		}
		
		int userId=getUidFromSession(session);
		List<Yuyue> yuyueList=yuyueMapper.selectByUser(userId);
		for(Yuyue yuyue:yuyueList)
		{
			yuyue.setFang(fangMapper.findByid(yuyue.getFangId()));
			yuyue.setZuowei(zuoweiMapper.findByid(yuyue.getZuoweiId()));
		}
        
		return new JsonResult<>(66,yuyueList);
		
    }
	
	
	
	@RequestMapping("/fukuanAdd")
	@ResponseBody
	public JsonResult<Void> fukuanAdd(String fkzt,String fkfs,int id) 
	{
		yuyueMapper.update(fkzt, fkfs, id);
        
		return new JsonResult<>(66);
		
    }
	
	
	
	
	
	@RequestMapping("/yuyueDel")
	@ResponseBody
	public JsonResult<Void> yuyueDel(int id) 
	{
		yuyueMapper.delete(id);
		return new JsonResult<Void>(66);
    }
	
	
	@RequestMapping("/yuyueMana")
	@ResponseBody
	public JsonResult<List> yuyueMana() 
	{
		
		List<Yuyue> yuyueList=yuyueMapper.select("", "");
		for(Yuyue yuyue:yuyueList)
		{
			yuyue.setFang(fangMapper.findByid(yuyue.getFangId()));
			yuyue.setZuowei(zuoweiMapper.findByid(yuyue.getZuoweiId()));
		}
        
		return new JsonResult<>(66,yuyueList);
		
    }
	
	
	
	@RequestMapping("/yuyueRes")
	@ResponseBody
	public JsonResult<List> yuyueRes(String riqi,String xingming) 
	{
		
		List<Yuyue> yuyueList=yuyueMapper.select(riqi, xingming.trim());
		for(Yuyue yuyue:yuyueList)
		{
			yuyue.setFang(fangMapper.findByid(yuyue.getFangId()));
			yuyue.setZuowei(zuoweiMapper.findByid(yuyue.getZuoweiId()));
		}
        
		return new JsonResult<>(66,yuyueList);
		
    }
	
}
