package INTERFACE_1;

import java.util.Scanner;

interface Size{
    void resizeWidth();
    void resizeHeight();
}

public class Rectangle implements Size{
    static Scanner input = new Scanner(System.in);
    private int width;
    private int height;

    public Rectangle(int width, int heigth){
        this.width = width;
        this. height = heigth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void resizeWidth(){
        int width;
        System.out.print("Введите ширину прямоугольника: ");
        if(input.hasNextInt()){
            width = input.nextInt();
            if (width >0){
                this.width = width;
            } else{
                System.out.println("Ошибка ввода");
                resizeWidth();
            }
        }else{
            System.out.println("Ошибка ввода");
            input.nextLine();
            resizeWidth();
        }
    }

    @Override
    public void resizeHeight(){
        int height;
        System.out.print("Введите высоту прямоугольника: ");
        if(input.hasNextInt()){
            height = input.nextInt();
            if (height >0){
                this.height = height;
            } else{
                resizeHeight();
            }
        }else{
            input.nextLine();
            resizeHeight();
        }
    }
}
