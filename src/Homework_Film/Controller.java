package Homework_Film;

import Homework_Film.Model;
import Homework_Film.View;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Homework_Film.Model filmModel;
    private Homework_Film.View userInterface;
    public Controller() {
        this.filmModel = new Model();
        this.userInterface = new View();
    }
    public void run(){
        String answer = "";
        while (!answer.equals("q")){
            answer = userInterface.waitUserAnswer();
            checkUserAnswer(answer);
        }
    }
    public void checkUserAnswer(String answer){
        if (answer.equals("1")){
            Map film = userInterface.addUserFilm();
            filmModel.addFilm(film);
        } else if (answer.equals("2")){
            Collection films = filmModel.getAllFilms();
            userInterface.showAllFilms(films);
        }
    }
}
