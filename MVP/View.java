package Java_ToyStore.MVP;

import java.util.Scanner;

/**Класс отвечает за то, как работать с интерфейсом.*/
public class View {

    Scanner sc = new Scanner(System.in);

    /**Интерфейс для пользовательноского ввода.*/
    public String getChoice() {
        System.out.println("Начинаем наш розыгрыш! Если готовы, напишите - 'начать'. Если не готовы - напишите 'завершить'");
        return sc.next();
    }

}
