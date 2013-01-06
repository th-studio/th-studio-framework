package com.th.product.business.sysmgt.pojo;

/**
 * 用户权限表
 * Sm_User_Priv.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:16:11 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_User_Priv {

	/**
	 * 用户ID
	 */
	private Long user_id;
	/**
	 * 功能ID
	 */
	private String priv_id;
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
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getPriv_id() {
		return priv_id;
	}
	public void setPriv_id(String priv_id) {
		this.priv_id = priv_id;
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