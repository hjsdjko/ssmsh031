package com.dao;

import com.entity.CanzhuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanzhuoxinxiVO;
import com.entity.view.CanzhuoxinxiView;


/**
 * 餐桌信息
 * 
 * @author 
 * @email 
 * @date 2022-04-02 10:49:52
 */
public interface CanzhuoxinxiDao extends BaseMapper<CanzhuoxinxiEntity> {
	
	List<CanzhuoxinxiVO> selectListVO(@Param("ew") Wrapper<CanzhuoxinxiEntity> wrapper);
	
	CanzhuoxinxiVO selectVO(@Param("ew") Wrapper<CanzhuoxinxiEntity> wrapper);
	
	List<CanzhuoxinxiView> selectListView(@Param("ew") Wrapper<CanzhuoxinxiEntity> wrapper);

	List<CanzhuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CanzhuoxinxiEntity> wrapper);
	
	CanzhuoxinxiView selectView(@Param("ew") Wrapper<CanzhuoxinxiEntity> wrapper);
	

}
