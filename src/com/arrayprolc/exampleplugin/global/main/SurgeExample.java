package com.arrayprolc.exampleplugin.global.main;

import java.util.ArrayList;

import com.arrayprolc.exampleplugin.global.command.TestCommandInterpreter;
import com.arrayprolc.surge.global.command.Command;
import com.arrayprolc.surge.global.main.Surge;
import com.arrayprolc.surge.global.plugin.UniversalPlugin;

public class SurgeExample extends UniversalPlugin {

    private static SurgeExample instance;
    /*
     * first argument "this": Defining the UniversalPlugin the command comes
     * from second argument, "test": The name of the command. is NOT the command
     * players can type in game. third argument, string array: A string array of
     * the strings you want players to type in (omit the /). fourth argument,
     * command listener: The command listener that will interpret the command.
     */
    private Command testCommand = new Command(this, "test", new String[] { "test" }, new TestCommandInterpreter());

    public void onEnable() {
        instance = this;
        Surge.registerPlugin(instance);
        System.out.println("SurgeExample has been loaded.");
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void getListeners() {

    }

    @Override
    public ArrayList<Command> getCommands(ArrayList<Command> list) {
        list.add(testCommand);
        return list;
    }

    @Override
    public String getModID() {
        return "surgeexample";
    }

}
