package com.std.user.domain;

/**
 * Created by sence on 2015/6/21.
 */
public class User {

    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userLoginName;
    private String userPassword;
    private String userEmail;
    private String userPhone;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void getUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userAge=" + userAge + ", userLoginName=" + userLoginName
				+ ", userPassword=" + userPassword + ", userEmail=" + userEmail
				+ ", userPhone=" + userPhone + "]";
	}
}
