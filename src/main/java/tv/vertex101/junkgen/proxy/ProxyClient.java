package tv.vertex101.junkgen.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tv.vertex101.junkgen.init.ModBlocks;
import tv.vertex101.junkgen.init.ModItems;

public class ProxyClient extends Proxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ModBlocks.initModels();
        ModItems.initModels();
    }
}
