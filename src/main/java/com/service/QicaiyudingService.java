package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicaiyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicaiyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaiyudingView;


/**
 * 器材预订
 *
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
public interface QicaiyudingService extends IService<QicaiyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicaiyudingVO> selectListVO(Wrapper<QicaiyudingEntity> wrapper);
   	
   	QicaiyudingVO selectVO(@Param("ew") Wrapper<QicaiyudingEntity> wrapper);
   	
   	List<QicaiyudingView> selectListView(Wrapper<QicaiyudingEntity> wrapper);
   	
   	QicaiyudingView selectView(@Param("ew") Wrapper<QicaiyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicaiyudingEntity> wrapper);
   	

}

