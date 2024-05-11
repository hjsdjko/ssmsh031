package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanzhuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanzhuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanzhuoxinxiView;


/**
 * 餐桌信息
 *
 * @author 
 * @email 
 * @date 2022-04-02 10:49:52
 */
public interface CanzhuoxinxiService extends IService<CanzhuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanzhuoxinxiVO> selectListVO(Wrapper<CanzhuoxinxiEntity> wrapper);
   	
   	CanzhuoxinxiVO selectVO(@Param("ew") Wrapper<CanzhuoxinxiEntity> wrapper);
   	
   	List<CanzhuoxinxiView> selectListView(Wrapper<CanzhuoxinxiEntity> wrapper);
   	
   	CanzhuoxinxiView selectView(@Param("ew") Wrapper<CanzhuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanzhuoxinxiEntity> wrapper);
   	

}

