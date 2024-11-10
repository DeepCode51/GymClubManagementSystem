package com.dao;

import com.entity.HuiyuantaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuantaocanVO;
import com.entity.view.HuiyuantaocanView;


/**
 * 会员套餐
 * 
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
public interface HuiyuantaocanDao extends BaseMapper<HuiyuantaocanEntity> {
	
	List<HuiyuantaocanVO> selectListVO(@Param("ew") Wrapper<HuiyuantaocanEntity> wrapper);
	
	HuiyuantaocanVO selectVO(@Param("ew") Wrapper<HuiyuantaocanEntity> wrapper);
	
	List<HuiyuantaocanView> selectListView(@Param("ew") Wrapper<HuiyuantaocanEntity> wrapper);

	List<HuiyuantaocanView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuantaocanEntity> wrapper);
	
	HuiyuantaocanView selectView(@Param("ew") Wrapper<HuiyuantaocanEntity> wrapper);
	

}
