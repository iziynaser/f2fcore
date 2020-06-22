package com.f2f.entity.common;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

public class EmailWrapper extends BaseEntity {

	private Email data;

	public Email getData() {
		return data;
	}

	public void setData(Email data) {
		this.data = data;
	}
	
}
