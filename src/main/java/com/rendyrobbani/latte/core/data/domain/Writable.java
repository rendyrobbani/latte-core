package com.rendyrobbani.latte.core.data.domain;

public interface Writable extends Readable {

	void update(String updatedBy);

	void delete(String deletedBy);

	void restore(String restoredBy);

}