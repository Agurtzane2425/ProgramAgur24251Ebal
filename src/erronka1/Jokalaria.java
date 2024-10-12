package erronka1;

public class Jokalaria {
    private String izena;
    private String abizena;
    private int urteak;
    private String taldea;

    public Jokalaria(String izena, String abizena, int urteak, String taldea) {
        this.izena = izena;
        this.abizena = abizena;
        this.urteak = urteak;
        this.taldea = taldea;
    }

    @Override
    public String toString() {
        return izena + " " + abizena + " - " + urteak + " urte - Taldea: " + taldea;
    }

    // Getter eta Setter metodoak (behar izanez gero)
    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    public int getUrteak() {
        return urteak;
    }

    public void setUrteak(int urteak) {
        this.urteak = urteak;
    }

    public String getTaldea() {
        return taldea;
    }

    public void setTaldea(String taldea) {
        this.taldea = taldea;
    }
}

