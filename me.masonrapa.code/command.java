package me.masonrapa.code;

import me.masonrapa.code.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

 
public class command extends Thread implements CommandExecutor, Listener {

	public static String target = "";
	public static Player jugatori = null;
	public static Player objetivo = null;
	public static String tempo = null;
	public static ArrayList<String> mute = new ArrayList<String>();
	public static ArrayList<String> frozen = new ArrayList<String>();
	public static ArrayList<String> vanish = new ArrayList<String>();
	public static ArrayList<String> watcher = new ArrayList<String>();
	public static ArrayList<String> ban = new ArrayList<String>();


	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            Inventory gui = Bukkit.createInventory(player, 45, "§5✪ §bStaff Menu §5✪");
            ItemStack air = new ItemStack(Material.AIR);
            ItemStack id0 = new ItemStack(Material.INK_SACK, 1, (byte)2 );
            ItemStack id1 = new ItemStack(Material.INK_SACK, 1, (byte)11 );
            ItemStack id2 = new ItemStack(Material.INK_SACK, 1, (byte)1 );
            ItemStack id3 =  new ItemStack(Material.ICE);
            ItemStack id4 = new ItemStack(Material.POTION, 1, (byte)8270 );
            ItemStack id5 = new ItemStack(Material.ANVIL);
            ItemStack id6 = new ItemStack(Material.TNT);
            ItemStack id7 = new ItemStack(Material.BUCKET);
            ItemStack id8 = new ItemStack(Material.COMPASS);
            ItemStack id9 = new ItemStack(Material.EYE_OF_ENDER);
            
            if(args.length == 1) {
            	target = args[0];
            } else {
            	target = "";
            }
			
            ItemMeta id0_meta = id0.getItemMeta();
            id0_meta.setDisplayName("§9[§cMute L§9]");
            ArrayList<String> id0_description = new ArrayList<>();
            id0_description.add("§f[§d§oLow Severity (10 min)§f]");
            id0_meta.setLore(id0_description);
            id0.setItemMeta(id0_meta);

            ItemMeta id1_meta = id1.getItemMeta();
            id1_meta.setDisplayName("§9[§cMute M§9]");
            ArrayList<String> id1_description = new ArrayList<>();
            id1_description.add("§f[§d§oMedium Severity (1 hour)§f]");
            id1_meta.setLore(id1_description);
            id1.setItemMeta(id1_meta);
            
            ItemMeta id2_meta = id2.getItemMeta();
            id2_meta.setDisplayName("§9[§cMute H§9]");
            ArrayList<String> id2_description = new ArrayList<>();
            id2_description.add("§f[§d§oHigh Severity (3 hours)§f]");
            id2_meta.setLore(id2_description);
            id2.setItemMeta(id2_meta);
            
            ItemMeta id3_meta = id0.getItemMeta();
            id3_meta.setDisplayName("§9[§cFrozen§9]");
            ArrayList<String> id3_description = new ArrayList<>();
            id3_description.add("§f[§d§oArrest Player§f]");
            id3_meta.setLore(id3_description);
            id3.setItemMeta(id3_meta);
            
            ItemMeta id4_meta = id0.getItemMeta();
            id4_meta.setDisplayName("§9[§cVanish§9]");
            ArrayList<String> id4_description = new ArrayList<>();
            id4_description.add("§f[§d§oMakes you invisible to other players§f]");
            id4_meta.setLore(id4_description);
            id4.setItemMeta(id4_meta);
            
            ItemMeta id5_meta = id0.getItemMeta();
            id5_meta.setDisplayName("§9[§cWarn§9]");
            ArrayList<String> id5_description = new ArrayList<>();
            id5_description.add("§f[§d§oWarns a player with a kick§f]");
            id5_meta.setLore(id5_description);
            id5.setItemMeta(id5_meta);
            
            ItemMeta id6_meta = id0.getItemMeta();
            id6_meta.setDisplayName("§9[§cPunish§9]");
            ArrayList<String> id6_description = new ArrayList<>();
            id6_description.add("§f[§d§oBans a player from a game for an hour§f]");
            id6_meta.setLore(id6_description);
            id6.setItemMeta(id6_meta);
            
            ItemMeta id7_meta = id0.getItemMeta();
            id7_meta.setDisplayName("§9[§cClear Chat§9]");
            ArrayList<String> id7_description = new ArrayList<>();
            id7_description.add("§f[§d§oClears the chat for all the players§f]");
            id7_meta.setLore(id7_description);
            id7.setItemMeta(id7_meta);
            
            ItemMeta id8_meta = id0.getItemMeta();
            id8_meta.setDisplayName("§9[§cTeleport§9]");
            ArrayList<String> id8_description = new ArrayList<>();
            id8_description.add("§f[§d§oTeleports to a player§f]");
            id8_meta.setLore(id8_description);
            id8.setItemMeta(id8_meta);
            
            ItemMeta id9_meta = id9.getItemMeta();
            id9_meta.setDisplayName("§9[§cEagle§9]");
            ArrayList<String> id9_description = new ArrayList<>();
            id9_description.add("§f[§d§oMakes you watch all of the players§f]");
            id9_meta.setLore(id9_description);
            id9.setItemMeta(id9_meta);
 
            ItemStack[] menu_items = {
air,air,air,air,air,air,air,air,air,
air,id0,air,air,id3,air,air,id4,air,
air,id1,air,id5,air,id6,air,id7,air,
air,id2,air,air,id8,air,air,id9,air,
air,air,air,air,air,air,air,air,air};
            gui.setContents(menu_items);
            player.openInventory(gui);
 
        }
 
        return true;
    }

;
	
	@EventHandler
    public void clickEvent(InventoryClickEvent event) throws InterruptedException{
        if(event.getClickedInventory().getTitle().equalsIgnoreCase("§5✪ §bStaff Menu §5✪")){
            Player player = (Player) event.getWhoClicked();
            jugatori = (Player) event.getWhoClicked();
            objetivo = Bukkit.getPlayerExact(command.target);
            if ((event.getCurrentItem()).getType() == Material.INK_SACK) {
            	player.closeInventory();
            	if (target != "") {
	            	if (event.getCurrentItem().getItemMeta().getDisplayName() == "§9[§cMute L§9]") {
	            		tempo = Main.var1;
	            	} else if (event.getCurrentItem().getItemMeta().getDisplayName() == "§9[§cMute M§9]") {
	            		tempo = Main.var2;
	            	} else if (event.getCurrentItem().getItemMeta().getDisplayName() == "§9[§cMute H§9]") {
	            		tempo = Main.var3;
	            	}
	                mute threading = new mute();
	                Thread t = new Thread(threading);
	                t.start();
            	} else {
            		player.sendMessage(Main.var27);
            	}

            } else if ((event.getCurrentItem()).getType() == Material.ICE) {
            	player.closeInventory();
            	if (target != "") {
	            	Player objetivo = Bukkit.getPlayerExact(command.target);
	            	if (frozen.contains(objetivo.getName())) {
	            		frozen.remove(objetivo.getName());
	            		player.sendMessage(Main.var13.replace("<player>",objetivo.getName()));
	            		objetivo.sendMessage(Main.var7);
	            	} else {
	            		frozen.add(objetivo.getName());
	            		player.sendMessage(Main.var23.replace("<player>",objetivo.getName()));
	            		objetivo.sendMessage(Main.var22);
	            	}
            	} else {
            		player.sendMessage(Main.var27);
            	}

            } else if ((event.getCurrentItem()).getType() == Material.POTION) {
            	player.closeInventory();
            	if (target == "") {
	            	if (vanish.contains(player.getName())){
	            		vanish.remove(player.getName());
	            		player.sendMessage(Main.var15);
		            	for (Player players:Bukkit.getOnlinePlayers()) {
		            		players.showPlayer(player);
		            	}
	            	} else {
	            		vanish.add(player.getName());
	            		player.sendMessage(Main.var14);
		            	for (Player players:Bukkit.getOnlinePlayers()) {
		            		players.hidePlayer(player);
		            	}
	            	}
            	} else {
            		player.sendMessage(Main.var28);
            	}
            } else if ((event.getCurrentItem()).getType() == Material.TNT){
            	player.closeInventory();
            	if (target != "") {
	            	if (ban.contains(target)) {
	            		ban.remove(target);
	            		player.sendMessage(Main.var24.replace("<player>",target));
	            	} else {
	            		ban.add(objetivo.getPlayer().getName());
	            		objetivo.kickPlayer(Main.var9);
	            		player.sendMessage(Main.var26.replace("<player>",objetivo.getPlayer().getName()));
	                    ban thpun = new ban();
	                    Thread thre = new Thread(thpun);
	                    thre.start();
	            	}
            	} else {
            		player.sendMessage(Main.var27);
            	}
            } else if ((event.getCurrentItem()).getType() == Material.ANVIL) {
            	player.closeInventory();
            	if (target != "") {
	            	objetivo.kickPlayer(Main.var10);
	            	player.sendMessage(Main.var12.replace("<player>",objetivo.getName()));
            	} else {
            		player.sendMessage(Main.var27);
            	}
            } else if ((event.getCurrentItem()).getType() == Material.COMPASS) {
            	player.closeInventory();
            	if (target != "") {
	            	player.teleport(objetivo);
	            	player.sendMessage(Main.var16.replace("<player>",objetivo.getName()));
            	} else {
            		player.sendMessage(Main.var27);
            	}
           } else if ((event.getCurrentItem()).getType() == Material.BUCKET){
        	   player.closeInventory();
        	   if (target == "") {
	            	for (int bccuantity = 0; bccuantity < 30; bccuantity++) {
	            		Bukkit.broadcastMessage("");
	            	}
        	   } else {
        		   player.sendMessage(Main.var28);
        	   }
            } else if ((event.getCurrentItem()).getType() == Material.EYE_OF_ENDER) {
            	player.closeInventory();
            	if (target == "") {
	            	if (watcher.contains(player.getName())){
	            		player.sendMessage(Main.var19);
	            		watcher.remove(player.getName());
	                	if (Main.var0.contains("survival") || Main.var0.contains("0")) {player.setGameMode(GameMode.SURVIVAL);}
	                	else if (Main.var0.contains("creative") || Main.var0.contains("1")) {player.setGameMode(GameMode.CREATIVE);}
	                	else if (Main.var0.contains("adventure") || Main.var0.contains("2")) {player.setGameMode(GameMode.ADVENTURE);}
	                	else if (Main.var0.contains("spectator") || Main.var0.contains("3")) {player.setGameMode(GameMode.SPECTATOR);}
	            	} else {
	            		player.sendMessage(Main.var18);
	            		watcher.add(player.getName());
	            		player.setGameMode(GameMode.SPECTATOR);
	                    watcher threading = new watcher();
	                    Thread screen = new Thread(threading);
	                    screen.start();
	            	}
            	} else {
            		player.sendMessage(Main.var28);
            	}
            }
            event.setCancelled(true);
        }
    }
}

