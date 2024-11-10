package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenqicaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenqicaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenqicaiView;


/**
 * 健身器材
 *
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
public interface JianshenqicaiService extends IService<JianshenqicaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenqicaiVO> selectListVO(Wrapper<JianshenqicaiEntity> wrapper);
   	
   	JianshenqicaiVO selectVO(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
   	
   	List<JianshenqicaiView> selectListView(Wrapper<JianshenqicaiEntity> wrapper);
   	
   	JianshenqicaiView selectView(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenqicaiEntity> wrapper);
   	

}

