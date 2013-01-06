package com.th.product.business.sysmgt.pojo;

/**
 * 用户组历史表
 * Sm_User_Group_H.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:14:42 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_User_Group_H {

	/**
	 * 用户组ID
	 */
	private Long group_id;
	/**
	 * 用户ID
	 */
	private String user_id;
	/**
	 * 创建用户
	 */
	private String create_user;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 操作标记
	 */
	private String opt_flag;
	/**
	 * 操作员ID
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
	 * 流水号
	 */
	private String seq_id;
	public Long getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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