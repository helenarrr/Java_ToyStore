package Java_ToyStore;

import java.util.ArrayList;
import java.util.List;
class Toy implements ISomeDo {
    public int id;
    public String nameToy;
    public int count;
    public int frequency;

    List<String> toy;
    Toy() {
        toy = new ArrayList<>();
    }

    @Override
    public void add(String name) {
        toy.add(name);
    }
    @Override
    public void changeFrequency(int frequency) {
        this.frequency = frequency;
    }
    @Override
    public int choiceToy() {
        return 0;
    }


}
