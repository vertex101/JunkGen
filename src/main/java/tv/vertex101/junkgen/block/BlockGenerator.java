package tv.vertex101.junkgen.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tv.vertex101.junkgen.init.ModItems;

public class BlockGenerator extends Block {

	public BlockGenerator() {
		super(Material.IRON);
		this.setRegistryName("block_generator");
		this.setUnlocalizedName("junk_gen:block_generator");
		this.setCreativeTab(ModItems.JunkGenTab);
	}

}
