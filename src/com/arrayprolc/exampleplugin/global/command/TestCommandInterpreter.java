package com.arrayprolc.exampleplugin.global.command;

import com.arrayprolc.surge.exclusive.listener.sender.CommandSender;
import com.arrayprolc.surge.exclusive.types.entity.Player;
import com.arrayprolc.surge.global.command.Command;
import com.arrayprolc.surge.global.command.CommandListener;

public class TestCommandInterpreter extends CommandListener {

    @Override
    public boolean handleCommand(CommandSender sender, Command command, String[] args) {
        if (sender.isPlayer()) {
            Player p = sender.getPlayer();
            p.teleport(p.getLocation().add(0, 3, 0));
            p.sendMessage("You have been teleported 3 blocks up");
        }
        return false;
    }

}
