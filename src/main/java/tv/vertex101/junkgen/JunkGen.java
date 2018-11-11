package tv.vertex101.junkgen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tv.vertex101.junkgen.proxy.Proxy;

@Mod(modid = JunkGen.MOD_ID, name = JunkGen.MOD_NAME, updateJSON = "https://vertex101.tv/update/junkgen.json")
public class JunkGen {

	public static final String MOD_ID = "junk_gen";
    public static final String MOD_NAME = "Junk Gen";
    
    @SidedProxy(clientSide = "tv.vertex101.junkgen.proxy.ProxyClient", serverSide = "tv.vertex101.junkgen.proxy.Proxy")
    public static Proxy proxy;
    
    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    }
}