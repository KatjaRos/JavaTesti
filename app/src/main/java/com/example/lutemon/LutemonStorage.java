package com.example.lutemon;

import java.util.ArrayList;

public class LutemonStorage {

    public ArrayList<Lutemon> lutemons = new ArrayList<>();
    private static LutemonStorage storage;
    private LutemonStorage(){}

    public void addUser(Lutemon lutemon){
        lutemons.add(lutemon);
    }
    public static LutemonStorage getInstance(){
        if(storage == null){
            storage = new LutemonStorage();
        }
        return storage;
    }
    public ArrayList<Lutemon> getLutemons() {return lutemons;}

}
