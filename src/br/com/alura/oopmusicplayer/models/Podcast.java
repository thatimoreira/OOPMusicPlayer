package br.com.alura.oopmusicplayer.models;

public class Podcast extends Audio {
    private String  host;
    private String description;

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRating() {
        if (this.getTotalLikes() > 999) {
            return 5;
        } else if (this.getTotalLikes() > 700) {
            return 4;
        } else if (this.getTotalLikes() > 500) {
            return 3;
        } else if (this.getTotalLikes() > 300) {
            return 2;
        } else if (this.getTotalLikes() > 150) {
            return  1;
        } else {
            return 0;
        }
    }
}
