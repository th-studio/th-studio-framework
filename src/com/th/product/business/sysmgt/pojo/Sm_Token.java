package com.th.product.business.sysmgt.pojo;

/**
 * 票据表
 * Sm_Token.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:14:03 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_Token {

	/**
	 * 主键标识
	 */
	private Long token_id;
	/**
	 * 票据
	 */
	private String token;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 修改时间
	 */
	private String modify_time;
	
	public Long getToken_id() {
		return token_id;
	}
	public void setToken_id(Long token_id) {
		this.token_id = token_id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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