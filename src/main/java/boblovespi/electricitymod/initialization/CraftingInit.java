package boblovespi.electricitymod.initialization;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by Willi on 4/11/2017.
 */
public class CraftingInit
{
	public static void Register()
	{
		// Crafting recipes
		GameRegistry.addShapedRecipe(
				new ItemStack(ItemInit.computerChip.toItem(), 3), "rct", "cSc",
				"tcr", 'r', Items.REDSTONE, 'c',
				new ItemStack(ItemInit.ingot.toItem(), 1, 0), 't',
				Blocks.REDSTONE_TORCH, 'S', ItemInit.siliconPlate);
		GameRegistry
				.addShapedRecipe(new ItemStack(BlockInit.concrete.toBlock(), 4),
						"SSS", "SWS", "SSS", 'S', Blocks.SAND, 'W',
						Items.WATER_BUCKET);
		GameRegistry.addShapedRecipe(
				new ItemStack(BlockInit.siliconProcessor.toBlock(), 1), "ccc",
				"P P", "IFI", 'c', new ItemStack(ItemInit.ingot.toItem(), 1, 0),
				'P', Blocks.PISTON, 'I', Blocks.IRON_BLOCK, 'F',
				Blocks.FURNACE);
		GameRegistry.addShapedRecipe(
				new ItemStack(BlockInit.solarPanel.toBlock(), 1), "GGG", "tqt",
				"tct", 'G', Blocks.GLASS, 't',
				new ItemStack(ItemInit.ingot.toItem(), 1, 1), 'q', Items.QUARTZ,
				'c', ItemInit.computerChip);

		// Bronze
		AddToolRecipies("ingotBronze", Items.STICK, ToolInit.bronzePickaxe,
				ToolInit.bronzeAxe, ToolInit.bronzeSword, ToolInit.bronzeHoe,
				ToolInit.bronzeShovel);

		// Furnace recipes
		GameRegistry.addSmelting(Items.BREAD,
				new ItemStack(ItemInit.flatbread.toItem()), 1f);
	}

	private static void AddToolRecipies(@Nonnull Object ingot,
			@Nonnull Object stick, @Nullable ItemPickaxe pickaxe,
			@Nullable ItemTool axe, @Nullable ItemSword sword,
			@Nullable ItemHoe hoe, @Nullable ItemSpade spade)
	{
		if (pickaxe != null)
		{
			ShapedOreRecipe r = new ShapedOreRecipe(new ItemStack(pickaxe),
					"iii", " s ", " s ", 'i', ingot, 's', stick);
			GameRegistry.addRecipe(r);
		}
		if (axe != null)
		{
			ShapedOreRecipe r = new ShapedOreRecipe(new ItemStack(axe), "ii ",
					"is ", " s ", 'i', ingot, 's', stick);
			GameRegistry.addRecipe(r);
		}
		if (hoe != null)
		{
			ShapedOreRecipe r = new ShapedOreRecipe(new ItemStack(hoe), "ii ",
					" s ", " s ", 'i', ingot, 's', stick);
			GameRegistry.addRecipe(r);
		}
		if (sword != null)
		{
			ShapedOreRecipe r = new ShapedOreRecipe(new ItemStack(sword), " i ",
					" i ", " s ", 'i', ingot, 's', stick);
			GameRegistry.addRecipe(r);
		}
		if (spade != null)
		{
			ShapedOreRecipe r = new ShapedOreRecipe(new ItemStack(spade), " i ",
					" s ", " s ", 'i', ingot, 's', stick);
			GameRegistry.addRecipe(r);
		}

	}
}
