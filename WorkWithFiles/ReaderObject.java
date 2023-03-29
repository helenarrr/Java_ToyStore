package Java_ToyStore.WorkWithFiles;

import Java_ToyStore.ToyType.Toy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**Чтение файла.*/
public class ReaderObject {
    public static void some_read(ArrayList<Toy> s) throws IOException {

        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("toys.txt"))) {

            int cnt = oos.readInt();
            Toy[] toy = new Toy[cnt];

            for (int i = 0; i < cnt; i++) {
                toy[i] = (Toy) oos.readObject();
            }
            System.out.print("И так, в этот раз вы выиграли - ");
            System.out.println(Arrays.toString(toy));

            oos.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


