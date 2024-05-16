package br.com.alura.oopmusicplayer.models;

public class Podcast extends Audio {
    private String  host;
    private String  decsription;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }
}
