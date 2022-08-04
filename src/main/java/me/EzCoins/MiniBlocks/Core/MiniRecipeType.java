package me.EzCoins.MiniBlocks.Core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.EzCoins.MiniBlocks.MiniBlocks;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MiniRecipeType {

    private MiniRecipeType() {}

    public static final RecipeType BlockReducer =
            new RecipeType(new NamespacedKey(MiniBlocks.plugin, "BLOCKREDUCER"),
                    new SlimefunItemStack(
                            "BLOCKREDUCER",
                            Material.STONECUTTER,
                            "&9方塊縮小機"),
                            "",
                                  "&7將方塊縮小成其",
                                  "&7自身較小的版本.");

}
