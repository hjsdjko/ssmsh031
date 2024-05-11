package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanzhuoyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanzhuoyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanzhuoyudingView;


/**
 * 餐桌预订
 *
 * @author 
 * @email 
 * @date 2022-04-02 10:49:53
 */
public interface CanzhuoyudingService extends IService<CanzhuoyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanzhuoyudingVO> selectListVO(Wrapper<CanzhuoyudingEntity> wrapper);
   	
   	CanzhuoyudingVO selectVO(@Param("ew") Wrapper<CanzhuoyudingEntity> wrapper);
   	
   	List<CanzhuoyudingView> selectListView(Wrapper<CanzhuoyudingEntity> wrapper);
   	
   	CanzhuoyudingView selectView(@Param("ew") Wrapper<CanzhuoyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanzhuoyudingEntity> wrapper);
   	

}

