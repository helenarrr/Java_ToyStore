package Java_ToyStore.MVP;


import java.io.IOException;

/**
 * Класс связывает Model и View между собой.
 */
public class Presenter {

    View view;
    ModelLottery modelLottery;

    public Presenter(ModelLottery m, View v) {
        this.modelLottery = m;
        this.view = v;
    }

    /**Запускается программа в зависимости от выбранной позиции - "начать" или "завершить".*/
    public void run() throws InterruptedException, IOException {
        String choice = view.getChoice();
        boolean flag = true;
        while (flag) {
            switch (choice) {
                case "начать" -> {
                    System.out.println("И так, разыгрываем 3 игрушки!");
                    modelLottery.choiceToy();
                    choice = view.getChoice();
                }
                case "завершить" -> {
                    flag = false;
                    System.out.println("До свидания!");
                }
            }
        }
    }
}
