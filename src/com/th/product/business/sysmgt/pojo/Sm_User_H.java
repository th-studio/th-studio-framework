package com.th.product.business.sysmgt.pojo;

/**
 * 用户历史表
 * Sm_User_H.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:15:27 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_User_H {

	/**
	 * 用户ID
	 */
	private Long user_id;
	/**
	 * 用户名称
	 */
	private String user_name;
	/**
	 * 别名
	 */
	private String nick_name;
	/**
	 * 状态
	 */
	private String status;
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
	 * 修改用户
	 */
	private String opt_user;
	/**
	 * 修改时间
	 */
	private String opt_time;
	/**
	 * 票据
	 */
	private String token_id;
	/**
	 * 流水ID
	 */
	private String seq_id;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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