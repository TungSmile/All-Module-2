package th1;

import th1.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "th1.Chicken: cluck-cluck!";
    }
    public String howToEat() {
        return "could be fried";
    }
}
