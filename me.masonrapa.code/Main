package me.masonrapa.code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

	
public class Main extends JavaPlugin implements Listener, CommandExecutor{
	
	public static String var0;
	public static String var1;
	public static String var2;
	public static String var3;
	public static String var4;
	public static String var5;
	public static String var6;
	public static String var7;
	public static String var8;
	public static String var9;
	public static String var10;
	public static String var11;
	public static String var12;
	public static String var13;
	public static String var14;
	public static String var15;
	public static String var16;
	public static String var17;
	public static String var18;
	public static String var19;
	public static String var20;
	public static String var21;
	public static String var22;
	public static String var23;
	public static String var24;
	public static String var25;
	public static String var26;
	public static String var27;
	public static String var28;
	public static String everything;

	public void onEnable() {
		File configFile = new File(this.getDataFolder()+"plugins/StaffLuxe/config.yml");
		if(!configFile.exists()) {
			try {
				Path path = Paths.get("plugins/StaffLuxe");
				Files.createDirectories(path);
			} catch (IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage("§d"+e);
			}
			try {
				File myObj = new File("plugins/StaffLuxe/config.yml");
				myObj.createNewFile();
			} catch (IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage("§d"+e);
			}
			try {
				FileWriter file = new FileWriter ("plugins/StaffLuxe/config.yml");
				file.write("Autogamemode: survival\r\n" + 
"Mute L: 10 #In Minutes\r\n" + 
"Mute M: 10 #In Minutes\r\n" + 
"Mute H: 10 #In Minutes\r\n" + 
"Ban: 10 #In Minutes\r\n" + 
"Mute Message: &4[&fStaffLuxe&4] &7You have been temporally &6muted &7for &e<time> &7minutes\r\n" + 
"Mute Event: &5[&fStaffLuxe&4] &bYou are not allowed to send messages\r\n" + 
"Frozen Message: &4[&fStaffLuxe&4] &7You have been temporally &6frozen\r\n" + 
"Frozen Event: &5[&fStaffLuxe&5] &bYou are not allowed to move\r\n" + 
"Ban Message: &4[&fStaffLuxe&4] &7You have been &6banned &7from this server\r\n" + 
"Warn Message: &4[&fStaffLuxe&4] &7You have been &6kicked &7from this server\r\n" + 
"Mute Action: &4[&fStaffLuxe&4] &cThe player &e<player> &chave been muted for &e<time> &cminutes\r\n" + 
"Warn Action: &4[&fStaffLuxe&4] &cThe player &e<player> &chave been kicked\r\n" + 
"Frozen Action: &4[&fStaffLuxe&4] &cThe player &e<player> &chave been frozen\r\n" + 
"Vanish Enable Action: &2[&fStaffLuxe&2] &aYou have been vanished\r\n" + 
"Vanish Disable Action: &4[&fStaffLuxe&4] &cYou have been unvanished\r\n" + 
"Teleport Action: &6[&fStaffLuxe&6] &bYou have been teleported to &e<player>\r\n" + 
"Chat Clear Action: &6[&fStaffLuxe&6] &bYou cleared the chat\r\n" + 
"Eagle Enable Action: &2[&fStaffLuxe&2] &aYou enabled eagle mode\r\n" + 
"Eagle Disable Action: &4[&fStaffLuxe&4] &cYou disabled eagle mode\r\n" + 
"Unmute Message: &2[&fStaffLuxe&2] &aYou have been &6unmuted\r\n" + 
"Unmute Action: &2[&fStaffLuxe&2] &aThe player &e<player> &chave been unmuted\r\n" + 
"Unfrozen Message: &2[&fStaffLuxe&2] &aYou have been &6unfrozen\r\n" + 
"Unfrozen Action: &2[&fStaffLuxe&2] &aThe player &e<player> &ahave been unfrozen\r\n" + 
"Unban Action: &2[&fStaffLuxe&2] &aThe player &e<player> &ahave been unbaned\r\n" + 
"Eagle Message: &6[&fStaffLuxe&6] &bWatching player: &e<player>\r\n" + 
"Ban Action: &4[&fStaffLuxe&4] &cThe player &e<player> &cHave been banned\r\n" + 
"Arg: &6[&fStaffLuxe&6] &bYou need to set a Target &d(/staff <player>)\r\n" + 
"Noarg: &6[&fStaffLuxe&6] &bYou dont'need to set a Target &d(/staff)");
				file.close();
			} catch (IOException e) {
				
			}
			Bukkit.getServer().getConsoleSender().sendMessage("§a[§fStaffLuxe§a] §7Creating §6config.yml §7in §6'StaffLuxe' §7Folder!");
		} else {
			Bukkit.getServer().getConsoleSender().sendMessage("§a[§fStaffLuxe§a] §7The data §6config.yml §7data have been successfully loaded!");
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader("plugins/StaffLuxe/config.yml"));
			try {
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();

			    while (line != null) {
			        sb.append(line);
			        sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
			    everything = sb.toString();
			} finally {
			    br.close();
			}
			String[] data = everything.replace("&","§").replace("\r","").split("\n");
        	var0 = data[0].replace("Autogamemode: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var0);
	        var1 = data[1].replace("Mute L: ","").replace(" #In Minutes","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var1);
	        var2 = data[2].replace("Mute M: ","").replace(" #In Minutes","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var2);
	        var3 = data[3].replace("Mute H: ","").replace(" #In Minutes","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var3);
	        var4 = data[4].replace("Ban: ","").replace(" #In Minutes","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var4);
	        var5 = data[5].replace("Mute Message: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var5);
	        var6 = data[6].replace("Mute Event: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var6);
	        var7 = data[7].replace("Frozen Message: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var7);
	        var8 = data[8].replace("Frozen Event: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var8);
	        var9 = data[9].replace("Ban Message: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var9);
	        var10 = data[10].replace("Warn Message: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var10);
	        var11 = data[11].replace("Mute Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var11);
	        var12 = data[12].replace("Warn Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var12);
	        var13 = data[13].replace("Frozen Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var13);
	        var14 = data[14].replace("Vanish Enable Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var14);
	        var15 = data[15].replace("Vanish Disable Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var15);
	        var16 = data[16].replace("Teleport Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var16);
	        var17 = data[17].replace("Chat Clear Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var17);
	        var18 = data[18].replace("Eagle Enable Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var18);
	        var19 = data[19].replace("Eagle Disable Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var19);
	        var20 = data[20].replace("Unmute Message: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var20);
	        var21 = data[21].replace("Unmute Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var21);
	        var22 = data[22].replace("Unfrozen Message: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var22);
	        var23 = data[23].replace("Unfrozen Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var23);
	        var24 = data[24].replace("Unban Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var24);
	        var25 = data[25].replace("Eagle Message: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var25);
	        var26 = data[26].replace("Ban Action: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var26);
	        var27 = data[27].replace("Arg: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var27);
	        var28 = data[28].replace("Noarg: ","");
	        Bukkit.getServer().getConsoleSender().sendMessage("§2[§fStaffLuxe§2] §7Variable Loaded: "+var28);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		this.getCommand("staff").setExecutor(new command());
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new command(), this);
		getServer().getPluginManager().registerEvents(new mute(), this);
		getServer().getPluginManager().registerEvents(new frozen(), this);
		getServer().getPluginManager().registerEvents(new ban(), this);
		Bukkit.getServer().getConsoleSender().sendMessage("§a[§fStaffLuxe§a] §7Loading...");
		Bukkit.getServer().getConsoleSender().sendMessage("§a[§fStaffLuxe§a] §aStarting Plugin!");
	}

	public void onDisable() {
		Bukkit.getServer().getConsoleSender().sendMessage("§a[§fStaffLuxe§a] §7Stopping Plugin!");
	}    

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
    	Player jugador = event.getPlayer();
    	if (Main.var0.contains("survival") || Main.var0.contains("0")) {jugador.setGameMode(GameMode.SURVIVAL);}
    	else if (Main.var0.contains("creative") || Main.var0.contains("1")) {jugador.setGameMode(GameMode.CREATIVE);}
    	else if (Main.var0.contains("adventure") || Main.var0.contains("2")) {jugador.setGameMode(GameMode.ADVENTURE);}
    	else if (Main.var0.contains("spectator") || Main.var0.contains("3")) {jugador.setGameMode(GameMode.SPECTATOR);}
    }
	
}
