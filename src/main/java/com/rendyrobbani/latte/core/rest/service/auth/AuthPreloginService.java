package com.rendyrobbani.latte.core.rest.service.auth;

import com.rendyrobbani.latte.core.rest.model.request.auth.AuthPreloginRequest;
import com.rendyrobbani.latte.core.rest.model.response.auth.AuthPreloginResponse;

public interface AuthPreloginService {

	AuthPreloginResponse handle(AuthPreloginRequest request);

}