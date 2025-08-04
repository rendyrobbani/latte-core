package com.rendyrobbani.latte.core.rest.service.auth;

import com.rendyrobbani.latte.core.rest.model.request.auth.AuthLoginRequest;

public interface AuthLoginService {

	void handle(AuthLoginRequest request);

}