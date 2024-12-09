package Cars;

public class Automobile {
    private String name;
    private String year;
    private String brand;
    private String power;
    private String color;
    private String price;

    public Automobile(String name, String year, String brand, String power, String color, String price){
        this.name = name;
        this.year = year;
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
