package com.th.product.business.sysmgt.pojo;

/**
 * 字典总览表
 * Sm_Dim.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:11:38 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_Dim {

	/**
	 * 字典类型ID
	 */
	private Long dim_id;
	/**
	 * 类型名称
	 */
	private String dim_name;
	/**
	 * 类型描述
	 */
	private String dim_desc;
	/**
	 * 创建用户
	 */
	private String create_user;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 修改用户
	 */
	private String modify_user;
	/**
	 * 修改时间
	 */
	private String modify_time;
	public Long getDim_id() {
		return dim_id;
	}
	public void setDim_id(Long dim_id) {
		this.dim_id = dim_id;
	}
	public String getDim_name() {
		return dim_name;
	}
	public void setDim_name(String dim_name) {
		this.dim_name = dim_name;
	}
	public String getDim_desc() {
		return dim_desc;
	}
	public void setDim_desc(String dim_desc) {
		this.dim_desc = dim_desc;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getModify_user() {
		return modify_user;
	}
	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}
	public String getModify_time() {
		return modify_time;
	}
	public void setModify_time(String modify_time) {
		this.modify_time = modify_time;
	}

}