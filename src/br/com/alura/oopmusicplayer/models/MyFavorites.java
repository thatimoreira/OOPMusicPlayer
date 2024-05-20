package br.com.alura.oopmusicplayer.models;

public class MyFavorites {
    public void addToFavorites(Audio audio) {
        if (audio.getRating() >= 4) {
            System.out.printf("'%s' is considered an absolute success and everyone's favorite!\n", audio.getTitle());
        } else if (audio.getRating() >= 3) {
            System.out.printf("'%s' is also one that everyone is enjoying.\n", audio.getTitle());
        } else {
            System.out.printf("The rating for '%s' is below 3, not everyone is enjoying it.\n", audio.getTitle());
        }
    }
}
