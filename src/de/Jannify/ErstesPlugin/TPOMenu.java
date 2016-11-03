package de.Jannify.ErstesPlugin;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class TPOMenu implements Listener{
	public void openInv(Player p) {
		Inventory inv = Bukkit.createInventory(null, 72, "TPO-Menu");
		
		ItemStack item1 = new ItemStack(Material.GOLDEN_APPLE);
		ItemMeta meta1 = item1.getItemMeta();
		meta1.setDisplayName("Gamemode");
		item1.setItemMeta(meta1);
		
		ItemStack item2 = new ItemStack(Material.NETHER_STAR);
		ItemMeta meta2 = item2.getItemMeta();
		meta2.setDisplayName("Creativ");
		item2.setItemMeta(meta2);
		
		ItemStack item3 = new ItemStack(Material.GRASS);
		ItemMeta meta3 = item3.getItemMeta();
		meta3.setDisplayName("Survival");
		item3.setItemMeta(meta3);
		
		ItemStack item4 = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta4 = item4.getItemMeta();
		meta4.setDisplayName("Adventure");
		item4.setItemMeta(meta4);
		
		ItemStack item5 = new ItemStack(Material.BARRIER);
		ItemMeta meta5 = item5.getItemMeta();
		meta5.setDisplayName("Spectator");
		item5.setItemMeta(meta5);
		
		ItemStack item6 = new ItemStack(Material.WATCH);
		ItemMeta meta6 = item6.getItemMeta();
		meta6.setDisplayName("Time");
		item6.setItemMeta(meta6);
		
		ItemStack item7 = new ItemStack(Material.STAINED_CLAY, 1, (short) 4);
		ItemMeta meta7 = item7.getItemMeta();
		meta7.setDisplayName("Morgens");
		item7.setItemMeta(meta7);
		
		ItemStack item8 = new ItemStack(Material.STAINED_CLAY, 1, (short) 1);
		ItemMeta meta8 = item8.getItemMeta();
		meta8.setDisplayName("Mittags");
		item8.setItemMeta(meta8);
		
		ItemStack item9 = new ItemStack(Material.STAINED_CLAY, 1, (short) 14);
		ItemMeta meta9 = item9.getItemMeta();
		meta9.setDisplayName("Abends");
		item9.setItemMeta(meta9);
		
		ItemStack item10 = new ItemStack(Material.STAINED_CLAY, 1, (short) 15);
		ItemMeta meta10 = item10.getItemMeta();
		meta10.setDisplayName("Nachts");
		item10.setItemMeta(meta10);
		
		ItemStack item11 = new ItemStack(Material.SAPLING);
		ItemMeta meta11 = item11.getItemMeta();
		meta11.setDisplayName("Do Random Tick Speed");
		item11.setItemMeta(meta11);
		
		ItemStack item12 = new ItemStack(Material.WATCH,1);
		ItemMeta meta12 = item12.getItemMeta();
		meta12.setDisplayName("Tickspeed 1");
		item12.setItemMeta(meta12);
		
		ItemStack item13 = new ItemStack(Material.WATCH,3);
		ItemMeta meta13 = item13.getItemMeta();
		meta13.setDisplayName("Tickspeed 100");
		item13.setItemMeta(meta13);
		
		ItemStack item14 = new ItemStack(Material.WATCH,5);
		ItemMeta meta14 = item14.getItemMeta();
		meta14.setDisplayName("Tickspeed 500");
		item14.setItemMeta(meta14);
		
		ItemStack item15 = new ItemStack(Material.WATCH,10);
		ItemMeta meta15 = item15.getItemMeta();
		meta15.setDisplayName("Tickspeed 1000");
		item15.setItemMeta(meta15);
		
		ItemStack item16 = new ItemStack(Material.WATER_BUCKET);
		ItemMeta meta16 = item16.getItemMeta();
		meta16.setDisplayName("Rain-Controller");
		item16.setItemMeta(meta16);
		
		ItemStack item17 = new ItemStack(Material.DOUBLE_PLANT);
		ItemMeta meta17 = item17.getItemMeta();
		meta17.setDisplayName("Sun");
		item17.setItemMeta(meta17);
		
		ItemStack item18 = new ItemStack(Material.WATER_BUCKET);
		ItemMeta meta18 = item18.getItemMeta();
		meta18.setDisplayName("Rain");
		item18.setItemMeta(meta18);
		
		ItemStack item19 = new ItemStack(Material.WOOL, 1, (short) 7);
		ItemMeta meta19 = item19.getItemMeta();
		meta19.setDisplayName("ThunderStorm");
		item19.setItemMeta(meta19);
		
		ItemStack item20 = new ItemStack(Material.ARROW);
		ItemMeta meta20 = item20.getItemMeta();
		meta20.setDisplayName("Lightnig");
		item20.setItemMeta(meta20);
		
		ItemStack item21 = new ItemStack(Material.WOOL, 1, (short) 5);
		ItemMeta meta21 = item21.getItemMeta();
		meta21.setDisplayName("True");
		item21.setItemMeta(meta21);
		
		ItemStack item22 = new ItemStack(Material.WOOL, 2, (short) 5);
		ItemMeta meta22 = item22.getItemMeta();
		meta22.setDisplayName("True");
		item22.setItemMeta(meta22);
		
		ItemStack item23 = new ItemStack(Material.WOOL, 3, (short) 5);
		ItemMeta meta23 = item23.getItemMeta();
		meta23.setDisplayName("True");
		item23.setItemMeta(meta23);
		
		ItemStack item24 = new ItemStack(Material.WOOL, 4, (short) 5);
		ItemMeta meta24 = item24.getItemMeta();
		meta24.setDisplayName("True");
		item24.setItemMeta(meta24);
		
		ItemStack item25 = new ItemStack(Material.WOOL, 5, (short) 5);
		ItemMeta meta25 = item25.getItemMeta();
		meta25.setDisplayName("True");
		item25.setItemMeta(meta25);
		
		ItemStack item26 = new ItemStack(Material.WOOL, 6, (short) 5);
		ItemMeta meta26 = item26.getItemMeta();
		meta26.setDisplayName("True");
		item26.setItemMeta(meta26);
		
		ItemStack item27 = new ItemStack(Material.WOOL, 1, (short) 14);
		ItemMeta meta27 = item27.getItemMeta();
		meta27.setDisplayName("False");
		item27.setItemMeta(meta27);
		
		ItemStack item28 = new ItemStack(Material.WOOL, 2, (short) 14);
		ItemMeta meta28 = item28.getItemMeta();
		meta28.setDisplayName("False");
		item28.setItemMeta(meta28);
		
		ItemStack item29 = new ItemStack(Material.WOOL, 3, (short) 14);
		ItemMeta meta29 = item29.getItemMeta();
		meta29.setDisplayName("False");
		item29.setItemMeta(meta29);
		
		ItemStack item30 = new ItemStack(Material.WOOL, 4, (short) 14);
		ItemMeta meta30 = item30.getItemMeta();
		meta30.setDisplayName("False");
		item30.setItemMeta(meta30);
		
		ItemStack item31 = new ItemStack(Material.WOOL, 5, (short) 14);
		ItemMeta meta31 = item31.getItemMeta();
		meta31.setDisplayName("False");
		item31.setItemMeta(meta31);
		
		ItemStack item32 = new ItemStack(Material.WOOL, 6, (short) 14);
		ItemMeta meta32 = item32.getItemMeta();
		meta32.setDisplayName("False");
		item32.setItemMeta(meta32);
		
		ItemStack item33 = new ItemStack(Material.COMMAND);
		ItemMeta meta33 = item33.getItemMeta();
		meta33.setDisplayName("doCommandblockOutput");
		item33.setItemMeta(meta33);
		
		ItemStack item34 = new ItemStack(Material.MONSTER_EGG, 1, (short) 54);
		ItemMeta meta34 = item34.getItemMeta();
		meta34.setDisplayName("doMobSpawn");
		item34.setItemMeta(meta34);
		
		ItemStack item35 = new ItemStack(Material.CHEST);
		ItemMeta meta35 = item35.getItemMeta();
		meta35.setDisplayName("keepInventory");
		item35.setItemMeta(meta35);
		
		ItemStack item36 = new ItemStack(Material.FLINT_AND_STEEL);
		ItemMeta meta36 = item36.getItemMeta();
		meta36.setDisplayName("doFireTick");
		item36.setItemMeta(meta36);
		
		ItemStack item37 = new ItemStack(Material.WATCH);
		ItemMeta meta37 = item37.getItemMeta();
		meta37.setDisplayName("doDaylightCyrcle");
		item37.setItemMeta(meta37);
		
		ItemStack item38 = new ItemStack(Material.SKULL_ITEM, 1,(short) 4);
		ItemMeta meta38 = item38.getItemMeta();
		meta38.setDisplayName("doMobGriefing");
		item38.setItemMeta(meta38);
		
		ItemStack item41 = new ItemStack(Material.WOOD_AXE);
		ItemMeta meta41 = item41.getItemMeta();
		meta41.setDisplayName("WorldEdit-Vorlage");
		item41.setItemMeta(meta41);
		
		ItemStack item42 = new ItemStack(Material.SMOOTH_BRICK);
		ItemMeta meta42 = item42.getItemMeta();
		meta42.setDisplayName("Stone-Vorlage");
		item42.setItemMeta(meta42);

		ItemStack item43 = new ItemStack(Material.LOG);
		ItemMeta meta43 = item43.getItemMeta();
		meta43.setDisplayName("Holz-Vorlage");
		item43.setItemMeta(meta43);

		ItemStack item44 = new ItemStack(Material.QUARTZ_BLOCK);
		ItemMeta meta44 = item44.getItemMeta();
		meta44.setDisplayName("Quarz-Vorlage");
		item44.setItemMeta(meta44);

		ItemStack item45 = new ItemStack(Material.WOOL);
		ItemMeta meta45 = item45.getItemMeta();
		meta45.setDisplayName("Wolle-Vorlage");
		item45.setItemMeta(meta45);

		ItemStack item46 = new ItemStack(Material.REDSTONE);
		ItemMeta meta46 = item46.getItemMeta();
		meta46.setDisplayName("Redstone-Vorlage");
		item46.setItemMeta(meta46);

		ItemStack item47 = new ItemStack(Material.NETHER_BRICK);
		ItemMeta meta47 = item47.getItemMeta();
		meta47.setDisplayName("Nether-Vorlage");
		item47.setItemMeta(meta47);

		ItemStack item48 = new ItemStack(Material.STAINED_CLAY, 1, (short) 12);
		ItemMeta meta48 = item48.getItemMeta();
		meta48.setDisplayName("Clay-Vorlage");
		item48.setItemMeta(meta48);
		
		ItemStack item49 = new ItemStack(Material.GLASS);
		ItemMeta meta49 = item49.getItemMeta();
		meta49.setDisplayName("Glass-Vorlage");
		item49.setItemMeta(meta49);
		
		ItemStack item50 = new ItemStack(Material.COAL_ORE);
		ItemMeta meta50 = item50.getItemMeta();
		meta50.setDisplayName("Erz & Metall-Vorlage");
		item50.setItemMeta(meta50);
		
		ItemStack item51 = new ItemStack(Material.MONSTER_EGG, 1,(short) 54);
		ItemMeta meta51 = item51.getItemMeta();
		meta51.setDisplayName("Spawn-Vorlage");
		item51.setItemMeta(meta51);
		
		ItemStack item52 = new ItemStack(Material.WORKBENCH);
		ItemMeta meta52 = item52.getItemMeta();
		meta52.setDisplayName("Inneneinrichtung");
		item52.setItemMeta(meta52);
		
		ItemStack item53 = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta meta53 = item53.getItemMeta();
		meta53.setDisplayName("Enchanting-Vorlage");
		item53.setItemMeta(meta53);
		
		ItemStack item54 = new ItemStack(Material.POTION, 1,(short) 16395);
		ItemMeta meta54 = item54.getItemMeta();
		meta54.setDisplayName("Potion-Vorlage");
		item54.setItemMeta(meta54);
		
		ItemStack item55 = new ItemStack(Material.PAPER);
		ItemMeta meta55 = item55.getItemMeta();
		meta55.setDisplayName("Credits");
		item55.setItemMeta(meta55);
		
		ItemStack item56 = new ItemStack(Material.STAINED_GLASS_PANE, 1,(short) 15);
		ItemMeta meta56 = item56.getItemMeta();
		meta56.setDisplayName(" ");
		item56.setItemMeta(meta56);
		
		ItemStack item57 = new ItemStack(Material.BARRIER,2);
		ItemMeta meta57 = item57.getItemMeta();
		meta57.setDisplayName("Clear");
		item57.setItemMeta(meta57);

		
		inv.setItem(0,  item1);
		inv.setItem(2,  item2);
		inv.setItem(3,  item3);
		inv.setItem(4,  item4);
		inv.setItem(5,  item5);
		inv.setItem(9,  item6);
		inv.setItem(11, item7);
		inv.setItem(12, item8);
		inv.setItem(13, item9);
		inv.setItem(14, item10);
		inv.setItem(18, item11);
		inv.setItem(20, item12);
		inv.setItem(21, item13);
		inv.setItem(22, item14);
		inv.setItem(23, item15);
		inv.setItem(27, item16);
		inv.setItem(29, item17);
		inv.setItem(30, item18);
		inv.setItem(31, item19);
		inv.setItem(32, item20);
		inv.setItem(45, item21);
		inv.setItem(46, item22);
		inv.setItem(47, item23);
		inv.setItem(48, item24);
		inv.setItem(49, item25);
		inv.setItem(50, item26);
		inv.setItem(63, item27);
		inv.setItem(64, item28);
		inv.setItem(65, item29);
		inv.setItem(66, item30);
		inv.setItem(67, item31);
		inv.setItem(68, item32);
		inv.setItem(54, item33);
		inv.setItem(55, item34);
		inv.setItem(56, item35);
		inv.setItem(57, item36);
		inv.setItem(58, item37);
		inv.setItem(59, item38);
		inv.setItem(7,  item41);
		inv.setItem(8,  item42);
		inv.setItem(16, item43);
		inv.setItem(17, item44);
		inv.setItem(25, item45);
		inv.setItem(26, item46);
		inv.setItem(34, item47);
		inv.setItem(35, item48);
		inv.setItem(43, item49);
		inv.setItem(44, item50);
		inv.setItem(52, item51);
		inv.setItem(53, item52);
		inv.setItem(61, item53);
		inv.setItem(62, item54);
		inv.setItem(71, item55);
		inv.setItem(70, item57);
		
		inv.setItem(1,  item56);
		inv.setItem(10, item56);
		inv.setItem(19, item56);
		inv.setItem(28, item56);
		inv.setItem(36, item56);
		inv.setItem(37, item56);	
		inv.setItem(38, item56);
		inv.setItem(39, item56);	
		inv.setItem(40, item56);
		inv.setItem(41, item56);	
		inv.setItem(42, item56);
		inv.setItem(6,  item56);	
		inv.setItem(15, item56);
		inv.setItem(24, item56);	
		inv.setItem(33, item56);
		inv.setItem(51, item56);	
		inv.setItem(60, item56);
		inv.setItem(69, item56);	

		p.openInventory(inv);
	}
		
	@EventHandler
	public void InventoryClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();  

        if(e.getInventory().getTitle().equalsIgnoreCase("TPO-Menu")){
            e.setCancelled(true); //Cancel the event so they can't take items out of the GUI
            if(e.getCurrentItem() == null){
                return;  }
            if(e.getCurrentItem().getType() == Material.AIR){
                return;  }
            
            if (p.hasPermission("tpo.menu.mode")) {
            	if(e.getCurrentItem().getType() == Material.NETHER_STAR){
            		p.closeInventory();
            		p.setGameMode(GameMode.CREATIVE);
            	}else if(e.getCurrentItem().getType() == Material.GRASS){
            		p.closeInventory();
            		p.setGameMode(GameMode.SURVIVAL);
            	}else if(e.getCurrentItem().getType() == Material.DIAMOND_PICKAXE){
            		p.closeInventory();
            		p.setGameMode(GameMode.ADVENTURE);
            	}else if(e.getCurrentItem().getType() == Material.BARRIER){
            		if(e.getCurrentItem().getAmount() == 1) {
            			p.closeInventory();
            			p.setGameMode(GameMode.SPECTATOR);
            		}
            	}
            }
            	if(e.getCurrentItem().getType() == Material.BARRIER){
            		if(e.getCurrentItem().getAmount() == 2) {
        			p.getInventory().clear();
        			p.getInventory().addItem(new ItemStack(Material.WATCH)); 	
            		}
            	}
            if (p.hasPermission("tpo.menu.time")) {
	            if(e.getCurrentItem().getType() == Material.STAINED_CLAY) {
	            	if(e.getCurrentItem().getDurability() == 4) {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setTime(0);
	            	}else if(e.getCurrentItem().getDurability() == 1) {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setTime(6000);
	            	}else if(e.getCurrentItem().getDurability() == 14) {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setTime(12000);
	            	}else if (e.getCurrentItem().getDurability() == 15) {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setTime(18000);
	            	}
	            }
            }
            
            if (p.hasPermission("tpo.menu.material")) {
	            if(e.getCurrentItem().getType() == Material.STAINED_CLAY) {
		            if(e.getCurrentItem().getDurability() == 12) {
		                    p.closeInventory();
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 4));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 1));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 14));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 5));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 13));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 3));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 9));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 11));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 10));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 2));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 6));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 0));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 8));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 7));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 12));
		                    p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY,1, (short) 15));
		                    }
	            }
            }
            if (p.hasPermission("tpo.menu.tickspeed")) {
	            if(e.getCurrentItem().getType() == Material.WATCH) {
	            	if(e.getCurrentItem().getItemMeta().getDisplayName() == "Tickspeed 1") {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setGameRuleValue("randomTickSpeed", "1");
	            		p.sendMessage("RandomTickSpeed wurde auf §a1§0 gestellt");
	            	}else if(e.getCurrentItem().getAmount() == 3) {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setGameRuleValue("randomTickSpeed", "100");
	            		p.sendMessage("RandomTickSpeed wurde auf §a100§0 gestellt");
	            	}else if(e.getCurrentItem().getAmount() == 5) {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setGameRuleValue("randomTickSpeed", "500");
	            		p.sendMessage("RandomTickSpeed wurde auf §a500§0 gestellt");
	            	}else if(e.getCurrentItem().getAmount() == 10) {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setGameRuleValue("randomTickSpeed", "1000");
	            		p.sendMessage("RandomTickSpeed wurde auf §a1000§0 gestellt");
	            	}
	            }
            }
	            	
            if (p.hasPermission("tpo.menu.weather")) {	
	            if(e.getCurrentItem().getType() == Material.DOUBLE_PLANT){
	               	p.closeInventory();
	              	World w = p.getWorld();
	              	w.setThundering(false);
	              	w.setStorm(false);
	            }else if(e.getCurrentItem().getType() == Material.WATER_BUCKET){
	              	p.closeInventory();
	               	World w = p.getWorld();
	               	w.setThundering(false);
	               	w.setStorm(true);
	            }else if(e.getCurrentItem().getItemMeta().getDisplayName() == "ThunderStorm"){
	            	if(e.getCurrentItem().getDurability() == 7) {
	            		p.closeInventory();
	            		World w = p.getWorld();
	            		w.setStorm(true);
	            		w.setThundering(true);
	            	}
	            }else if(e.getCurrentItem().getType() == Material.ARROW){
	              	p.closeInventory();
	              	World w = p.getWorld();
	    			w.strikeLightning(p.getLocation());
	            }
            }
    		if (p.hasPermission("tpo.menu.rule")) {	
	    		if(e.getCurrentItem().getItemMeta().getDisplayName() == "True"){
	    			World w = p.getWorld();
	            	if(e.getCurrentItem().getDurability()== 5) {
	            		if(e.getCurrentItem().getAmount()== 1) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6CommandBlockOutput§f wurde auf §atrue§f gestellt");
	            			w.setGameRuleValue("CommandBLockOutput", "true");
	            		}else if(e.getCurrentItem().getAmount()== 2) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6doMobSpawning§f wurde auf §atrue§f gestellt");
	            			w.setGameRuleValue("doMobSpawning", "true");
	            		}else if(e.getCurrentItem().getAmount()== 3) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6keepInventory§f wurde auf §atrue§f gestellt");
	            			w.setGameRuleValue("keepInventory", "true");
	            		}else if(e.getCurrentItem().getAmount()== 4) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6doFireTick§f wurde auf §atrue§f gestellt");
	            			w.setGameRuleValue("doFireTick", "true");
	            		}else if(e.getCurrentItem().getAmount()== 5) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6doDaylightCycle§f wurde auf §atrue§f gestellt");
	            			w.setGameRuleValue("doDaylightCycle", "true");
	            		}else if(e.getCurrentItem().getAmount()== 6) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6MobGriefing§f wurde auf §atrue§f gestellt");
	            			w.setGameRuleValue("MobGriefing", "true");
	            		}
	            	}
	            }else if(e.getCurrentItem().getItemMeta().getDisplayName() == "False"){
	            	World w = p.getWorld();
	            	if(e.getCurrentItem().getDurability()== 14) {
	            		if(e.getCurrentItem().getAmount()== 1) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6CommandBlockOutput§f wurde auf §4false§f gestellt");
	            			w.setGameRuleValue("CommandBLockOutput", "false");
	            		}else if(e.getCurrentItem().getAmount()== 2) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6doMobSpawning§f wurde auf §4false§f gestellt");
	            			w.setGameRuleValue("doMobSpawning", "false");
	            		}else if(e.getCurrentItem().getAmount()== 3) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6keepInventory§f wurde auf §4false§f gestellt");
	            			w.setGameRuleValue("keepInventory", "false");
	            		}else if(e.getCurrentItem().getAmount()== 4) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6doFireTick§f wurde auf §4false§f gestellt");
	            			w.setGameRuleValue("doFireTick", "false");
	            		}else if(e.getCurrentItem().getAmount()== 5) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6doDaylightCycle§f wurde auf §4false§f gestellt");
	            			w.setGameRuleValue("doDaylightCycle", "false");
	            		}else if(e.getCurrentItem().getAmount()== 6) {
	            			p.closeInventory();
	            			p.sendMessage("Die Gamerule §6MobGriefing§f wurde auf §4false§f gestellt");
	            			w.setGameRuleValue("MobGriefing", "false");
	            		}             
	            	}
	            }		 	
            }
    		if (p.hasPermission("tpo.menu.materials")) {
	    		if(e.getCurrentItem().getType() == Material.SMOOTH_BRICK) {
	            	p.closeInventory();
	            	p.getInventory().addItem(new ItemStack(Material.STONE));
	                p.getInventory().addItem(new ItemStack(Material.COBBLESTONE));
	                p.getInventory().addItem(new ItemStack(Material.STONE,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.STONE,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.STONE,1, (short) 4));
	                p.getInventory().addItem(new ItemStack(Material.STONE,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.STONE,1, (short) 5));
	                p.getInventory().addItem(new ItemStack(Material.STONE,1, (short) 6));
	                p.getInventory().addItem(new ItemStack(Material.SMOOTH_BRICK,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.SMOOTH_BRICK,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.SMOOTH_BRICK,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.SMOOTH_BRICK,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.COBBLE_WALL,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.COBBLE_WALL,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.COBBLESTONE_STAIRS));
	                p.getInventory().addItem(new ItemStack(Material.SMOOTH_STAIRS));
	                p.getInventory().addItem(new ItemStack(Material.GRAVEL));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGGS,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGGS,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGGS,1, (short) 4));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGGS,1, (short) 5));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGGS,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGGS,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.STEP,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.STEP,1, (short) 5));
	                p.getInventory().addItem(new ItemStack(Material.MOSSY_COBBLESTONE));
	                
	       		
	        	}else if(e.getCurrentItem().getType() == Material.WOOD_AXE) {
	            	p.closeInventory();
	            	p.getInventory().addItem(new ItemStack(Material.COMPASS));
	                p.getInventory().addItem(new ItemStack(Material.WOOD_AXE));
	                p.getInventory().addItem(new ItemStack(Material.WOOD_HOE));
	                p.getInventory().addItem(new ItemStack(Material.LEATHER));
	                p.getInventory().addItem(new ItemStack(Material.ARROW));
	                p.getInventory().addItem(new ItemStack(Material.SULPHUR));
	                p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
	                
	                
	       		
	        	}else if(e.getCurrentItem().getType() == Material.LOG) {
	            	p.closeInventory();
	                p.getInventory().addItem(new ItemStack(Material.LOG,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.LOG,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.LOG,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.LOG,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.LOG_2,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.LOG_2,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.WOOD,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.WOOD,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.WOOD,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.WOOD,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.WOOD,1, (short) 4));
	                p.getInventory().addItem(new ItemStack(Material.WOOD,1, (short) 5));
	                p.getInventory().addItem(new ItemStack(Material.LEAVES,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.LEAVES,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.LEAVES,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.LEAVES,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.LEAVES_2,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.LEAVES_2,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.SAPLING,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.SAPLING,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.SAPLING,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.SAPLING,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.SAPLING,1, (short) 4));
	                p.getInventory().addItem(new ItemStack(Material.SAPLING,1, (short) 5));
	       		
	        	}else if(e.getCurrentItem().getType() == Material.QUARTZ_BLOCK) {
	            	p.closeInventory();
	                p.getInventory().addItem(new ItemStack(Material.QUARTZ_BLOCK,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.QUARTZ_BLOCK,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.QUARTZ_BLOCK,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.QUARTZ_STAIRS));
	                p.getInventory().addItem(new ItemStack(Material.STEP,1, (short) 7));
	                p.getInventory().addItem(new ItemStack(Material.SEA_LANTERN));
	                p.getInventory().addItem(new ItemStack(Material.PRISMARINE,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.PRISMARINE,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.PRISMARINE,1, (short) 0));
	        	
	        	}else if(e.getCurrentItem().getType() == Material.WOOL) {
	        		if(e.getCurrentItem().getDurability() == 0) {
		            	p.closeInventory();
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 4));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 1));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 14));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 5));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 13));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 3));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 9));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 11));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 10));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 2));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 6));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 0));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 8));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 7));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 12));
		                p.getInventory().addItem(new ItemStack(Material.WOOL,1, (short) 15));
	        		}
	        	}else if(e.getCurrentItem().getType() == Material.REDSTONE) {
	            	p.closeInventory();
	            	p.getInventory().addItem(new ItemStack(Material.REDSTONE));
	                p.getInventory().addItem(new ItemStack(Material.REDSTONE_TORCH_ON));
	                p.getInventory().addItem(new ItemStack(Material.REDSTONE_BLOCK));
	                p.getInventory().addItem(new ItemStack(Material.DIODE));
	                p.getInventory().addItem(new ItemStack(Material.REDSTONE_COMPARATOR));
	                p.getInventory().addItem(new ItemStack(Material.LEVER));
	                p.getInventory().addItem(new ItemStack(Material.STONE_BUTTON));
	                p.getInventory().addItem(new ItemStack(Material.WOOD_BUTTON));
	                p.getInventory().addItem(new ItemStack(Material.DISPENSER));
	                p.getInventory().addItem(new ItemStack(Material.DROPPER));
	                p.getInventory().addItem(new ItemStack(Material.HOPPER));
	                p.getInventory().addItem(new ItemStack(Material.PISTON_BASE));
	                p.getInventory().addItem(new ItemStack(Material.PISTON_STICKY_BASE));
	                p.getInventory().addItem(new ItemStack(Material.REDSTONE_LAMP_OFF));
	                p.getInventory().addItem(new ItemStack(Material.DAYLIGHT_DETECTOR));
	                p.getInventory().addItem(new ItemStack(Material.WOOD_PLATE));
	                p.getInventory().addItem(new ItemStack(Material.STONE_PLATE));
	                p.getInventory().addItem(new ItemStack(Material.IRON_PLATE));
	                p.getInventory().addItem(new ItemStack(Material.GOLD_PLATE));
	                p.getInventory().addItem(new ItemStack(Material.IRON_TRAPDOOR));
	                p.getInventory().addItem(new ItemStack(Material.IRON_DOOR));
	                p.getInventory().addItem(new ItemStack(Material.TRIPWIRE_HOOK));
	                p.getInventory().addItem(new ItemStack(Material.STRING));
	
	
	        	}else if(e.getCurrentItem().getType() == Material.NETHER_BRICK) {
	            	p.closeInventory();
	            	p.getInventory().addItem(new ItemStack(Material.NETHER_BRICK));
	                p.getInventory().addItem(new ItemStack(Material.NETHER_BRICK_STAIRS));
	                p.getInventory().addItem(new ItemStack(Material.STEP,1, (short) 6));
	                p.getInventory().addItem(new ItemStack(Material.NETHER_FENCE));
	                p.getInventory().addItem(new ItemStack(Material.NETHERRACK));
	                p.getInventory().addItem(new ItemStack(Material.SOUL_SAND));
	                p.getInventory().addItem(new ItemStack(Material.GLOWSTONE));
	                p.getInventory().addItem(new ItemStack(Material.QUARTZ_ORE));
	        	}else if(e.getCurrentItem().getType() == Material.GLASS) {
	                p.closeInventory();
	                p.getInventory().addItem(new ItemStack(Material.GLASS));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 4));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 14));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 5));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 13));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 9));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 11));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 10));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 6));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 8));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 7));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 12));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS,1, (short) 15));
	                
	                p.getInventory().addItem(new ItemStack(Material.THIN_GLASS));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 4));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 14));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 5));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 13));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 3));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 9));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 11));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 10));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 6));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 8));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 7));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 12));
	                p.getInventory().addItem(new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 15));
	        	}else if(e.getCurrentItem().getType() == Material.COAL_ORE) {
	            	p.closeInventory();
	            	p.getInventory().addItem(new ItemStack(Material.COAL_ORE));
	                p.getInventory().addItem(new ItemStack(Material.IRON_ORE));
	                p.getInventory().addItem(new ItemStack(Material.GOLD_ORE));
	                p.getInventory().addItem(new ItemStack(Material.REDSTONE_ORE));
	                p.getInventory().addItem(new ItemStack(Material.LAPIS_ORE));
	                p.getInventory().addItem(new ItemStack(Material.DIAMOND_ORE));
	                p.getInventory().addItem(new ItemStack(Material.EMERALD_ORE));
	                p.getInventory().addItem(new ItemStack(Material.BEDROCK));
	                p.getInventory().addItem(new ItemStack(Material.COAL));
	                p.getInventory().addItem(new ItemStack(Material.IRON_INGOT));
	                p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
	                p.getInventory().addItem(new ItemStack(Material.REDSTONE));
	                p.getInventory().addItem(new ItemStack(Material.INK_SACK,1, (short) 4));
	                p.getInventory().addItem(new ItemStack(Material.DIAMOND));
	                p.getInventory().addItem(new ItemStack(Material.EMERALD));
	
	        	}else if(e.getCurrentItem().getType() == Material.MONSTER_EGG) {
	                p.closeInventory();
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 50));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 51));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 52));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 54));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 55));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 56));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 57));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 58));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 59));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 60));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 61));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 62));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 65));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 66));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 67));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 68));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 90));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 91));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 92));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 93));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 94));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 95));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 96));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 98));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 100));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 101));
	                p.getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 120));
	            }else if(e.getCurrentItem().getType() == Material.WORKBENCH) {
	            	p.closeInventory();
	            	p.getInventory().addItem(new ItemStack(Material.WORKBENCH));
	                p.getInventory().addItem(new ItemStack(Material.FURNACE));
	                p.getInventory().addItem(new ItemStack(Material.CHEST));
	                p.getInventory().addItem(new ItemStack(Material.TRAPPED_CHEST));
	                p.getInventory().addItem(new ItemStack(Material.ENDER_CHEST));
	                p.getInventory().addItem(new ItemStack(Material.JUKEBOX));
	                p.getInventory().addItem(new ItemStack(Material.NOTE_BLOCK));
	                p.getInventory().addItem(new ItemStack(Material.BEACON));
	                p.getInventory().addItem(new ItemStack(Material.ENCHANTMENT_TABLE));
	                p.getInventory().addItem(new ItemStack(Material.ENDER_PORTAL_FRAME));
	                p.getInventory().addItem(new ItemStack(Material.BREWING_STAND_ITEM));
	                p.getInventory().addItem(new ItemStack(Material.CAULDRON_ITEM));
	                p.getInventory().addItem(new ItemStack(Material.ANVIL,1, (short) 0));
	                p.getInventory().addItem(new ItemStack(Material.ANVIL,1, (short) 1));
	                p.getInventory().addItem(new ItemStack(Material.ANVIL,1, (short) 2));
	                p.getInventory().addItem(new ItemStack(Material.HAY_BLOCK));
	                p.getInventory().addItem(new ItemStack(Material.BED));
	                p.getInventory().addItem(new ItemStack(Material.PAINTING));
	                p.getInventory().addItem(new ItemStack(Material.ITEM_FRAME));
	                p.getInventory().addItem(new ItemStack(Material.SIGN));
	                p.getInventory().addItem(new ItemStack(Material.ARMOR_STAND));
	                p.getInventory().addItem(new ItemStack(Material.TORCH));
	            }else if(e.getCurrentItem().getType() == Material.ENCHANTED_BOOK) {
	            	p.closeInventory();
	            	p.setLevel(1000000);
	            	p.getInventory().addItem(new ItemStack(Material.ENCHANTMENT_TABLE));
	                p.getInventory().addItem(new ItemStack(Material.BOOKSHELF));
	                p.getInventory().addItem(new ItemStack(Material.ANVIL));
	            }else if(e.getCurrentItem().getType() == Material.POTION) {
	            	p.closeInventory();
	            	p.setLevel(1000000);
	            	p.sendMessage("§4Work in Progress");
	            }
    		}
    		
    		if(e.getCurrentItem().getType() == Material.PAPER) {
            	p.closeInventory();
            	p.sendMessage("§fDieses Plugin wurde von §l§4-Jannify-§r§f gemacht");
            	p.sendMessage("§fYT-Channel:§1www.youtube.com/channel/UCGG5xXDHV6VA_wMt3iT137Q§f");
            }else{	  	
        	}
	}
	}
 }
