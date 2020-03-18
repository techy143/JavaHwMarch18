package techy.java.hw;

import java.util.ArrayList;

public class JavaArrayListHw {


    public static void main (String [] args) {

        // This Array how you add manually.

        String[] food = new String[4];
        food[0] = "Rice";
        food[1] = "Egg";
        food[2] = "Beef";
        food[3] = "Daal";
        System.out.println(food [0]);

        //  ArrayList.....

        ArrayList foodList = new ArrayList();
        foodList.add("Rice");
        foodList.add("Egg");
        foodList.add("Beef");
        foodList.add("Daal");
        foodList.remove(3);
        foodList.remove("Rice");

        System.out.println(foodList.contains("Beef"));
        System.out.println(foodList);


    }
}