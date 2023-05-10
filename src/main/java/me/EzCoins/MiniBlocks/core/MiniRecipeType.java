package me.EzCoins.MiniBlocks.core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.EzCoins.MiniBlocks.MiniBlocks;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.mini2Dx.gettext.GetText;

public class MiniRecipeType {

    private MiniRecipeType() {}

    public static final RecipeType BlockReducer =
            new RecipeType(new NamespacedKey(MiniBlocks.plugin, "BLOCKREDUCER"),
                    new SlimefunItemStack(
                            "BLOCKREDUCER",
                            Material.STONECUTTER,
                            GetText.tr("&9Block Reducer")),
                            "",
                                  GetText.tr("&7Turns the desired block into a"),
                                  GetText.tr("&7smaller version of itself."));

}
