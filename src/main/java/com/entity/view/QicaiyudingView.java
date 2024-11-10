package com.entity.view;

import com.entity.QicaiyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 器材预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
@TableName("qicaiyuding")
public class QicaiyudingView  extends QicaiyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicaiyudingView(){
	}
 
 	public QicaiyudingView(QicaiyudingEntity qicaiyudingEntity){
 	try {
			BeanUtils.copyProperties(this, qicaiyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
