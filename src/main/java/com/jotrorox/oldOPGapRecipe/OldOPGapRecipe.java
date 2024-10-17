package com.jotrorox.oldOPGapRecipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class OldOPGapRecipe extends JavaPlugin {
    @Override
    public void onEnable() {
        ItemStack gap = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.fromString("jotrorox.old_op_gap"), gap);
        recipe.shape("GGG", "GAG", "GGG");
        recipe.setIngredient('G', Material.GOLD_BLOCK);
        recipe.setIngredient('A', Material.APPLE);
        getServer().addRecipe(recipe);
    
        // Pretty message for the server console
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("§6===============================");
        getServer().getConsoleSender().sendMessage("§ePlugin: §aOld OP Gap Recipe");
        getServer().getConsoleSender().sendMessage("§eVersion: §a1.0");
        getServer().getConsoleSender().sendMessage("§eDescription: §aA plugin that adds the old OP golden apple recipe back to the game.");
        getServer().getConsoleSender().sendMessage("§eAuthor: §aJotrorox");
        getServer().getConsoleSender().sendMessage("§eWebsite: §ahttps://Jotrorox.com");
        getServer().getConsoleSender().sendMessage("§6===============================");
        getServer().getConsoleSender().sendMessage("");
    }
}