
import java.io.*;
public class assignment44 {
    public static void main(String[] args)throws Exception
    {
        File file = new File("C:\\Users\\nepal\\IdeaProjects\\Assignment\\src\\file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
    }
}
