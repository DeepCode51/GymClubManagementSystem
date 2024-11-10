package com.entity.vo;

import com.entity.JianshenqicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 健身器材
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-17 09:20:38
 */
public class JianshenqicaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 器材类型
	 */
	
	private String qicaileixing;
		
	/**
	 * 功能
	 */
	
	private String gongneng;
		
	/**
	 * 租赁时价
	 */
	
	private Float zulinshijia;
		
	/**
	 * 使用方法
	 */
	
	private String shiyongfangfa;
		
	/**
	 * 器材图片
	 */
	
	private String qicaitupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：器材类型
	 */
	 
	public void setQicaileixing(String qicaileixing) {
		this.qicaileixing = qicaileixing;
	}
	
	/**
	 * 获取：器材类型
	 */
	public String getQicaileixing() {
		return qicaileixing;
	}
				
	
	/**
	 * 设置：功能
	 */
	 
	public void setGongneng(String gongneng) {
		this.gongneng = gongneng;
	}
	
	/**
	 * 获取：功能
	 */
	public String getGongneng() {
		return gongneng;
	}
				
	
	/**
	 * 设置：租赁时价
	 */
	 
	public void setZulinshijia(Float zulinshijia) {
		this.zulinshijia = zulinshijia;
	}
	
	/**
	 * 获取：租赁时价
	 */
	public Float getZulinshijia() {
		return zulinshijia;
	}
				
	
	/**
	 * 设置：使用方法
	 */
	 
	public void setShiyongfangfa(String shiyongfangfa) {
		this.shiyongfangfa = shiyongfangfa;
	}
	
	/**
	 * 获取：使用方法
	 */
	public String getShiyongfangfa() {
		return shiyongfangfa;
	}
				
	
	/**
	 * 设置：器材图片
	 */
	 
	public void setQicaitupian(String qicaitupian) {
		this.qicaitupian = qicaitupian;
	}
	
	/**
	 * 获取：器材图片
	 */
	public String getQicaitupian() {
		return qicaitupian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
