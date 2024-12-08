package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学生
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
@TableName("xuesheng")
public class XueshengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学生账号
	 */

	private String xueshengzhanghao;
	/**
	 * 学生姓名
	 */

	private String xueshengxingming;
	/**
	 * 密码
	 */

	private String mima;
	/**
	 * 手机号码
	 */

	private String shoujihaoma;
	/**
	 * 头像
	 */

	private String touxiang;
	/**
	 * 性别
	 */

	private String xingbie;
	/**
	 * 专业
	 */

	private String zhuanye;
	/**
	 * 学历
	 */

	private String xueli;
	/**
	 * 年龄
	 */

	private Integer nianling;
	/**
	 * 处分
	 */

	private String chufen;
	/**
	 * 研究生
	 */

	private String yanjiusheng;
	/**
	 * 是否审核
	 */

	private String sfsh;
	/**
	 * 审核回复
	 */

	private String shhf;
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;
	
	public XueshengEntity() {

	}
	
	
	public XueshengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}

	/**
	 * 设置：学生账号
	 */
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}

	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}

	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}

	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}

	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}

	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}

	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}

	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}

	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}

	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}

	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}

	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}

	/**
	 * 设置：学历
	 */
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}

	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}

	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}

	/**
	 * 获取：处分
	 */
	public String getChufen() {
		return chufen;
	}

	/**
	 * 设置：处分
	 */
	public void setChufen(String chufen) {
		this.chufen = chufen;
	}

	/**
	 * 获取：研究生
	 */
	public String getYanjiusheng() {
		return yanjiusheng;
	}

	/**
	 * 设置：研究生
	 */
	public void setYanjiusheng(String yanjiusheng) {
		this.yanjiusheng = yanjiusheng;
	}

	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}

	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}

	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}

}
