package com.rendyrobbani.latte.core.rest.model.response.auth;

import java.util.List;

public interface AuthPreloginResponse {

	String token();

	List<AuthPreloginRoleResponse> listRole();

}