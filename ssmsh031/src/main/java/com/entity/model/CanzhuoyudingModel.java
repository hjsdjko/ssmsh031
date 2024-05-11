package com.entity.model;

import com.entity.CanzhuoyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 餐桌预订
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-02 10:49:53
 */
public class CanzhuoyudingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
