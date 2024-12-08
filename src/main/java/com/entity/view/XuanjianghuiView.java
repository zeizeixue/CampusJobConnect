package com.entity.view;

import com.entity.XuanjianghuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宣讲会
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
@TableName("xuanjianghui")
public class XuanjianghuiView  extends XuanjianghuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuanjianghuiView(){
	}
 
 	public XuanjianghuiView(XuanjianghuiEntity xuanjianghuiEntity){
 	try {
			BeanUtils.copyProperties(this, xuanjianghuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
