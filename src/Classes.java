public class Classes {
    private String school;
    private String room;
    private int period;

    public Classes(String school, String room, int period) {
        this.school = school;
        this.room = room;
        this.period = period;
    }

    public String getSchool() {
        return school;
    }

    public String getRoom() {
        return room;
    }

    public int getPeriod() {
        return period;
    }

    public void lateBell()
    {
        System.out.println("Ringggg!! Get to class!!!!!");
    }
}
