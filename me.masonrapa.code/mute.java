package me.masonrapa.code;

import me.masonrapa.code.Main;
import me.masonrapa.code.command;

import java.util.concurrent.TimeUnit;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class mute extends Thread implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if(command.mute.contains(player.getName())) {
            player.sendMessage(Main.var6);
            event.setCancelled(true);
        }
    }
   
    
	public void run() {
        try {
            if(command.mute.contains(command.objetivo.getName())) {
            	command.mute.remove(command.objetivo.getName());
                command.jugatori.sendMessage(Main.var21.replace("<player>", command.objetivo.getName()));
                command.objetivo.sendMessage(Main.var20);
            } else {
            	command.mute.add(command.objetivo.getName());
            	command.jugatori.sendMessage(Main.var11.replace("<player>",command.objetivo.getName()).replace("<time>",command.tempo));
            	command.objetivo.sendMessage(Main.var5.replace("<time>",command.tempo));
            	TimeUnit.MINUTES.sleep(Integer.parseInt(command.tempo));
            	if (command.mute.contains(command.objetivo.getName())) {
                	command.mute.remove(command.objetivo.getName());
                	command.jugatori.sendMessage(Main.var21.replace("<player>", command.objetivo.getName()));
                    command.objetivo.sendMessage(Main.var20);
            	}
            }
        } catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
