package com.dao;

import com.entity.HuiyuanbanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanbanliVO;
import com.entity.view.HuiyuanbanliView;


/**
 * 会员办理
 * 
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
public interface HuiyuanbanliDao extends BaseMapper<HuiyuanbanliEntity> {
	
	List<HuiyuanbanliVO> selectListVO(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
	
	HuiyuanbanliVO selectVO(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
	
	List<HuiyuanbanliView> selectListView(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);

	List<HuiyuanbanliView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
	
	HuiyuanbanliView selectView(@Param("ew") Wrapper<HuiyuanbanliEntity> wrapper);
	

}
