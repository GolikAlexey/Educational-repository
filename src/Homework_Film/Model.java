package Homework_Film;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Homework_Film.Film> films;
    private String dbName;
    public Model() {
        this.dbName = "db_films.txt";
        this.films = loadData();
    }
    public void addFilm(Map dictFilm){
        Homework_Film.Film film = new Homework_Film.Film(dictFilm);
        films.put((String) dictFilm.get("название"), film);

    }
    public Collection getAllFilms(){
        return films.values();
    }
    public Map getSingleFilm(String userTitle){
        Film film = films.get(userTitle);
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название", film.getTitle());
        dictFilm.put("жанр", film.getGenre());
        dictFilm.put("режиссёр", film.getAuthor());
        dictFilm.put("год выпуска", film.getYear());
        dictFilm.put("студия", film.getStudio());
        dictFilm.put("актёры", film.getActors());
        return dictFilm;
    }
    public Film removeFilm(String userTitle){
        return films.remove(userTitle);
    }
    public void saveData(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbName))){
            oos.writeObject(films);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public LinkedHashMap loadData(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbName))){
            return (LinkedHashMap) ois.readObject();
        } catch (Exception ex){
            return new LinkedHashMap<>();
        }
    }
}
class Film implements Serializable{
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
