package andresgoncalves.quiz1;

/**
 *
 * @author Andres
 */
public class Series {
    public static final int ALL = 0;
    public static final int KIDS = 1;
    public static final int ADULTS = 2;
    
    private String name;
    private String sinopsis;
    private int type;
    private List<Episode> episodes = new List<Episode>();

    public Series(String name, String sinopsis, int type) {
        this.name = name;
        this.sinopsis = sinopsis;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
