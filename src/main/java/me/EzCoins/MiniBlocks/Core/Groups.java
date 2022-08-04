package me.EzCoins.MiniBlocks.Core;

import me.EzCoins.MiniBlocks.MiniBlocks;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import me.EzCoins.MiniBlocks.Utils.CustomHeads;
import me.EzCoins.MiniBlocks.Utils.GUIHeads;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class Groups {



    private Groups() {
    }

    public static final NestedItemGroup MAINMINIBLOCK = new NestedItemGroup(new NamespacedKey(MiniBlocks.getInstance(), "mainMiniBlocks"),
            new CustomItemStack(GUIHeads.MAIN_GROUP.getPlayerHead(), "&e迷你方塊"));

    public static final ItemGroup BLOCKS = new SubItemGroup(
            new NamespacedKey(MiniBlocks.getInstance(), "MiniBlocksBlocks"), MAINMINIBLOCK,
            new CustomItemStack(GUIHeads.BLOCKS_GROUP.getPlayerHead(), "&7方塊"), 1
    );

    public static final ItemGroup MACHINES = new SubItemGroup(
            new NamespacedKey(MiniBlocks.getInstance(), "MiniBlocksMachines"), MAINMINIBLOCK,
            new CustomItemStack(Material.FURNACE_MINECART, "&7機器"), 2
    );


    public static void setup(MiniBlocks inst) {
    }

}