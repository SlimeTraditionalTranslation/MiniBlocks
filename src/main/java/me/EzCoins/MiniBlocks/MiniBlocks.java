package me.EzCoins.MiniBlocks;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.metrics.bukkit.Metrics;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.bakedlibs.dough.updater.GitHubBuildsUpdaterTR;
import me.EzCoins.MiniBlocks.core.Groups;
import me.EzCoins.MiniBlocks.itemsetup.ItemSetup;
import me.EzCoins.MiniBlocks.utils.CustomHead;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.mini2Dx.gettext.GetText;
import org.mini2Dx.gettext.PoFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public final class MiniBlocks extends AbstractAddon implements SlimefunAddon {

    public static MiniBlocks plugin;

    public static MiniBlocks getInstance() {
        return plugin;
    }

    public MiniBlocks(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "SlimeTraditionalTranslation", "MiniBlocks", "master", "auto-update");
    }


    public MiniBlocks() {
        super("SlimeTraditionalTranslation", "MiniBlocks", "master", "auto-update");
    }







    @Override
    protected void enable() {
        plugin = this;
        getLogger().info("------------------------");
        getLogger().info("|         MiniBlocks ~ EzCoins          |");
        getLogger().info("------------------------");

        GetText.setLocale(Locale.TRADITIONAL_CHINESE);
        InputStream inputStream = getClass().getResourceAsStream("/translations/zh_tw.po");
        if (inputStream == null) {
            getLogger().severe("錯誤！無法找到翻譯檔案，請回報給翻譯者。");
            getServer().getPluginManager().disablePlugin(this);
            return;
        } else {
            getLogger().info("載入繁體翻譯檔案...");
            try {
                PoFile poFile = new PoFile(Locale.TRADITIONAL_CHINESE, inputStream);
                GetText.add(poFile);
            } catch (ParseCancellationException | IOException e) {
                getLogger().severe("錯誤！讀取翻譯時發生錯誤，請回報給翻譯者：" + e.getMessage());
                getServer().getPluginManager().disablePlugin(this);
                return;
            }
        }

        CustomHead.setupHead();


        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build_STCT - ")) {
            new GitHubBuildsUpdaterTR(this, getFile(), "SlimeTraditionalTranslation/MiniBlocks/master").start();
        }



        int pluginId = 15867;
        Metrics metrics = new Metrics(this, pluginId);


        Groups.setup(this);
        ItemSetup.setup(this);


    }


    @Override
    public void disable () {

        getLogger().info("Now Shutting down...");
    }

}


