/**
 * 
 */
package com.athena.xqjs.entity.laxkaix;

import java.math.BigDecimal;

import com.toft.core3.support.PageableSupport;

/**
 * @author dsimedd001
 * 
 */
public class Kaixjh extends PageableSupport {
	private String kaixjhh;// 开箱计划号
	private String usercenter;// 用户中心
	private String banc;// 毛需求版次
	private String suanfcl;// 计算算法策略
	private BigDecimal kaixjx;// 开箱界限
	private BigDecimal anqkc;// 安全库存
	private String shengxzt;// 生效状态
	private String creator;//创建人
	private String createTime;//创建时间
	private String editor;//修改人
	private String editTime;//修改时间
	private String jihy;
	private String ziyhqrq;
	
	public String getZiyhqrq() {
		return ziyhqrq;
	}
	public void setZiyhqrq(String ziyhqrq) {
		this.ziyhqrq = ziyhqrq;
	}
	/**
	 * 取得 kaixjhh
	 * @return the kaixjhh
	 */
	public String getKaixjhh() {
		return kaixjhh;
	}
	/**
	 * @param kaixjhh the kaixjhh to set
	 */
	public void setKaixjhh(String kaixjhh) {
		this.kaixjhh = kaixjhh;
	}
	/**
	 * 取得 usercenter
	 * @return the usercenter
	 */
	public String getUsercenter() {
		return usercenter;
	}
	/**
	 * @param usercenter the usercenter to set
	 */
	public void setUsercenter(String usercenter) {
		this.usercenter = usercenter;
	}

	/**
	 * 取得 banc
	 * @return the banc
	 */
	public String getBanc() {
		return banc;
	}
	/**
	 * @param banc the banc to set
	 */
	public void setBanc(String banc) {
		this.banc = banc;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * @param editTime the editTime to set
	 */
	public void setEditTime(String editTime) {
		this.editTime = editTime;
	}
	/**
	 * 取得 suanfcl
	 * @return the suanfcl
	 */
	public String getSuanfcl() {
		return suanfcl;
	}
	/**
	 * @param suanfcl the suanfcl to set
	 */
	public void setSuanfcl(String suanfcl) {
		this.suanfcl = suanfcl;
	}

	/**
	 * 取得 kaixjx
	 * @return the kaixjx
	 */
	public BigDecimal getKaixjx() {
		return kaixjx;
	}
	/**
	 * @param kaixjx the kaixjx to set
	 */
	public void setKaixjx(BigDecimal kaixjx) {
		this.kaixjx = kaixjx;
	}
	/**
	 * 取得 anqkc
	 * @return the anqkc
	 */
	public BigDecimal getAnqkc() {
		return anqkc;
	}
	/**
	 * @param anqkc the anqkc to set
	 */
	public void setAnqkc(BigDecimal anqkc) {
		this.anqkc = anqkc;
	}
	/**
	 * 取得 shengxzt
	 * @return the shengxzt
	 */
	public String getShengxzt() {
		return shengxzt;
	}
	/**
	 * @param shengxzt the shengxzt to set
	 */
	public void setShengxzt(String shengxzt) {
		this.shengxzt = shengxzt;
	}
	/**
	 * 取得 creator
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * 取得 editor
	 * @return the editor
	 */
	public String getEditor() {
		return editor;
	}
	/**
	 * @param editor the editor to set
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}
	/**
	 * 取得 createTime
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}
	/**
	 * 取得 editTime
	 * @return the editTime
	 */
	public String getEditTime() {
		return editTime;
	}
	/**
	 * 取得 jihy
	 * @return the jihy
	 */
	public String getJihy() {
		return jihy;
	}
	/**
	 * @param jihy the jihy to set
	 */
	public void setJihy(String jihy) {
		this.jihy = jihy;
	}
	
	
}
