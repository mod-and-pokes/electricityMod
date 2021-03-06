package boblovespi.electricitymod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Willi on 4/11/2017.
 */
public class Concrete extends Block implements EMBlock
{
	public Concrete()
	{
		super(Material.ROCK);
		setUnlocalizedName(UNLOCALIZED_NAME());
		setRegistryName(REGISTERY_NAME());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@Override public String UNLOCALIZED_NAME()
	{
		return "concrete";
	}

	@Override public String REGISTERY_NAME()
	{
		return UNLOCALIZED_NAME();
	}

	@Override public String getMetaFilePath(int meta)
	{
		return REGISTERY_NAME();
	}

	@Override public Block toBlock()
	{
		return this;
	}
}
