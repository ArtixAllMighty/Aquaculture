/*package com.teammetallurgy.aquaculture.utils;

import com.teammetallurgy.aquaculture.Aquaculture;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;

@Mod.EventBusSubscriber
public class Config {
    public static Configuration config;
    public static final String categoryBasic = "BASIC_OPTIONS";
    public static boolean assignRandomWeight;
    public static boolean enableNeptuniumArmor;
    public static boolean enableNeptuniumTools;
    public static boolean enableNeptuniumLoot;

    public static final String categoryFishRarity = "FISH_RARITY";
    public static HashMap<String, Integer> fishRarity = new HashMap<>();

    public static final String categoryJunkRarity = "JUNK_RARITY";
    public static HashMap<String, Integer> junkRarity = new HashMap<>();

    static {
        // Freshwater
        fishRarity.put("Bluegill", 30);
        fishRarity.put("Perch", 30);
        fishRarity.put("Gar", 20);
        fishRarity.put("Bass", 10);
        fishRarity.put("Muskellunge", 10);
        fishRarity.put("Brown Trout", 10);
        fishRarity.put("Catfish", 5);
        fishRarity.put("Carp", 1);

        // Saltwater
        fishRarity.put("Blowfish", 60);
        fishRarity.put("Red Grouper", 30);
        fishRarity.put("Salmon", 10);
        fishRarity.put("Tuna", 10);
        fishRarity.put("Swordfish", 5);
        fishRarity.put("Shark", 1);
        fishRarity.put("Whale", 1);
        fishRarity.put("Squid", 40);
        fishRarity.put("Jellyfish", 40);

        // Brackish
        fishRarity.put("Frog", 1);
        fishRarity.put("Turtle", 1);
        fishRarity.put("Leech", 30);

        // Jungle
        fishRarity.put("Pirahna", 60);
        fishRarity.put("Electric Eel", 25);
        fishRarity.put("Tambaqui", 5);
        fishRarity.put("Arapaima", 1);

        // Tundra
        fishRarity.put("Cod", 10);
        fishRarity.put("Pollock", 25);
        fishRarity.put("Herring", 60);
        fishRarity.put("Halibut", 1);
        fishRarity.put("Pink Salmon", 10);
        fishRarity.put("Rainbow Trout", 20);
        fishRarity.put("Blackfish", 45);

        // Desert
        fishRarity.put("Capitaine", 1);
        fishRarity.put("Boulti", 30);
        fishRarity.put("Bagrid", 20);
        fishRarity.put("Syndontis", 60);

        // Mushroom Island
        fishRarity.put("Red Shrooma", 20);
        fishRarity.put("Brown Shrooma", 20);

        // Junk
        junkRarity.put("Seaweed", 25);
        junkRarity.put("Algae", 25);
        junkRarity.put("Driftwood", 25);
        junkRarity.put("Tin Can", 30);
        junkRarity.put("Box", 25);
        junkRarity.put("Lockbox", 23);
        junkRarity.put("Treasure Chest", 10);
        junkRarity.put("Stick", 20);
        junkRarity.put("Bone", 20);
        junkRarity.put("Leather Boots", 20);
        junkRarity.put("Apple", 20);
        junkRarity.put("Goldfish", 10);
        junkRarity.put("Message In A Bottle", 23);
        junkRarity.put("Neptunes Bounty", 1);

    }

    public static void init(File file) {
        if (config == null) {
            config = new Configuration(file);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        assignRandomWeight = config.get(categoryBasic, "Enable fish weight", true).getBoolean();
        enableNeptuniumArmor = config.get(categoryBasic, "Enable Neptunium armor", true).getBoolean();
        enableNeptuniumTools = config.get(categoryBasic, "Enable Neptunium tools", true).getBoolean();
        enableNeptuniumLoot = config.get(categoryBasic, "Enable Neptunium loot", true).getBoolean();

        for (Entry<String, Integer> entry : fishRarity.entrySet()) {
            int rarity = entry.getValue();
            String name = entry.getKey().replace(' ', '_').toLowerCase(Locale.US);
            rarity = config.getInt(name, categoryFishRarity, rarity, 1, 100, "");
            entry.setValue(rarity);
        }

        for (Entry<String, Integer> entry : junkRarity.entrySet()) {
            int rarity = entry.getValue();
            String name = entry.getKey().replace(' ', '_').toLowerCase(Locale.US);
            rarity = config.getInt(name, categoryJunkRarity, rarity, 1, 100, "");
            entry.setValue(rarity);
        }

        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public static void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase(Aquaculture.MOD_ID)) {
            loadConfiguration();
        }
    }
}*/