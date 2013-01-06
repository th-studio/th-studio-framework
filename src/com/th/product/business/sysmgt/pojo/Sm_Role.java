package com.th.product.business.sysmgt.pojo;

/**
 * 角色表
 * Sm_Role.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:13:36 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_Role {

	/**
	 * 角色ID
	 */
	private Long role_id;
	/**
	 * 角色名称
	 */
	private String role_name;
	/**
	 * 创建用户
	 */
	private String create_user;
	/**
	 * 修改时间
	 */
	private String modify_user;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 修改时间
	 */
	private String modify_time;
	
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getModify_user() {
		return modify_user;
	}
	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getModify_time() {
		return modify_time;
	}
	public void setModify_time(String modify_time) {
		this.modify_time = modify_time;
	}
	
}