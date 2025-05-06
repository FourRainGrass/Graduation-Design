package com.xiangmu.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Chanpin
{
	private Integer id;
	private Integer userId;
	private Integer leibieId;
	private String mingcheng;
	
	private String jieshao;
	private String fujian;
	private String fujianYuan;
	private Integer jiage;
	
	private String beizhu;
	private Integer shuliang;
	private String zt;
	private String del;
	
	private User user;
	
	private int xiaoliang;
	private int zongjine;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getXiaoliang() {
		return xiaoliang;
	}
	public void setXiaoliang(int xiaoliang) {
		this.xiaoliang = xiaoliang;
	}
	public int getZongjine() {
		return zongjine;
	}
	public void setZongjine(int zongjine) {
		this.zongjine = zongjine;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public Integer getLeibieId() {
		return leibieId;
	}
	public void setLeibieId(Integer leibieId) {
		this.leibieId = leibieId;
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
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getShuliang() {
		return shuliang;
	}
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	public String getFujianYuan() {
		return fujianYuan;
	}
	public void setFujianYuan(String fujianYuan) {
		this.fujianYuan = fujianYuan;
	}
	public Integer getJiage() {
		return jiage;
	}
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	
	
}