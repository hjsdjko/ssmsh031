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
 * 餐桌信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-02 10:49:52
 */
@TableName("canzhuoxinxi")
public class CanzhuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanzhuoxinxiEntity() {
		
	}
	
	public CanzhuoxinxiEntity(T t) {
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
	 * 餐桌状态
	 */
					
	private String canzhuozhuangtai;
	
	/**
	 * 预订说明
	 */
					
	private String yudingshuoming;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	
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
	 * 设置：餐桌状态
	 */
	public void setCanzhuozhuangtai(String canzhuozhuangtai) {
		this.canzhuozhuangtai = canzhuozhuangtai;
	}
	/**
	 * 获取：餐桌状态
	 */
	public String getCanzhuozhuangtai() {
		return canzhuozhuangtai;
	}
	/**
	 * 设置：预订说明
	 */
	public void setYudingshuoming(String yudingshuoming) {
		this.yudingshuoming = yudingshuoming;
	}
	/**
	 * 获取：预订说明
	 */
	public String getYudingshuoming() {
		return yudingshuoming;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}

}
