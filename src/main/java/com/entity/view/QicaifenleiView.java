package com.entity.view;

import com.entity.QicaifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 器材分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-17 09:20:39
 */
@TableName("qicaifenlei")
public class QicaifenleiView  extends QicaifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicaifenleiView(){
	}
 
 	public QicaifenleiView(QicaifenleiEntity qicaifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, qicaifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
