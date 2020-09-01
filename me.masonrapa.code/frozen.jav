package me.masonrapa.code;

import me.masonrapa.code.Main;
import me.masonrapa.code.command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class frozen implements Listener{

	@EventHandler
    public void onPlayerMoveBlock(PlayerMoveEvent event){
		Player player = event.getPlayer();
		if (command.frozen.contains(player.getName())) {
			player.sendMessage(Main.var8);
            event.setCancelled(true);
    	}
    }
}
