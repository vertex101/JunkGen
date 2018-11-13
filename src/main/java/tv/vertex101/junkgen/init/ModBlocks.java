package tv.vertex101.junkgen.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tv.vertex101.junkgen.block.BlockGenerator;

public class ModBlocks {
	
	public static Block generator_block;
	public static Item generator_item;
	
	public static void init() {
		generator_block = new BlockGenerator();
		generator_item = new ItemBlock(generator_block);
		generator_item.setRegistryName("block_generator");
		generator_item.setUnlocalizedName("junk_gen:block_generator");
		generator_item.setCreativeTab(ModItems.JunkGenTab);
		
		ForgeRegistries.BLOCKS.register(generator_block);
        ForgeRegistries.ITEMS.register(generator_item);
	}

	@SideOnly (Side.CLIENT)
	public static void initModels() {
		ModelResourceLocation generator_location = new ModelResourceLocation(generator_item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(generator_item, 0, generator_location);
	}

}
