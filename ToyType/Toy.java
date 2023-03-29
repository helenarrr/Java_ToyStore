package Java_ToyStore.ToyType;
import java.io.Serializable;

/**Класс-родитель "игрушки".*/
public class Toy implements Serializable {
    int id;
    public String name;
    private float frequency;

    Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }
    @Override
    public String toString() {
        return name;
    }

}
