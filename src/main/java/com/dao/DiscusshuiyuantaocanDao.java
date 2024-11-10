package com.dao;

import com.entity.DiscusshuiyuantaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuiyuantaocanVO;
import com.entity.view.DiscusshuiyuantaocanView;


/**
 * 会员套餐评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-17 09:20:39
 */
public interface DiscusshuiyuantaocanDao extends BaseMapper<DiscusshuiyuantaocanEntity> {
	
	List<DiscusshuiyuantaocanVO> selectListVO(@Param("ew") Wrapper<DiscusshuiyuantaocanEntity> wrapper);
	
	DiscusshuiyuantaocanVO selectVO(@Param("ew") Wrapper<DiscusshuiyuantaocanEntity> wrapper);
	
	List<DiscusshuiyuantaocanView> selectListView(@Param("ew") Wrapper<DiscusshuiyuantaocanEntity> wrapper);

	List<DiscusshuiyuantaocanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuiyuantaocanEntity> wrapper);
	
	DiscusshuiyuantaocanView selectView(@Param("ew") Wrapper<DiscusshuiyuantaocanEntity> wrapper);
	

}
