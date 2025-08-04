package com.rendyrobbani.latte.core.rest.controller.auth;

import com.rendyrobbani.latte.core.rest.model.request.auth.AuthPreloginRequest;

public interface AuthPreloginController<ResponseEntity> {

	String PATH = "/auth/prelogin";

	ResponseEntity handle(AuthPreloginRequest request);

}