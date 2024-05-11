package com.dao;

import com.entity.CanzhuoyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanzhuoyudingVO;
import com.entity.view.CanzhuoyudingView;


/**
 * 餐桌预订
 * 
 * @author 
 * @email 
 * @date 2022-04-02 10:49:53
 */
public interface CanzhuoyudingDao extends BaseMapper<CanzhuoyudingEntity> {
	
	List<CanzhuoyudingVO> selectListVO(@Param("ew") Wrapper<CanzhuoyudingEntity> wrapper);
	
	CanzhuoyudingVO selectVO(@Param("ew") Wrapper<CanzhuoyudingEntity> wrapper);
	
	List<CanzhuoyudingView> selectListView(@Param("ew") Wrapper<CanzhuoyudingEntity> wrapper);

	List<CanzhuoyudingView> selectListView(Pagination page,@Param("ew") Wrapper<CanzhuoyudingEntity> wrapper);
	
	CanzhuoyudingView selectView(@Param("ew") Wrapper<CanzhuoyudingEntity> wrapper);
	

}
