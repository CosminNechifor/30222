package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

/**
 * Created by p on 10/17/2016.
 */
public class Map {
    public int[] resources;

    public Map(){
        resources = new int[Constants.MAP_RESOURCES_NUMBER];
        for(int i = 0; i < resources.length; i++){
            resources[i] = Resources.generateValuableResource();
        }
    }

    public void generateResources(){
        for(int i = 0; i < resources.length; i++){
            resources[i] = Resources.generateValuableResource();
        }
    }

    public boolean consumeResource(int resource){
        boolean foundOrNot = false;

        for(int i = 0; i < resources.length; i++){
            if(resource == resources[i]){
                foundOrNot = true;
                resources[i] = -1;
            }
        }
        return foundOrNot;
    }

    public void showResources(){
        for(int i = 0; i < resources.length; i++){
            System.out.printf(" %d,", resources[i]);
        }
    }
}
