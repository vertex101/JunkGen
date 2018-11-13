package tv.vertex101.junkgen.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	public static Item weed_clump;
	public static Item weed_refined;
	public static Item weed_wondrous;
	public static Item diamond_hunk;

	public static final CreativeTabs JunkGenTab = (new CreativeTabs("JunkGenTab") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(weed_wondrous);
		}
		@Override
		public boolean hasSearchBar() {
			return true;
		}
		
	}).setBackgroundImageName("item_search.png");
	
	public static void init() {
		//Creating the items
		weed_clump = new Item();
		weed_refined = new Item();
		weed_wondrous = new Item();
		diamond_hunk = new Item();
		//setting the unlocal name
		weed_clump.setUnlocalizedName("junk_gen:weed_clump");
		weed_refined.setUnlocalizedName("junk_gen:weed_refined");
		weed_wondrous.setUnlocalizedName("junk_gen:weed_wondrous");
		diamond_hunk.setUnlocalizedName("junk_gen:diamond_hunk");
		//setting the registry name
		weed_clump.setRegistryName("weed_clump");
		weed_refined.setRegistryName("weed_refined");
		weed_wondrous.setRegistryName("weed_wondrous");
		diamond_hunk.setRegistryName("diamond_hunk");
		//set the creative tab
		weed_clump.setCreativeTab(JunkGenTab);
		weed_refined.setCreativeTab(JunkGenTab);
		weed_wondrous.setCreativeTab(JunkGenTab);
		diamond_hunk.setCreativeTab(JunkGenTab);
		//register the items
		ForgeRegistries.ITEMS.register(weed_clump);
		ForgeRegistries.ITEMS.register(weed_refined);
		ForgeRegistries.ITEMS.register(weed_wondrous);
		ForgeRegistries.ITEMS.register(diamond_hunk);
	}
	
	@SideOnly (Side.CLIENT)
    public static void initModels() {
        ModelResourceLocation clump_location = new ModelResourceLocation("junk_gen:weed_clump", "type=weed_clump");
        ModelLoader.setCustomModelResourceLocation(weed_clump, 0, clump_location);    
        ModelResourceLocation refined_location = new ModelResourceLocation("junk_gen:weed_refined", "type=weed_refined");
        ModelLoader.setCustomModelResourceLocation(weed_refined, 0, refined_location);       
        ModelResourceLocation wondrous_location = new ModelResourceLocation("junk_gen:weed_wondrous", "type=weed_wondrous");
        ModelLoader.setCustomModelResourceLocation(weed_wondrous, 0, wondrous_location);
        ModelResourceLocation diamond_hunk_location = new ModelResourceLocation("junk_gen:diamond_hunk", "type=diamond_hunk");
        ModelLoader.setCustomModelResourceLocation(diamond_hunk, 0, diamond_hunk_location);
    }

}
