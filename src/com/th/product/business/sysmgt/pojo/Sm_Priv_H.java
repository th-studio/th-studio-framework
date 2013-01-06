package com.th.product.business.sysmgt.pojo;

/**
 * 功能菜单历史表
 * Sm_Priv_H.java
 * <p>@description:</p>
 * @author css
 * @since 2013-1-6 下午5:10:20 created by css
 * @version 1.1 <p>create</p>
 *
 */
public class Sm_Priv_H {

	/**
	 * 功能ID
	 */
	private Long priv_id;
	/**
	 * 功能名称
	 */
	private String priv_name;
	/**
	 * 功能描述
	 */
	private String priv_desc;
	/**
	 * 产品类型
	 */
	private String pro_type;
	/**
	 * 模块类型
	 */
	private String module_type;
	/**
	 * 功能类型
	 */
	private String func_type;
	/**
	 * 图标地址
	 */
	private String img_src;
	/**
	 * 链接地址
	 */
	private String url_src;
	/**
	 * 功能状态
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
	 * 操作用户
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
	public Long getPriv_id() {
		return priv_id;
	}
	public void setPriv_id(Long priv_id) {
		this.priv_id = priv_id;
	}
	public String getPriv_name() {
		return priv_name;
	}
	public void setPriv_name(String priv_name) {
		this.priv_name = priv_name;
	}
	public String getPriv_desc() {
		return priv_desc;
	}
	public void setPriv_desc(String priv_desc) {
		this.priv_desc = priv_desc;
	}
	public String getPro_type() {
		return pro_type;
	}
	public void setPro_type(String pro_type) {
		this.pro_type = pro_type;
	}
	public String getModule_type() {
		return module_type;
	}
	public void setModule_type(String module_type) {
		this.module_type = module_type;
	}
	public String getFunc_type() {
		return func_type;
	}
	public void setFunc_type(String func_type) {
		this.func_type = func_type;
	}
	public String getImg_src() {
		return img_src;
	}
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	public String getUrl_src() {
		return url_src;
	}
	public void setUrl_src(String url_src) {
		this.url_src = url_src;
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