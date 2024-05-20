package com.infinity.themes;

import com.formdev.flatlaf.FlatIntelliJLaf;

public class light
		extends FlatIntelliJLaf {
	public static final String NAME = "light";

	public static boolean setup() {
		return setup(new light());
	}

	public static void installLafInfo() {
		installLafInfo(NAME, light.class);
	}

	@Override
	public String getName() {
		return NAME;
	}
}
