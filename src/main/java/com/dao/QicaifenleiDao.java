package com.dao;

import com.entity.QicaifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicaifenleiVO;
import com.entity.view.QicaifenleiView;


/**
 * 器材分类
 * 
 * @author 
 * @email 
 * @date 2022-04-17 09:20:39
 */
public interface QicaifenleiDao extends BaseMapper<QicaifenleiEntity> {
	
	List<QicaifenleiVO> selectListVO(@Param("ew") Wrapper<QicaifenleiEntity> wrapper);
	
	QicaifenleiVO selectVO(@Param("ew") Wrapper<QicaifenleiEntity> wrapper);
	
	List<QicaifenleiView> selectListView(@Param("ew") Wrapper<QicaifenleiEntity> wrapper);

	List<QicaifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<QicaifenleiEntity> wrapper);
	
	QicaifenleiView selectView(@Param("ew") Wrapper<QicaifenleiEntity> wrapper);
	

}
