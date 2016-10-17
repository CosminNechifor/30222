package underworld.models;

import underworld.utils.Resources;

/**
 * Created by p on 10/17/2016.
 */
public class Miner {
    private String name;
    private int[] backpack;
    private int backpackIndex;

    public Miner(String name){
        this.name = name;
        backpack = new int[5];
        this.backpackIndex = 0;

        for(int i = 0; i < backpack.length; i++){
            backpack[i] = -1;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int sleep(){
        int resource = Resources.generateResources();
        return resource;
    }

    public int dig(){
        int resource;

        if(backpackIndex < 5 && (backpack[backpackIndex] == -1)){
            resource = Resources.generateResources();
            backpack[backpackIndex] = resource;
            backpackIndex++;
            return resource;
        }
        else{
            return 0;
        }
    }

    private boolean isBackpackFull(){
        if(backpackIndex >= 5){
            return true;
        }
        return false;
    }

    public void showBackpack(){
        for(int i: backpack){
            System.out.printf(" %d", i);
        }
        if(backpackIndex < 4){
            System.out.printf(" (%d) backpack slots left!", getNumberOfBackpackSlots());
        }
        else{
            System.out.printf(" (%d) backback slot left!", getNumberOfBackpackSlots());
        }
    }

    private int getNumberOfBackpackSlots(){
        return 5 - backpackIndex;
    }
}
