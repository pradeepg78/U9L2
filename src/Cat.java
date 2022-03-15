public class Cat extends Animal {
    public boolean played;
    public int numMeows;

    public Cat(String name, int age, boolean vaccinated, boolean bath, boolean played , int numMeows)
    {
        super(name, age, vaccinated, bath);
        this.played = played;
        this.numMeows = numMeows;
    }

    public void play()
    {
        System.out.println("Cat has been played with.");
    }

    public boolean isHasPlayedWith() {
        return played;
    }

    public void meow()
    {
        System.out.println("Meeeeeeeeeooooooooooowwwwwwwwwwwwwwwwww. ");
        numMeows++;
    }

    public int getNumMeows() {
        return numMeows;
    }
}
