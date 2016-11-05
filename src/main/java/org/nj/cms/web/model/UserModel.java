package org.nj.cms.web.model;

import org.nj.cms.core.base.BaseModel;

public class UserModel extends BaseModel {
	// 用户名称
	private String userName;
	// 用户年龄
	private int age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "{id:" + id + ",userName:" + userName + ",age" + age + "}";
	}

}
