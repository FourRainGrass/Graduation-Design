package com.xiangmu.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Zuowei
{
	private Integer id;
	private Integer fangId;
	private String bianhao;
	private String del;
	
	private Fang fang;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getBianhao() {
		return bianhao;
	}

	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}

	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}

	public Integer getFangId() {
		return fangId;
	}

	public void setFangId(Integer fangId) {
		this.fangId = fangId;
	}

	public Fang getFang() {
		return fang;
	}

	public void setFang(Fang fang) {
		this.fang = fang;
	}

	
}