package Java_ToyStore.ToyType;

import java.io.Serializable;

/**Класс "медведи".*/
public class Bears extends Toy implements Serializable {

    public Bears(int id, String name, float frequency) {
        super(id, name);
        setFrequency(frequency);
    }

}

