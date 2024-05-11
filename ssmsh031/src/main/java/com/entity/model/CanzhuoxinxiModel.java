package com.entity.model;

import com.entity.CanzhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 餐桌信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-02 10:49:52
 */
public class CanzhuoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
