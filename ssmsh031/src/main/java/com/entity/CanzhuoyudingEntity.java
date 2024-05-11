package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 餐桌预订
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-02 10:49:53
 */
@TableName("canzhuoyuding")
public class CanzhuoyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanzhuoyudingEntity() {
		
	}
	
	public CanzhuoyudingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 开桌编号
	 */
					
	private String kaizhuobianhao;
	
	/**
	 * 餐桌编号
	 */
					
	private String canzhuobianhao;
	
	/**
	 * 餐桌图片
	 */
					
	private String canzhuotupian;
	
	/**
	 * 餐桌类型
	 */
					
	private String canzhuoleixing;
	
	/**
	 * 开桌时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date kaizhuoshijian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：开桌编号
	 */
	public void setKaizhuobianhao(String kaizhuobianhao) {
		this.kaizhuobianhao = kaizhuobianhao;
	}
	/**
	 * 获取：开桌编号
	 */
	public String getKaizhuobianhao() {
		return kaizhuobianhao;
	}
	/**
	 * 设置：餐桌编号
	 */
	public void setCanzhuobianhao(String canzhuobianhao) {
		this.canzhuobianhao = canzhuobianhao;
	}
	/**
	 * 获取：餐桌编号
	 */
	public String getCanzhuobianhao() {
		return canzhuobianhao;
	}
	/**
	 * 设置：餐桌图片
	 */
	public void setCanzhuotupian(String canzhuotupian) {
		this.canzhuotupian = canzhuotupian;
	}
	/**
	 * 获取：餐桌图片
	 */
	public String getCanzhuotupian() {
		return canzhuotupian;
	}
	/**
	 * 设置：餐桌类型
	 */
	public void setCanzhuoleixing(String canzhuoleixing) {
		this.canzhuoleixing = canzhuoleixing;
	}
	/**
	 * 获取：餐桌类型
	 */
	public String getCanzhuoleixing() {
		return canzhuoleixing;
	}
	/**
	 * 设置：开桌时间
	 */
	public void setKaizhuoshijian(Date kaizhuoshijian) {
		this.kaizhuoshijian = kaizhuoshijian;
	}
	/**
	 * 获取：开桌时间
	 */
	public Date getKaizhuoshijian() {
		return kaizhuoshijian;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
