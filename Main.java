package Java_ToyStore;

import Java_ToyStore.MVP.ModelLottery;
import Java_ToyStore.MVP.Presenter;
import Java_ToyStore.MVP.View;

import java.io.IOException;

/**Главный класс, точка входа.*/
public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        Presenter p = new Presenter(new ModelLottery() ,new View());
        p.run();

    }

}