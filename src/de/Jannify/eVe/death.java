package de.Jannify.eVe;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class death implements Listener{
	
	eVeMain pl;
	public death(eVeMain pl){
		this.pl = pl;
	}
	
	@EventHandler
	public void onArenaDeath(PlayerDeathEvent e){
		Player p = e.getEntity();
		Player k = p.getKiller();
		
		if (p == eVeMain.ingame && k == eVeMain.ingame2 || p == eVeMain.ingame2 && k == eVeMain.ingame ) {
				e.getDrops().clear();
				k.getInventory().clear();
		


				eVeMain.joinable = true;
				pl.getServer().getScheduler().cancelTasks(pl);
				for(Player pl: eVeMain.ingame) {
					pl.performCommand("/spawn");
					pl.sendMessage(eVeMain.prefix+k.getName()+"hat gewonnen");
				pl.sendMessage(eVeMain.prefix+"Das Match ist zuende. Back to the Lobby.");
				}
				for(Player pl: eVeMain.ingame2) {
					pl.performCommand("/spawn");
					pl.sendMessage(eVeMain.prefix+"Das Match ist zuende. Back to the Lobby.");
				}
				eVeMain.ingame.clear();
				eVeMain.ingame2.clear();
			
		}
	}			
		
	

}
