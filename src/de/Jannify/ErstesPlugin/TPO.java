package de.Jannify.ErstesPlugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class TPO extends JavaPlugin implements Listener{
	FileConfiguration config = this.getConfig();
	@Override
	public void onDisable() {
		System.out.println("[TPO] Bye Bye");
	}
	
	@Override
	public void onEnable() {
		System.out.println("[TPO]  Starte TelePort to Owner. . .");
		System.out.println("[TPO]  TPO-Creative Menü ---  Akktiviert");
		System.out.println("[TPO]  Starte TelePort to Owner [READY]");
		
		reloadConfig();
		config.addDefault("Menu-Item", "WATCH");
	    if (config.getString("Menu-Item") == null || config.getString("Menu-Item" + config.getString("Menu-Item"))== null) { config.options().copyDefaults(true); }else{config.options().copyDefaults(false);}
	    saveConfig(); 
	    
	    
		getServer().getPluginManager().registerEvents(new Listener() {
			@EventHandler
			public void onInventoryClick(PlayerInteractEvent event) {
				Player player = event.getPlayer(); //Player who 'interacted'
				if (player.getItemInHand() != null) { //Player is not holding air
					ItemStack item = player.getItemInHand(); //The item the players holding
						if (item.getType() == Material.getMaterial(config.getString("Menu-Item"))) {
							if (player.hasPermission("TPO.menu.open")) {
								TPOMenu Menu = new TPOMenu();
								Menu.openInv(player);
							}else{
								player.sendMessage(ChatColor.DARK_RED +"Du hast diese Rechte nicht, deshalb kannst du die Funktion, von dem Plugin TPO, welches dieses Item benutzt, nicht verwenden.");
							}
								 
						} 
				 }
				}
			
		}, this);
		this.getCommand("TPO").setExecutor(new TPOcommand());
		getServer().getPluginManager().registerEvents(new TPOMenu(), this);
	}
	
	
	
	
}
