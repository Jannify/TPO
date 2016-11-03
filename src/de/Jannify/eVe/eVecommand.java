package de.Jannify.eVe;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class eVecommand implements CommandExecutor{
	
	
	eVeMain pl;
	public eVecommand(eVeMain pl){
		this.pl = pl;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String l,String[] args) {
		Player p = (Player) sender; 
		
		if (args.length == 0){
			p.sendMessage(eVeMain.prefix+" /1v1 <join/leave>");
		}else if(args[0].equalsIgnoreCase("join")){
			if(eVeMain.joinable == true) {
				
				if(eVeMain.ingame.size() != 2){
					
					if(eVeMain.ingame.size()== 0){
					
						eVeMain.ingame.add(p);
						
						p.getInventory().clear();
						eVeMain.joinable = false;
					
					}if(eVeMain.ingame.size() == 1){
					
						eVeMain.ingame2.add(p);
						p.sendMessage(eVeMain.prefix+"Du bist gejoint.");
						
						p.getInventory().clear();
						eVeMain.joinable = false;
						
						Bukkit.getScheduler().runTaskTimer(pl, new Runnable() {
							
							int i = 15;
							@Override
							public void run() {
								
								i--;
								for(Player o : eVeMain.ingame){
								if(i == 10){
									o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 10 Sekunden.");
								}else if(i == 5){
									o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 5 Sekunden.");
								}else if(i == 3){
									o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 3 Sekunden.");
								}else if(i == 2){
									o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 2 Sekunden.");
								}else if(i == 1){
									o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 1 Sekunden.");
								}else if(i == 0){
									o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in JETZT.");
									Bukkit.getScheduler().cancelTasks(pl);
									o.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
									o.setHealth(20.0);
									o.setFoodLevel(20);
									eVeMain.joinable = false;
									
									
									double x = pl.config.getDouble("Start.1.X");
									double y = pl.config.getDouble("Start.1.Y");
									double z = pl.config.getDouble("Start.1.Z");
									float yaw = (float) pl.config.getDouble("Start.1.Yaw");
									float pitch = (float) pl.config.getDouble("Start.1.Pitch");
									String worldname = pl.config.getString("Start.1.World");
									
									World w = Bukkit.getWorld(worldname);
									
									Location l = new Location(w, x, y, z, yaw, pitch);
									o.teleport(l);
								}
								}
								for(Player o : eVeMain.ingame2){
									if(i == 10){
										o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 10 Sekunden.");
									}else if(i == 5){
										o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 5 Sekunden.");
									}else if(i == 3){
										o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 3 Sekunden.");
									}else if(i == 2){
										o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 2 Sekunden.");
									}else if(i == 1){
										o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in 1 Sekunden.");
									}else if(i == 0){
										o.sendMessage(eVeMain.prefix+"Das Kampf beginnt in JETZT.");
										Bukkit.getScheduler().cancelTasks(pl);
										o.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
										o.setHealth(20.0);
										o.setFoodLevel(20);
										eVeMain.joinable = false;
										
										
										double x = pl.config.getDouble("Start.2.X");
										double y = pl.config.getDouble("Start.2.Y");
										double z = pl.config.getDouble("Start.2.Z");
										float yaw = (float) pl.config.getDouble("Start.2.Yaw");
										float pitch = (float) pl.config.getDouble("Start.2.Pitch");
										String worldname = pl.config.getString("Start.2.World");
										
										World w = Bukkit.getWorld(worldname);
										
										Location l = new Location(w, x, y, z, yaw, pitch);
										o.teleport(l);
									}
									}
							}
						}, 0, 20);
					
					
				}
			}else{
				p.sendMessage(eVeMain.prefix+"Die Arena ist voll!");
			}
		}else{
			p.sendMessage(eVeMain.prefix+"Die Arena ist ist bereits InGame!");
		}
		}else if(args[0].equalsIgnoreCase("setstart")){
			if(p.isOp()){
			if(args[1].equalsIgnoreCase("1")){
				pl.config.set("Start.1.X",p.getLocation().getBlockX());
				pl.config.set("Start.1.Y",p.getLocation().getBlockY());
				pl.config.set("Start.1.Z",p.getLocation().getBlockZ());
				pl.config.set("Start.1.Yaw",p.getLocation().getYaw());
				pl.config.set("Start.1.Pitch",p.getLocation().getPitch());
				pl.config.set("Start.1.World",p.getLocation().getWorld().getName());
				p.sendMessage(eVeMain.prefix+"Der Spawn f�r Punkt 1 wurde gesetzt.");
				pl.saveConfig();
			}else if(args[2].equalsIgnoreCase("2")){
				pl.config.set("Start.2.X",p.getLocation().getBlockX());
				pl.config.set("Start.2.Y",p.getLocation().getBlockY());
				pl.config.set("Start.2.Z",p.getLocation().getBlockZ());
				pl.config.set("Start.2.Yaw",p.getLocation().getYaw());
				pl.config.set("Start.2.Pitch",p.getLocation().getPitch());
				pl.config.set("Start.2.World",p.getLocation().getWorld().getName());
				p.sendMessage(eVeMain.prefix+"Der Spawn f�r Punkt 2 wurde gesetzt.");
				pl.saveConfig();
			}else {
				p.sendMessage(eVeMain.prefix+"1 oder 2, nichts anderes.");
			}
			}
		}else if(args[0].equalsIgnoreCase("leave")){
			eVeMain.ingame.clear();
			eVeMain.ingame2.clear();
			eVeMain.joinable = true;
			pl.getServer().getScheduler().cancelTasks(pl);
			for(Player pl: eVeMain.ingame) {
				pl.performCommand("/spawn");
				pl.sendMessage(eVeMain.prefix+"Das Match wurde aufgel�st. Back to the Lobby.");
			}
			for(Player pl: eVeMain.ingame2) {
				pl.performCommand("/spawn");
				pl.sendMessage(eVeMain.prefix+"Das Match wurde aufgel�st. Back to the Lobby.");
			}
		}
		return true;
	}

}
