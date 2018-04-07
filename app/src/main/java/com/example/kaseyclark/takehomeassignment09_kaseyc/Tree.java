package com.example.kaseyclark.takehomeassignment09_kaseyc;

/**
 * Created by kaseyclark on 4/7/18.
 */

public class Tree {
    private String kindOfTree;
    private boolean isAlive;
    private int height;

    public String getKindOfTree() {
        return kindOfTree;
    }

    public void setKindOfTree(String kindOfTree) {
        this.kindOfTree = kindOfTree;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Tree(String kindOfTree, boolean isAlive, int height) {

        this.kindOfTree = kindOfTree;
        this.isAlive = isAlive;
        this.height = height;
    }
}
