package Homework_Film;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Homework_Film.Film> films;
    public Model() {
        this.films = new LinkedHashMap<>();
    }
    public void addFilm(Map dictFilm){
        Homework_Film.Film film = new Homework_Film.Film(dictFilm);
        films.put((String) dictFilm.get("название"), film);

    }
    public Collection getAllFilms(){
        return films.values();
    }
}
class Film{
    private String title;
    private String genre;
    private String author;
    private String year;
    private String studio;
    private String actors;
    public Film(Map dictFilm) {
        this.title = (String) dictFilm.get("название");
        this.genre = (String) dictFilm.get("жанр");
        this.author = (String) dictFilm.get("режиссёра");
        this.year = (String) dictFilm.get("год выпуска");
        this.studio = (String) dictFilm.get("студию");
        this.actors = (String) dictFilm.get("актёров");
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getAuthor() {
        return author;
    }
    public String getYear() {
        return year;
    }
    public String getStudio() {
        return studio;
    }
    public String getActors(){
        return actors;
    }
    @Override
    public String toString() {
        return title + " (" + author + ')';
    }
}
