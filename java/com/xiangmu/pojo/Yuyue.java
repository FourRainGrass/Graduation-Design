package com.xiangmu.pojo;



import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Yuyue
{
	private int id;
	private int userId;
	private int fangId;
	private int zuoweiId;
	
	private String riqi;
	private String duan;
	private String beizhu;
	private String xingming;
	
	private String dianhua;
	private int feiyong;
	private String fkzt;
	private String fkfs;
	
	private Fang fang;
	private Zuowei Zuowei;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public String getFkzt() {
		return fkzt;
	}

	public void setFkzt(String fkzt) {
		this.fkzt = fkzt;
	}

	public String getFkfs() {
		return fkfs;
	}

	public void setFkfs(String fkfs) {
		this.fkfs = fkfs;
	}

	public int getFeiyong() {
		return feiyong;
	}

	public void setFeiyong(int feiyong) {
		this.feiyong = feiyong;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getZuoweiId() {
		return zuoweiId;
	}

	public void setZuoweiId(int zuoweiId) {
		this.zuoweiId = zuoweiId;
	}

	public String getRiqi() {
		return riqi;
	}

	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}


	public int getFangId() {
		return fangId;
	}

	public void setFangId(int fangId) {
		this.fangId = fangId;
	}

	public Fang getFang() {
		return fang;
	}

	public void setFang(Fang fang) {
		this.fang = fang;
	}

	public String getDuan() {
		return duan;
	}

	public void setDuan(String duan) {
		this.duan = duan;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getXingming() {
		return xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}

	public String getDianhua() {
		return dianhua;
	}

	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}

	public Zuowei getZuowei() {
		return Zuowei;
	}

	public void setZuowei(Zuowei zuowei) {
		Zuowei = zuowei;
	}
	
}

