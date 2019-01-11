import java.io.*;

/**
 * Created by pidho on 19.04.2018.
 */
public class Memento {

    public Memento(GameWorld world) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(world);
        oos.flush();
        oos.close();
    }
    public Memento(){

    }

    public void SaveToFile(GameWorld world) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(world);
        oos.flush();
        oos.close();
    }

    public GameWorld LoadFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        return (GameWorld) oin.readObject();
    }
}
