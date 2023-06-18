package _07_Inheritance_Lab_04_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {


    public E getRandomElement(){
        int end = super.size();
        Random rand = new Random();
        int randIndex = rand.nextInt(end);
        return remove(randIndex);
    }

}
