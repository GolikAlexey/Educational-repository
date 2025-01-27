import java.util.LinkedList;
import java.util.ListIterator;

public class Colors {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Красный");
        colors.add("Оранжевый");
        colors.add("Жёлтый");
        colors.add("Зелёный");
        colors.add("Голубой");
        colors.add("Синий");
        colors.add("Фиолетовый");
        ListIterator<String> listIterator = colors.listIterator();
        System.out.println("Список итераторов в прямом направлении");
        while (listIterator.hasNext()){
            System.out.println("Индекс = " + listIterator.nextIndex() + ", Элемент = " + listIterator.next());
        }
        System.out.println("\nСписок итераторов в обратном направлении");
        while (listIterator.hasPrevious()){
            System.out.println("Индекс = " + listIterator.previousIndex() + ", Элемент = " + listIterator.previous());
        }
    }
}