package com.rendyrobbani.latte.core.entity;

import jakarta.persistence.MappedSuperclass;

import java.io.Serial;
import java.io.Serializable;

@MappedSuperclass
public abstract class LatteEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

}