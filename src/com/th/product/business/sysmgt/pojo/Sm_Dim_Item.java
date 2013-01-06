package com.th.product.business.sysmgt.pojo;

/**
 * 字典细项表
 * Sm_Dim_Item.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:10:53 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_Dim_Item {

	/**
	 * 细项ID
	 */
	private Long item_id;
	/**
	 * 细项名称
	 */
	private String item_name;
	/**
	 * 细项别名
	 */
	private String item_nick_name;
	/**
	 * 字典类型ID
	 */
	private String dim_id;
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
	
	public Long getItem_id() {
		return item_id;
	}
	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_nick_name() {
		return item_nick_name;
	}
	public void setItem_nick_name(String item_nick_name) {
		this.item_nick_name = item_nick_name;
	}
	public String getDim_id() {
		return dim_id;
	}
	public void setDim_id(String dim_id) {
		this.dim_id = dim_id;
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