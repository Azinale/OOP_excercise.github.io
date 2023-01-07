package ex1_6;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat("Dog");
        Animal animal2 = new Dog("Cat");
        animal2.greets();
        animal.greets();
        Dog bDog = new Dog("small cat");
        bDog.greets();
        bDog.greets(bDog);
        BigDog sCat = new BigDog("Pink Cat");
        sCat.greets();
        sCat.greets(bDog);
        sCat.greets(sCat);
    }
}
