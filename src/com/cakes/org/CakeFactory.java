package com.cakes.org;

public class CakeFactory implements Factory {

    public Cake createCake(String cakeName) {
        Cake cake = null;

        if (cakeName.equals("BlackForest")) {
            cake = new BlackForest();
        } else if (cakeName.equals("BlueBerry")) {
            cake = new BlueBerry();
        } else if (cakeName.equals("LitchiGateaux")) {
            cake = new LitchiGateaux();
        }
        return cake;
    }
}
