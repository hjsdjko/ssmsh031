package com.entity.view;

import com.entity.CanzhuoyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐桌预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-02 10:49:53
 */
@TableName("canzhuoyuding")
public class CanzhuoyudingView  extends CanzhuoyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanzhuoyudingView(){
	}
 
 	public CanzhuoyudingView(CanzhuoyudingEntity canzhuoyudingEntity){
 	try {
			BeanUtils.copyProperties(this, canzhuoyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
