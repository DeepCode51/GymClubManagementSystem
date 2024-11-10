package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuantaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuantaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuantaocanView;


/**
 * 会员套餐
 *
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
public interface HuiyuantaocanService extends IService<HuiyuantaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuantaocanVO> selectListVO(Wrapper<HuiyuantaocanEntity> wrapper);
   	
   	HuiyuantaocanVO selectVO(@Param("ew") Wrapper<HuiyuantaocanEntity> wrapper);
   	
   	List<HuiyuantaocanView> selectListView(Wrapper<HuiyuantaocanEntity> wrapper);
   	
   	HuiyuantaocanView selectView(@Param("ew") Wrapper<HuiyuantaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuantaocanEntity> wrapper);
   	

}

