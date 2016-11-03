package de.Jannify.eVe;


import java.util.ArrayList;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class eVeMain extends JavaPlugin{
	
	public static ArrayList<Player> ingame = new ArrayList<>();
	public static ArrayList<Player> ingame2 = new ArrayList<>();
	public static String prefix = "[1v1] ";
	public static boolean joinable = true;
		
	
	
	@Override
	public void onDisable() {
		System.out.println("Bye Bye");
		
	}
	
	
	@Override
	public void onEnable() {
		System.out.println("Starte 1v1. . .");
		System.out.println("Command 		  ---  Akktiviert");
		System.out.println("Variable Joinable ---  Zurückgesetzt");
		System.out.println("TPO-Join MSG      ---  Deaktiviert");
		System.out.println("Starte 1v1 [READY]");
		
		
		this.getCommand("ovo").setExecutor(new eVecommand(this));
		

		
		loadConfig();
		
		this.getServer().getPluginManager().registerEvents(new death(this), this);


	}
	public void loadConfig() {
		FileConfiguration cfg = this.getConfig();
		cfg.options().copyDefaults(true);
		
		saveConfig();
	}
	public FileConfiguration config; 
}