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


import com.dao.QicaifenleiDao;
import com.entity.QicaifenleiEntity;
import com.service.QicaifenleiService;
import com.entity.vo.QicaifenleiVO;
import com.entity.view.QicaifenleiView;

@Service("qicaifenleiService")
public class QicaifenleiServiceImpl extends ServiceImpl<QicaifenleiDao, QicaifenleiEntity> implements QicaifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicaifenleiEntity> page = this.selectPage(
                new Query<QicaifenleiEntity>(params).getPage(),
                new EntityWrapper<QicaifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicaifenleiEntity> wrapper) {
		  Page<QicaifenleiView> page =new Query<QicaifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicaifenleiVO> selectListVO(Wrapper<QicaifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicaifenleiVO selectVO(Wrapper<QicaifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicaifenleiView> selectListView(Wrapper<QicaifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicaifenleiView selectView(Wrapper<QicaifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
