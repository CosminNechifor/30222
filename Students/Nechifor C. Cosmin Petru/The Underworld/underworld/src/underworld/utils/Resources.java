package underworld.utils;

import java.util.Random;

/**
 * Created by p on 10/17/2016.
 */

public class Resources {
    public static Random random = new Random();

    public static int generateValuableResource(){
        int randomResource = random.nextInt(Constants.MAP_RESOURCES_NUMBER + 1);
        return randomResource;
    }

    public static int generateResources(){
        int randomResource = random.nextInt(Constants.MAP_RESOURCES_NUMBER * 2 + 2);
        return randomResource;
    }
}
