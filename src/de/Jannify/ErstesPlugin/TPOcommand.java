package de.Jannify.ErstesPlugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TPOcommand implements CommandExecutor, Listener{
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
			if (p.hasPermission("TPO.menu.open")) {
				TPOMenu menu = new TPOMenu();
				menu.openInv(p);
				
			}else{
				p.sendMessage("Du hast keine Permisions.");
			}
		return true;
	}
}
		
		 
		
	
				
	