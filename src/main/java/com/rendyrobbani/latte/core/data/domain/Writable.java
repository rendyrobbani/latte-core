package com.rendyrobbani.latte.core.data.domain;

public interface Writable<User, Target> extends Readable<User> {

	Target update(User updatedAt);

	Target delete(User deletedAt);

	Target restore(User restoredAt);

}