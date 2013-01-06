package com.th.product.business.sysmgt.pojo;

/**
 * 用户表
 * Sm_User.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:17:26 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_User {

	/**
	 * 主键
	 */
	private Long user_id;
	/**
	 * 用户姓名
	 */
	private String user_name;
	/**
	 * 别名
	 */
	private String nick_name;
	/**
	 * 用户状态
	 */
	private String status;
	/**
	 * 用户密码
	 */
	private String pwd;
	/**
	 * 创建时间
	 */
	private String create_time;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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