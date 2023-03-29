package Java_ToyStore.MVP;

import Java_ToyStore.ToyType.Bears;
import Java_ToyStore.ToyType.Cars;
import Java_ToyStore.ToyType.Hares;
import Java_ToyStore.ToyType.Toy;
import Java_ToyStore.WorkWithFiles.WriterObject;
import Java_ToyStore.WorkWithFiles.ReaderObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;



/**Класс, в котором реализованы метооды для розыгрыша в магазине игрушек*/
public class ModelLottery {

    /**Массив всех игрушек*/
    ArrayList<Toy> toys = new ArrayList<>();

    /**Массив выигрышных игрушек*/
    ArrayList<Toy> winners = new ArrayList<>();

    /**
     * Метод выбора призовых игрушек. Организована основная работа, рандомно выбирается выигрышная игрушка, добавляется в массив winners, выигрышная позиция удаляется из массива, где хранится общий список игрушек.
     * Происходит запись и чтение выигрышных позиций игрушек.
     */
    public void choiceToy() throws InterruptedException, IOException {

        toys.add(new Hares(1, "Заяц серый", 0.33F));
        toys.add(new Hares(1, "Заяц белый", 0.33F));
        toys.add(new Hares(1, "Заяц розовый", 0.33F));
        toys.add(new Hares(1, "Заяц сиреневый", 0.33F));
        toys.add(new Hares(1, "Заяц поющий", 0.33F));
        toys.add(new Bears(2, "Медведь косалапый", 0.2F));
        toys.add(new Bears(2, "Медведь белый", 0.2F));
        toys.add(new Bears(2, "Медведь бурый", 0.2F));
        toys.add(new Cars(3, "Машинка BMW", 0.13F));
        toys.add(new Cars(3, "Машинка AUDI", 0.13F));

        int a  = 10;
        int index = (int) (Math.random() * a);

        for (int i = 0; i < 3; i++) {
            Toy toy = toys.get(index);
            winners.add(toy);
            System.out.println("Вы выиграли:\n" + toy + "!");
            TimeUnit.SECONDS.sleep(3);
            toys.remove(index);
            a -= 1;
            index = (int) (Math.random() * a);
            System.out.println("Оставшиеся игрушки" + toys);
            WriterObject.some_write(winners);
            ReaderObject.some_read(winners);
        }
    }
}



