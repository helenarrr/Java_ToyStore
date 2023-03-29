package Java_ToyStore.WorkWithFiles;
import Java_ToyStore.ToyType.Toy;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**Запись файла.*/
public class WriterObject {
    public static void some_write(ArrayList<Toy> s) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("toys.txt", false)))

        {
            oos.writeInt(s.toArray().length);
            for (Toy toy: s) {
                oos.writeObject(toy);
            }

            oos.close();

        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}


