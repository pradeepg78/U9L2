public class APCSA extends Classes{
    private String language;

    public APCSA(String school, String room, int period, String language) {
        super(school, room, period);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
