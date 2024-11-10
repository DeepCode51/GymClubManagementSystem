package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuiyuantaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuiyuantaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuiyuantaocanView;


/**
 * 会员套餐评论表
 *
 * @author 
 * @email 
 * @date 2022-04-17 09:20:39
 */
public interface DiscusshuiyuantaocanService extends IService<DiscusshuiyuantaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuiyuantaocanVO> selectListVO(Wrapper<DiscusshuiyuantaocanEntity> wrapper);
   	
   	DiscusshuiyuantaocanVO selectVO(@Param("ew") Wrapper<DiscusshuiyuantaocanEntity> wrapper);
   	
   	List<DiscusshuiyuantaocanView> selectListView(Wrapper<DiscusshuiyuantaocanEntity> wrapper);
   	
   	DiscusshuiyuantaocanView selectView(@Param("ew") Wrapper<DiscusshuiyuantaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuiyuantaocanEntity> wrapper);
   	

}

