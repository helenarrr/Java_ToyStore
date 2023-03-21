package Java_ToyStore;

/**Интерфейс для реализации работы с игрушками*/
public interface ISomeDo {

    /**Метод добавления игрушек в список*/
    void add(String name);

    /**Метод изменения частоты выпадения призовой игрушки*/
    void changeFrequency(int frequency);

    /**Метод выбора призовых игрушек*/
    int choiceToy();

}
