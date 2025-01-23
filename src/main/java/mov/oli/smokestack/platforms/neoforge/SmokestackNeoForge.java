//? if neoforge {
package mov.oli.smokestack.platforms.neoforge;

import mov.oli.smokestack.ConfigScreen;
import mov.oli.smokestack.SmokestackInit;
import mov.oli.smokestack.ModPlatform;
import net.neoforged.fml.ModList;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod("smokestack")
public class SmokestackNeoForge {
	public SmokestackNeoForge() {
		SmokestackInit.entrypoint(new NeoForgePlatform());
        ModLoadingContext.get().registerExtensionPoint(
                IConfigScreenFactory.class,
                () -> (client, parent) -> ConfigScreen.createConfigScreen(parent)
        );
	}
    public static class NeoForgePlatform implements ModPlatform {
        @Override
        public String getModloader() {
            return "NeoForge";
        }

        @Override
        public boolean isModLoaded(String modId) {
            return ModList.get().isLoaded(modId);
        }
    }
}
//?}