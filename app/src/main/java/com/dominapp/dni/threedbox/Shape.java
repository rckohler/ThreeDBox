package com.dominapp.dni.threedbox;

import java.util.Random;
import java.util.Vector;

/**
 * Created by rck on 10/19/2015.
 */
public class Shape {
    Vector<Block> blocks = new Vector<>();
    Random rand = new Random();
    public Shape(Vector<Block> blocks){
        this.blocks = blocks;
    }
    private void createShape(){
        int[][][] location = new int[5][5][5];
        int x = rand.nextInt(5);
        int y = rand.nextInt(5);
        int z = rand.nextInt(5);
        location[x][y][z] = 1;
    }

}
