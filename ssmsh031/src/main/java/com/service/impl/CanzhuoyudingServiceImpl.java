package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CanzhuoyudingDao;
import com.entity.CanzhuoyudingEntity;
import com.service.CanzhuoyudingService;
import com.entity.vo.CanzhuoyudingVO;
import com.entity.view.CanzhuoyudingView;

@Service("canzhuoyudingService")
public class CanzhuoyudingServiceImpl extends ServiceImpl<CanzhuoyudingDao, CanzhuoyudingEntity> implements CanzhuoyudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanzhuoyudingEntity> page = this.selectPage(
                new Query<CanzhuoyudingEntity>(params).getPage(),
                new EntityWrapper<CanzhuoyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanzhuoyudingEntity> wrapper) {
		  Page<CanzhuoyudingView> page =new Query<CanzhuoyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanzhuoyudingVO> selectListVO(Wrapper<CanzhuoyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanzhuoyudingVO selectVO(Wrapper<CanzhuoyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanzhuoyudingView> selectListView(Wrapper<CanzhuoyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanzhuoyudingView selectView(Wrapper<CanzhuoyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
