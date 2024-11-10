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


import com.dao.HuiyuanbanliDao;
import com.entity.HuiyuanbanliEntity;
import com.service.HuiyuanbanliService;
import com.entity.vo.HuiyuanbanliVO;
import com.entity.view.HuiyuanbanliView;

@Service("huiyuanbanliService")
public class HuiyuanbanliServiceImpl extends ServiceImpl<HuiyuanbanliDao, HuiyuanbanliEntity> implements HuiyuanbanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanbanliEntity> page = this.selectPage(
                new Query<HuiyuanbanliEntity>(params).getPage(),
                new EntityWrapper<HuiyuanbanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanbanliEntity> wrapper) {
		  Page<HuiyuanbanliView> page =new Query<HuiyuanbanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanbanliVO> selectListVO(Wrapper<HuiyuanbanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanbanliVO selectVO(Wrapper<HuiyuanbanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanbanliView> selectListView(Wrapper<HuiyuanbanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanbanliView selectView(Wrapper<HuiyuanbanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
