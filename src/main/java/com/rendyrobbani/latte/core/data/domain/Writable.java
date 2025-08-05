package com.rendyrobbani.latte.core.data.domain;

import com.rendyrobbani.espresso.identify.NIP;

public interface Writable extends Readable {

	void update(NIP updatedBy);

	void delete(NIP deletedBy);

	void restore(NIP restoredBy);

}