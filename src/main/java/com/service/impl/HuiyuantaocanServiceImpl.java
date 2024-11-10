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


import com.dao.HuiyuantaocanDao;
import com.entity.HuiyuantaocanEntity;
import com.service.HuiyuantaocanService;
import com.entity.vo.HuiyuantaocanVO;
import com.entity.view.HuiyuantaocanView;

@Service("huiyuantaocanService")
public class HuiyuantaocanServiceImpl extends ServiceImpl<HuiyuantaocanDao, HuiyuantaocanEntity> implements HuiyuantaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuantaocanEntity> page = this.selectPage(
                new Query<HuiyuantaocanEntity>(params).getPage(),
                new EntityWrapper<HuiyuantaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuantaocanEntity> wrapper) {
		  Page<HuiyuantaocanView> page =new Query<HuiyuantaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuantaocanVO> selectListVO(Wrapper<HuiyuantaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuantaocanVO selectVO(Wrapper<HuiyuantaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuantaocanView> selectListView(Wrapper<HuiyuantaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuantaocanView selectView(Wrapper<HuiyuantaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
