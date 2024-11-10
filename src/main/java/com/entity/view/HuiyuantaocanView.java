package com.entity.view;

import com.entity.HuiyuantaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员套餐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
@TableName("huiyuantaocan")
public class HuiyuantaocanView  extends HuiyuantaocanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuantaocanView(){
	}
 
 	public HuiyuantaocanView(HuiyuantaocanEntity huiyuantaocanEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuantaocanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
