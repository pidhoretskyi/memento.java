import java.io.Serializable;

/**
 * Created by pidho on 19.04.2018.
 */
public class Bird implements Serializable{
    private float x, y;
    private int width, height;

    public Bird(float x, float y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
     public void flap(){}

    public void onClick(){

    }
}
