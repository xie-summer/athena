package com.athena.ckx.entity.transTime;

import java.util.Date;

import com.athena.component.entity.Domain;
import com.toft.core3.support.PageableSupport;

/**
 * 运输时刻
 * @author hj
 * @Date 2012-03-19
 */
public class CkxYunssk extends PageableSupport  implements Domain{
	

	private static final long serialVersionUID = -6790607714902341609L;
	private String usercenter;//用户中心
	private String gcbh;//承运商	
	private String xiehztbh;//卸货站台编号
	private String facsj;//发出时间
	private String daohsj;     //到货时间
	private Integer xuh;   //序号
	private String creator;    //创建人
	private Date create_time;    //创建时间
	private String editor;//修改人
	private Date edit_time;//修改时间
	private String gongzr;//工作日
	
	public String getGongzr() {
		return gongzr;
	}
	public void setGongzr(String gongzr) {
		this.gongzr = gongzr;
	}
	public String getUsercenter() {
		return usercenter;
	}
	public void setUsercenter(String usercenter) {
		this.usercenter = usercenter;
	}
	public String getGcbh() {
		return gcbh;
	}
	public void setGcbh(String gcbh) {
		this.gcbh = gcbh;
	}
	public String getXiehztbh() {
		return xiehztbh;
	}
	public void setXiehztbh(String xiehztbh) {
		this.xiehztbh = xiehztbh;
	}
	public String getFacsj() {
		return facsj;
	}
	public void setFacsj(String facsj) {
		this.facsj = facsj;
	}
	public String getDaohsj() {
		return daohsj;
	}
	public void setDaohsj(String daohsj) {
		this.daohsj = daohsj;
	}
	
	public Integer getXuh() {
		return xuh;
	}
	public void setXuh(Integer xuh) {
		this.xuh = xuh;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public Date getEdit_time() {
		return edit_time;
	}
	public void setEdit_time(Date edit_time) {
		this.edit_time = edit_time;
	}

	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
