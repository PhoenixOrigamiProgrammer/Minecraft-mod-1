package net.Phoenixorigami.crafting_3d;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(crafting_3d.MOD_ID)
public class crafting_3d {
    public static final String MOD_ID = "crafting_3d";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public crafting_3d() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hello World");
    }

}