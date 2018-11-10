package tv.vertex101.junkgen.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tv.vertex101.junkgen.init.ModBlocks;
import tv.vertex101.junkgen.init.ModItems;

public class Proxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
        ModItems.init();		
	}

}
