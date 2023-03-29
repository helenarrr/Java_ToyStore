package Java_ToyStore.ToyType;

import java.io.Serializable;

/**Класс "зайцы".*/
public class Hares extends Toy implements Serializable {

    public Hares(int id, String name, float frequency){
        super(id, name);
        setFrequency(frequency);
    }


}
