public class APUSH extends Classes{
    private String timePeriod;

    public APUSH(String school, String room, int period, String timePeriod) {
        super(school, room, period);
        this.timePeriod = timePeriod;
    }

    public String getTimePeriod() {
        return timePeriod;
    }


}
