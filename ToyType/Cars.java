package Java_ToyStore.ToyType;

import java.io.Serializable;

/**Класс "машинки".*/
public class Cars extends Toy implements Serializable {
    public Cars(int id, String name, float frequency) {
        super(id, name);
        setFrequency(frequency);
    }
}