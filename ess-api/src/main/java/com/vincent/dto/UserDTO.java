package com.vincent.dto;
import java.util.Date;

/**
 *
 *
 * @className:com.vincent.dto.UserDTO
 * @description: User 数据传输对象
 *
 * @version:v1.0.0
 * @author: VincentHo
 *
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 *  2018-11-13     VincentHo       v1.0.0        create
 *
 *
 */
public class UserDTO implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	/**主键 */
	private Long id;

	/**手机 */
	private String mobile;

	/**性别 */
	private String gender;

	/**邮箱 */
	private String email;

	/**是否有效 */
	private String status;

	/**描述 */
	private String myDesc;

	/**年龄 */
	private Long age;

	/**否需要微信二次认证 */
	private java.lang.Boolean isAuth;

	/**创建时间 */
	private Date createtime;

	/**修改时间 */
	private Date modifytime;

	/**生日 */
	private Date birthday;

	/**拼音码 */
	private String pinyinCode;

	/**五笔码 */
	private String wubiCode;

	/**全拼码 */
	private String spellingCode;

	/**真实姓名 */
	private String trueName;


	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}


	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMyDesc() {
		return this.myDesc;
	}

	public void setMyDesc(String myDesc) {
		this.myDesc = myDesc;
	}

	public Long getAge() {
		return this.age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public java.lang.Boolean getIsAuth() {
		return this.isAuth;
	}

	public void setIsAuth(java.lang.Boolean isAuth) {
		this.isAuth = isAuth;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPinyinCode() {
		return this.pinyinCode;
	}

	public void setPinyinCode(String pinyinCode) {
		this.pinyinCode = pinyinCode;
	}

	public String getWubiCode() {
		return this.wubiCode;
	}

	public void setWubiCode(String wubiCode) {
		this.wubiCode = wubiCode;
	}

	public String getSpellingCode() {
		return this.spellingCode;
	}

	public void setSpellingCode(String spellingCode) {
		this.spellingCode = spellingCode;
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", mobile=" + mobile + ", gender="
				+ gender + ", email=" + email + ", status=" + status
				+ ", myDesc=" + myDesc + ", age=" + age + ", isAuth=" + isAuth
				+ ", createtime=" + createtime + ", modifytime=" + modifytime
				+ ", birthday=" + birthday + ", pinyinCode=" + pinyinCode
				+ ", wubiCode=" + wubiCode + ", spellingCode=" + spellingCode
				+ ", trueName=" + trueName + "]";
	}

}

