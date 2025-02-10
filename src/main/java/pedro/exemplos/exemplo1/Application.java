package pedro.exemplos.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public void greet(){

        List<String> greetings = new ArrayList<>();
        greetings.add("Olá, como estás");
        greetings.add("Bom dia alegria");

        for (String greeting : greetings) {
            System.out.println("Greeting : " + greeting);
        }
    }

    public Application(){ 
        System.out.println("Inside Application");
    }

    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();
        app.greet();
    }
}
