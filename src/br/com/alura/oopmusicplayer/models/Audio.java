package br.com.alura.oopmusicplayer.models;

public class Audio {
    private String  title;
    private int     totalPlays;
    private int     totalLikes;
    private int     rating;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return this.totalPlays;
    }

    public int getTotalLikes() {
        return this.totalLikes;
    }

    public int getRating() {
        return this.rating;
    }

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalPlays++;
    }
}
