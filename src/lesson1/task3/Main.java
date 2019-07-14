package lesson1.task3;

public class Main {
    public static void main(String[] args) {

        FruitBox<Apple> appleFruitBox = new FruitBox<>(new Apple(),new Apple(), new Apple(), new Apple(), new Apple());
        FruitBox<Orange> orangeFruitBox = new FruitBox<>(new Orange(), new Orange(), new Orange(),new Orange());

        System.out.println("The box of apples weight is " + appleFruitBox.getBoxWeight());
        System.out.println("The box of oranges weight is " +orangeFruitBox.getBoxWeight());
        System.out.println("Is the boxes weigh the same? - " + appleFruitBox.compare(orangeFruitBox));
        System.out.println("-------------------------------------");

        FruitBox<Apple> appleFruitBox2 = new FruitBox<>();
        FruitBox<Orange> orangeFruitBox2 = new FruitBox<>();

        appleFruitBox.repackFruits(appleFruitBox2);
        orangeFruitBox.repackFruits(orangeFruitBox2);
        System.out.println("The 1st box of apples weight is " + appleFruitBox.getBoxWeight());
        System.out.println("The 2nd box of apples weight is " + appleFruitBox2.getBoxWeight());
        System.out.println("-------------------------------------");
        System.out.println("The 1st box of oranges weight is " +orangeFruitBox.getBoxWeight());
        System.out.println("The 2nd box of oranges weight is " +orangeFruitBox2.getBoxWeight());

    }
}
