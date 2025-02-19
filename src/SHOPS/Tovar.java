package SHOPS;

import java.util.Scanner;

class Tovar {
    static Scanner input = new Scanner(System.in);
    private String name;
    private String code;
    private int price;
    private int quantity;
    private boolean unit;

    public Tovar(String name, String code, int price, int quantity, boolean unit) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.print("Введите название товара: ");
        this.name = input.nextLine();
    }

    public String getCode() {
        return code;
    }

    public void setCode() {
        System.out.print("Введите код товара: ");
        this.code = input.nextLine();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        System.out.print("Введите цену товара (в рублях): ");
        if(input.hasNextInt()){
            int price = input.nextInt();
            if (price>=0){
                this.price = price;
            }else{
                input.nextLine();
                setPrice();
            }
        }else{
            input.nextLine();
            setPrice();
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        System.out.print("Введите количество имеющегося в магазине товара: ");
        if(input.hasNextInt()){
            int quantity = input.nextInt();
            if (quantity>0){
                this.quantity = quantity;
            }else{
                input.nextLine();
                setQuantity();
            }
        }else{
            input.nextLine();
            setQuantity();
        }
    }

    public boolean isUnit() {
        return unit;
    }

    public void setUnit() {
        String str_kg = "кг";
        String str_shtuka = "штук";
        input.nextLine();
        System.out.print("кг или штук: ");
        String unit_str = input.nextLine();
        if(unit_str.equalsIgnoreCase(str_kg) == true){
            this.unit = true;
        }else if(unit_str.equalsIgnoreCase(str_shtuka) == true){
            this.unit = false;
        }else{
            System.out.println("Ошибка ввода. Нажмите клавишу Enter и повторите ввод.");
            setUnit();
        }
    }
}
