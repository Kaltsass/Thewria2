import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {

    public static String fileReader(String htmlFile) throws  IOException{
        StringBuilder cont = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader((htmlFile)))){
            String line;
            while ((line = reader.readLine())!=null){
                cont.append(line);
            }
        }
        return cont.toString();
    }

    public  static String tagRemover(String html){
        return html.replaceAll("<[^>]*>","");
    }

    public static void main(String[] args) {
        String htmlFile = "C:\\Users\\lange\\IdeaProjects\\untitled\\src\\TagRemover.html";
        try {
            String cont = fileReader(htmlFile);
            String text = tagRemover(cont);
            System.out.println(text);
        }
        catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
