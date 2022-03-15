public class Dog extends Animal{
    private boolean walked;
    public int numBarks;

    public Dog(String name, int age, boolean vaccinated,boolean bath, boolean walked, int numBarks)
    {
        super(name, age, vaccinated, bath);
        this.walked = walked;
        this.numBarks = numBarks;
    }

    public boolean hasBeenWalked() {
        return walked;
    }

    public void walk()
    {
        System.out.println("Dog has been walked.");
    }

    public void bark()
    {
        System.out.println("Woof woof! ");
        numBarks++;
    }


    public int getNumBarks() {
        return numBarks;
    }
}
