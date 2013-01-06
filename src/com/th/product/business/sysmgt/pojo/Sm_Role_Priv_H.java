package com.th.product.business.sysmgt.pojo;

/**
 * 角色权限历史表
 * Sm_Role_Priv_H.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:12:25 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_Role_Priv_H {

	/**
	 * 角色ID
	 */
	private Long role_id;
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
	 * 操作标识
	 */
	private String opt_flag;
	/**
	 * 操作工号
	 */
	private String opt_user;
	/**
	 * 操作时间
	 */
	private String opt_time;
	/**
	 * 票据ID
	 */
	private String token_id;
	/**
	 * 流水ID
	 */
	private String seq_id;
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
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
	public String getOpt_flag() {
		return opt_flag;
	}
	public void setOpt_flag(String opt_flag) {
		this.opt_flag = opt_flag;
	}
	public String getOpt_user() {
		return opt_user;
	}
	public void setOpt_user(String opt_user) {
		this.opt_user = opt_user;
	}
	public String getOpt_time() {
		return opt_time;
	}
	public void setOpt_time(String opt_time) {
		this.opt_time = opt_time;
	}
	public String getToken_id() {
		return token_id;
	}
	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}
	public String getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(String seq_id) {
		this.seq_id = seq_id;
	}

}