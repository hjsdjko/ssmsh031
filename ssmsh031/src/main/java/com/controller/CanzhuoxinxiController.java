package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CanzhuoxinxiEntity;
import com.entity.view.CanzhuoxinxiView;

import com.service.CanzhuoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 餐桌信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-02 10:49:52
 */
@RestController
@RequestMapping("/canzhuoxinxi")
public class CanzhuoxinxiController {
    @Autowired
    private CanzhuoxinxiService canzhuoxinxiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CanzhuoxinxiEntity canzhuoxinxi, 
		HttpServletRequest request){

        EntityWrapper<CanzhuoxinxiEntity> ew = new EntityWrapper<CanzhuoxinxiEntity>();
		PageUtils page = canzhuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canzhuoxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CanzhuoxinxiEntity canzhuoxinxi, 
		HttpServletRequest request){
        EntityWrapper<CanzhuoxinxiEntity> ew = new EntityWrapper<CanzhuoxinxiEntity>();
		PageUtils page = canzhuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canzhuoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CanzhuoxinxiEntity canzhuoxinxi){
       	EntityWrapper<CanzhuoxinxiEntity> ew = new EntityWrapper<CanzhuoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( canzhuoxinxi, "canzhuoxinxi")); 
        return R.ok().put("data", canzhuoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CanzhuoxinxiEntity canzhuoxinxi){
        EntityWrapper< CanzhuoxinxiEntity> ew = new EntityWrapper< CanzhuoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( canzhuoxinxi, "canzhuoxinxi")); 
		CanzhuoxinxiView canzhuoxinxiView =  canzhuoxinxiService.selectView(ew);
		return R.ok("查询餐桌信息成功").put("data", canzhuoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CanzhuoxinxiEntity canzhuoxinxi = canzhuoxinxiService.selectById(id);
        return R.ok().put("data", canzhuoxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CanzhuoxinxiEntity canzhuoxinxi = canzhuoxinxiService.selectById(id);
        return R.ok().put("data", canzhuoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CanzhuoxinxiEntity canzhuoxinxi, HttpServletRequest request){
    	canzhuoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canzhuoxinxi);

        canzhuoxinxiService.insert(canzhuoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CanzhuoxinxiEntity canzhuoxinxi, HttpServletRequest request){
    	canzhuoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canzhuoxinxi);

        canzhuoxinxiService.insert(canzhuoxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CanzhuoxinxiEntity canzhuoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(canzhuoxinxi);
        canzhuoxinxiService.updateById(canzhuoxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        canzhuoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CanzhuoxinxiEntity> wrapper = new EntityWrapper<CanzhuoxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = canzhuoxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
