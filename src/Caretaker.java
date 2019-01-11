/**
 * Created by pidho on 19.04.2018.
 */
public class Caretaker {
    private Memento memento=null;

    public Memento getMemento() {
        if(memento==null){
            return new Memento();
        }
        return memento;

    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}