package services.factories;

/**
 * Created by p on 10/31/2016.
 */
public final class Constants {
    public static final class Species{
        public static final String MAMMALS = "Mammals";
        public static final String REPTILES = "Reptiles";
        public static final String BIRDS = "Birds";
        public static final String AQUATICS = "Aquatics";
        public static final String INSECTS = "Insects";
    }
    public static final class Animals {
        public static final class Mammals {
            public static final String COW = "Cow";
            public static final String MONKEY = "Monkey";
            public static final String TIGER = "Tiger";
        }
        public static final class Insect{
            public static final String SPIDER = "Spider";
            public static final String COCKROACH = "Cockroach";
            public static final String BUTTERFLY = "Butterfly";
        }
        public static final class Bird{
            public static final String EAGLE = "Eagle";
            public static final String OWL = "Owl";
            public static final String SWALLOW = "Swallow";
        }
        public static final class Reptile{
            public static final String CHAMELEON = "Chameleon";
            public static final String CROCODILE = "Crocodile";
            public static final String LIZARD = "Lizard";
        }
        public static final class Aquatic{
            public static final String FISH = "Fish";
            public static final String DOLPHIN = "Dolphin";
            public static final String OTTER = "Otter";
        }
    }

    public static final class Employee{
        public static final class Caretakers{
            public static final String TCO_SUCCESS = "SUCCESS";
            public static final String TCO_KILLED = "KILLED";
            public static final String TCO_NO_TIME = "NO_TIME";
        }
        public static final String CARETAKER = "Caretaker";
        public static final String[] NAME = {"Alex", "George", "Radu", "Andrei", "Cosmin", "Peter"};

    }
    public static final class numbers{
        public static final int ONETHOUSAND = 1000;
        public static final int NOOFWORKERS = 10;
        public static final int SIZE_OF_ZOO = 50;
        public static final double CROCODILE_KILLING_PREDISPOSITION = 0.50;
        public static final double SPIDER_KILLING_PREDISPOSITION = 0.25;
        public static final double TIGER_KILLING_PREDISPOSITION = 0.50;
    }

}
