package net.swutm.ancientcivilization;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;

import java.util.logging.Logger;

@Mod(ancientcivilization.MOD_ID)
public class StructureTutorialMain {

    public static final Logger LOGGER = (Logger) LogManager.getLogger();
    public static final String MOD_ID = "ancientcivilization";

    public StructureTutorialMain() {
        // For registration and init stuff.
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        STStructures.DEFERRED_REGISTRY_STRUCTURE.register(modEventBus);
    }
}
