package me.masonrapa.code;

import me.masonrapa.code.command;

import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class watcher extends Thread implements Runnable {
	
	public void run() {
		Player player = command.jugatori;
		while (command.watcher.contains(player.getName())) {
	    	for (Player players:Bukkit.getOnlinePlayers()) {
	    		if (players.getName() != player.getName() && command.watcher.contains(player.getName())) {
					player.sendMessage(Main.var25.replace("<player>", players.getName()));
					player.teleport(players);
					try {TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {e.printStackTrace();}
	    		}
	    	}
		}	
	}
}
