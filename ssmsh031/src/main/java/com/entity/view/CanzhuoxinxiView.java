package com.entity.view;

import com.entity.CanzhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐桌信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-02 10:49:52
 */
@TableName("canzhuoxinxi")
public class CanzhuoxinxiView  extends CanzhuoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanzhuoxinxiView(){
	}
 
 	public CanzhuoxinxiView(CanzhuoxinxiEntity canzhuoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, canzhuoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
