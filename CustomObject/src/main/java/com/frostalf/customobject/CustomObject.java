/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frostalf.customobject;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

/**
 *
 * @author Frostalf
 */
public class CustomObject extends JavaPlugin {

    private static CustomObject plugin;
    private PrisonMines prisonMines;
        private PrisonMines prisonMines2;
    private List<PrisonMines> prisonMinesList = new ArrayList<>();

    @Override
    public void onEnable() {
        plugin = this;
    }

    public void getPrisonMines() {
        Vector vec = new Vector(12, 0, 12);
        Vector vec2 = new Vector(20,20,20);
        String name = "nothing";
        Vector vec3 = new Vector(100, 0, -100);
        Vector vec4 = new Vector(500,255,-500);
        String name2 = "something";
        prisonMines = new PrisonMines(vec, vec2, name);
        prisonMines2 = new PrisonMines(vec3, vec4, name2);
        prisonMinesList.add(prisonMines);
        prisonMinesList.add(prisonMines2);
        prisonMinesList.get(0).getMineName();
        prisonMinesList.get(1).getMineName();
    }

    public static CustomObject getInstance() {
        return plugin;
    }
}
