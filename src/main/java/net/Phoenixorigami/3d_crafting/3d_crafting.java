import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(3d_crafting.MOD_ID)
public class 3d_crafting {
    public static final String MOD_ID = "3d_crafting";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public 3d_crafting() {