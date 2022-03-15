public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean bath;

    public Animal (String name, int age, boolean vaccinated, boolean bath)
    {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.bath = bath;
    }

    public void adopt()
    {
        System.out.println("I have been adopted!");
    }

    public void fed()
    {
        System.out.println("I am fed.");
    }

    public void bathe()
    {
        System.out.println("I have been bathe.");
    }

    public String getName()
    {
        return name;
    }

    public boolean isBath() {
        return bath;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public int getAge() {
        return age;
    }
}
