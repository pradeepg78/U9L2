public class AnimalRunner {
    public static void main(String[] args) {
        Animal a = new Animal("Lucky", 3, false, true);

        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.isVaccinated());
        System.out.println(a.isBath());
        a.adopt();
        a.fed();
        a.bathe();

        Dog maDawg = new Dog("Tommy", 5, true, false, true, 0);

        System.out.println(maDawg.getName());
        System.out.println(maDawg.getAge());
        System.out.println(maDawg.isVaccinated());
        System.out.println(maDawg.isBath());
        maDawg.adopt();
        maDawg.fed();
        maDawg.bathe();

        System.out.println(maDawg.hasBeenWalked());
        System.out.println(maDawg.getNumBarks());
        maDawg.walk();
        maDawg.bark();

        Cat myCat = new Cat("Angelica", 3, true, true, false, 3);
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        System.out.println(myCat.isVaccinated());
        System.out.println(myCat.isBath());
        myCat.adopt();
        myCat.fed();
        myCat.bathe();
        System.out.println(myCat.isHasPlayedWith());
        System.out.println(myCat.getNumMeows());
        myCat.play();
        myCat.meow();


    }
}
