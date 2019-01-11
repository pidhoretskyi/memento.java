import java.io.IOException;

/**
 * Created by pidho on 19.04.2018.
 */
public class GameScreen{

    private GameWorld world;

    // This is the constructor, not the class declaration
    public GameScreen() {
        world = new GameWorld(0);
    }

    public void create(){
        world = new GameWorld(0);
    }

    public void set(int score){
        world.setScore(score);
    }

    public int get(){
        return world.getScore();
    }
    public void render() {
        world.update();
    }

    public void setState(GameWorld world) {
        this.world = world;
    }

    public Memento getState() {
return null;
    }

    public Memento saveState() throws IOException {
        try {
            return new Memento(this.world);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int restoreState(Memento memento) throws IOException, ClassNotFoundException {
        try {
            this.world = memento.LoadFromFile();
            return 0;
        } catch (IOException e) {
            //e.printStackTrace();
            return 502;
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            return 502;
        }
    }

}
