package Speed;

public enum Vehicle {
    CAR ("Типичная скорость составляет 65 миль в час."),
    TRUCK("Типичная скорость составляет 55 миль в час."),
    AIRPLANE("Типичная скорость составляет 600 миль в час."),
    TRAIN("Типичная скорость составляет 70 миль в час."),
    BOAT("Типичная скорость составляет 22 мили в час.");
    private String title;
    Vehicle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
