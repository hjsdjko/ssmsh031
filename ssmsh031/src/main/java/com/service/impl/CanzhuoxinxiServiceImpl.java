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


import com.dao.CanzhuoxinxiDao;
import com.entity.CanzhuoxinxiEntity;
import com.service.CanzhuoxinxiService;
import com.entity.vo.CanzhuoxinxiVO;
import com.entity.view.CanzhuoxinxiView;

@Service("canzhuoxinxiService")
public class CanzhuoxinxiServiceImpl extends ServiceImpl<CanzhuoxinxiDao, CanzhuoxinxiEntity> implements CanzhuoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanzhuoxinxiEntity> page = this.selectPage(
                new Query<CanzhuoxinxiEntity>(params).getPage(),
                new EntityWrapper<CanzhuoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanzhuoxinxiEntity> wrapper) {
		  Page<CanzhuoxinxiView> page =new Query<CanzhuoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanzhuoxinxiVO> selectListVO(Wrapper<CanzhuoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanzhuoxinxiVO selectVO(Wrapper<CanzhuoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanzhuoxinxiView> selectListView(Wrapper<CanzhuoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanzhuoxinxiView selectView(Wrapper<CanzhuoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
