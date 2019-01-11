import java.io.IOException;
import java.util.Scanner;

/**
 * Created by pidho on 19.04.2018.
 */
public class Main {
    public static void main(String []args) throws IOException, ClassNotFoundException {
        GameScreen screen = new GameScreen();
        Caretaker care = new Caretaker();
        do{
            Scanner in = new Scanner(System.in);
            System.out.print("Choose operation:\n" +
                    "load - load world from file;\n" +
                    "save - save to file;\n" +
                    "set - set score;\n"+
                    "get - get score;\n"+
                    "create - create new world;\n"+
                    "exit - end program.\n");
            String choise = in.nextLine();

            if(choise.compareTo("load")==0){
                screen.restoreState(care.getMemento());
                System.out.print("Loading successful.\n");
            }
            else if(choise.compareTo("save")==0){
                care.setMemento(screen.saveState());
                System.out.print("Saving is successful.\n");
            }
            else if(choise.compareTo("set")==0){
                System.out.print("Type int: ");
                int score = in.nextInt();
                screen.set(score);
                System.out.print("The score has been successfully installed\n"+
                "New score is "+screen.get()+"\n");

            }
            else if(choise.compareTo("create")==0){
                screen.create();
                System.out.print("New game created.\n");
            }
            else if(choise.compareTo("get")==0){
                System.out.print("Score = " + screen.get()+"\n");
            }
            else if(choise.compareTo("exit")==0){
                break;
            }
        }while(true);
    }
}
