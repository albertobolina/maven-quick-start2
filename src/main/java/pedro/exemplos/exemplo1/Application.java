package pedro.exemplos.exemplo1;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public int countWords(String words){
        String[] separeteWords = StringUtils.split(words, ' ');
        return (separeteWords == null)? 0 : separeteWords.length;
    }

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
        int count = app.countWords("I have four words");
        System.out.println("Word count " + count );

    }
}
