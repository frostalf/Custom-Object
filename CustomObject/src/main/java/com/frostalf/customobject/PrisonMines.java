/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frostalf.customobject;

import org.bukkit.util.Vector;

/**
 *
 * @author Frostalf
 */
public class PrisonMines {

    private Vector vector1;
    private Vector vector2;
    private String name;

    public PrisonMines(Vector vec1, Vector vec2, String name) {
        this.vector1 = vec1;
        this.vector2 = vec2;
        this.name = name;
    }

    public String getMineName() {
        return this.name;
    }

    public Vector getVector1() {
        return this.vector1;
    }

    public Vector getVector2() {
        return this.vector2;
    }
}
