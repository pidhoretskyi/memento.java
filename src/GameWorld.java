import java.io.Serializable;

/**
 * Created by pidho on 19.04.2018.
 */
public class GameWorld implements Serializable{

    private Bird bird;
    private int score;

    public GameWorld(int score){
        this.score = score;
        bird = new Bird(5, 10, 3, 3);
    }

    public void update(){
        bird.flap();
    }
    public void IncrementScore(){
        score++;
    }

    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
}
