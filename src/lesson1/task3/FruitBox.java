package lesson1.task3;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitBox<T extends Fruit> {
    ArrayList<T> fruitBox = new ArrayList<>();

    public FruitBox(T...fruits){
        fruitBox = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    public void addFruit (T fruit){
        fruitBox.add(fruit);
    }

    public float getBoxWeight(){
        float boxWeight = 0f;

        for (int i = 0; i< fruitBox.size(); i++) {
            boxWeight += fruitBox.get(i).getWeight();
        }
        return boxWeight;
    }

    public boolean compare (FruitBox<? extends Fruit> anotherBox){
        return Math.abs(this.getBoxWeight()-anotherBox.getBoxWeight()) < 0.0001f;
    }

    public void repackFruits (FruitBox<T> anotherBox){
        anotherBox.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }

}
