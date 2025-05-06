package com.xiangmu.pojo;

import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Fang
{
	private Integer id;
	private String mingcheng;
	private String jieshao;
	private String fujian;
	
	private String fujianYuan;
	private String del;
	
	private List<Zuowei> zuoweiList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMingcheng() {
		return mingcheng;
	}
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	public String getJieshao() {
		return jieshao;
	}
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	public String getFujian() {
		return fujian;
	}
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	public List<Zuowei> getZuoweiList() {
		return zuoweiList;
	}
	public void setZuoweiList(List<Zuowei> zuoweiList) {
		this.zuoweiList = zuoweiList;
	}
	public String getFujianYuan() {
		return fujianYuan;
	}
	public void setFujianYuan(String fujianYuan) {
		this.fujianYuan = fujianYuan;
	}
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	
}