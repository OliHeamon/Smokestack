//? if fabric {
/*package mov.oli.smokestack.platforms.fabric;

import mov.oli.smokestack.ModPlatform;
import mov.oli.smokestack.SmokestackInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class SmokestackFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		SmokestackInit.entrypoint(new FabricPlatform());
	}
	public static class FabricPlatform implements ModPlatform{

		@Override
		public String getModloader() {
			return "Fabric";
		}

		@Override
		public boolean isModLoaded(String modloader) {
			return FabricLoader.getInstance().isModLoaded(modloader);
		}
	}
}
*///?}