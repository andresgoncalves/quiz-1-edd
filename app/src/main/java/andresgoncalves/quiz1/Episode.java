package andresgoncalves.quiz1;

/**
 *
 * @author Andres
 */
public class Episode {
    private String name;
    private String sinopsis;

    public Episode(String name, String sinopsis) {
        this.name = name;
        this.sinopsis = sinopsis;
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
    
    
}
