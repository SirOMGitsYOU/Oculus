package net.coderbot.iris.compat.flywheel;

import com.jozufozu.flywheel.config.FlwConfig;
import com.jozufozu.flywheel.config.FlwEngine;

import net.coderbot.iris.Iris;

public class FlywheelCompat {

	public static void disableBackend() {
		if(Iris.flywheelLoaded)
			FlwConfig.get().client.engine.set(FlwEngine.OFF);
	}
	
}
