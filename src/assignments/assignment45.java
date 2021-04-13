import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class assignment45 {
    public static void main(String[] args) throws Exception{
        String line;
        ArrayList<String> words = new ArrayList<String>();
        FileReader file = new FileReader("file.txt ");
        BufferedReader br = new BufferedReader(file);

        //Reads each line
        while((line = br.readLine()) != null) {
            String string[] = line.toLowerCase().split("([,.\\s]+) ");
            //Adding all words generated in previous step into words
            for(String s : string){
                words.add(s);
            }
        }
        System.out.println(words);

    }

}
