package com.dao;

import com.entity.QicaiyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicaiyudingVO;
import com.entity.view.QicaiyudingView;


/**
 * 器材预订
 * 
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
public interface QicaiyudingDao extends BaseMapper<QicaiyudingEntity> {
	
	List<QicaiyudingVO> selectListVO(@Param("ew") Wrapper<QicaiyudingEntity> wrapper);
	
	QicaiyudingVO selectVO(@Param("ew") Wrapper<QicaiyudingEntity> wrapper);
	
	List<QicaiyudingView> selectListView(@Param("ew") Wrapper<QicaiyudingEntity> wrapper);

	List<QicaiyudingView> selectListView(Pagination page,@Param("ew") Wrapper<QicaiyudingEntity> wrapper);
	
	QicaiyudingView selectView(@Param("ew") Wrapper<QicaiyudingEntity> wrapper);
	

}
