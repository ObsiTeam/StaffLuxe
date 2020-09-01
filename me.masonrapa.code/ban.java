package me.masonrapa.code;

import me.masonrapa.code.Main;
import me.masonrapa.code.command;

import java.util.concurrent.TimeUnit;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ban implements Listener, Runnable {

	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
		Player typ = event.getPlayer();
		if (command.ban.contains(typ.getPlayer().getName())) {
			typ.kickPlayer(Main.var9);
    	}
    }

	public void run() {
		try {
			TimeUnit.MINUTES.sleep(Integer.parseInt(Main.var4));
			command.jugatori.sendMessage(Main.var24.replace("<player>",command.objetivo.getPlayer().getName()));
			command.ban.remove(command.objetivo.getPlayer().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
