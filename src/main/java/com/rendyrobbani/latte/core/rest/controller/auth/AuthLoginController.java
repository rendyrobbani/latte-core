package com.rendyrobbani.latte.core.rest.controller.auth;

import com.rendyrobbani.latte.core.rest.model.request.auth.AuthLoginRequest;

public interface AuthLoginController<ResponseEntity> {

	String PATH = "/auth/login";

	ResponseEntity handle(AuthLoginRequest request);

}