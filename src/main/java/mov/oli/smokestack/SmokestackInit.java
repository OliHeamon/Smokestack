package mov.oli.smokestack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmokestackInit
{
	public static final String MODID = "smokestack";
	public static final Logger LOGGER = LoggerFactory.getLogger("Smokestack");
	public static ModPlatform PLATFORM = null;

	public static void entrypoint(ModPlatform platform) {
		SmokestackInit.PLATFORM = platform;
		LOGGER.info("Started mod in %s loader".formatted(SmokestackInit.PLATFORM.getModloader()));
	}
}