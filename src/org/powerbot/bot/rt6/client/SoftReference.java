package org.powerbot.bot.rt6.client;

import org.powerbot.bot.ReflectProxy;
import org.powerbot.bot.Reflector;

public class SoftReference extends ReflectProxy {
	public SoftReference(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Object get() {
		return reflector.access(this);
	}
}
