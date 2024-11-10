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


import com.dao.DiscusshuiyuantaocanDao;
import com.entity.DiscusshuiyuantaocanEntity;
import com.service.DiscusshuiyuantaocanService;
import com.entity.vo.DiscusshuiyuantaocanVO;
import com.entity.view.DiscusshuiyuantaocanView;

@Service("discusshuiyuantaocanService")
public class DiscusshuiyuantaocanServiceImpl extends ServiceImpl<DiscusshuiyuantaocanDao, DiscusshuiyuantaocanEntity> implements DiscusshuiyuantaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuiyuantaocanEntity> page = this.selectPage(
                new Query<DiscusshuiyuantaocanEntity>(params).getPage(),
                new EntityWrapper<DiscusshuiyuantaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuiyuantaocanEntity> wrapper) {
		  Page<DiscusshuiyuantaocanView> page =new Query<DiscusshuiyuantaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuiyuantaocanVO> selectListVO(Wrapper<DiscusshuiyuantaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuiyuantaocanVO selectVO(Wrapper<DiscusshuiyuantaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuiyuantaocanView> selectListView(Wrapper<DiscusshuiyuantaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuiyuantaocanView selectView(Wrapper<DiscusshuiyuantaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
