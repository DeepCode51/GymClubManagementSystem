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


import com.dao.QicaiyudingDao;
import com.entity.QicaiyudingEntity;
import com.service.QicaiyudingService;
import com.entity.vo.QicaiyudingVO;
import com.entity.view.QicaiyudingView;

@Service("qicaiyudingService")
public class QicaiyudingServiceImpl extends ServiceImpl<QicaiyudingDao, QicaiyudingEntity> implements QicaiyudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicaiyudingEntity> page = this.selectPage(
                new Query<QicaiyudingEntity>(params).getPage(),
                new EntityWrapper<QicaiyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicaiyudingEntity> wrapper) {
		  Page<QicaiyudingView> page =new Query<QicaiyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicaiyudingVO> selectListVO(Wrapper<QicaiyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicaiyudingVO selectVO(Wrapper<QicaiyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicaiyudingView> selectListView(Wrapper<QicaiyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicaiyudingView selectView(Wrapper<QicaiyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
