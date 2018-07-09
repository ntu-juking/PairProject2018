import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount{
        static Map<String,Integer> map1 = new HashMap<String, Integer>();
        static Map<String,Integer> map2 = new HashMap<String, Integer>();
        static List<Map.Entry<String,Integer>> orderList1;
        static List<Map.Entry<String,Integer>> orderList2;

        public static void main(String[] args) {
            try
            {
                FileReader fileReader = new FileReader("A_Tale_of_Two_Cities.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();
                while(line!=null)
                {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }

                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
                System.out.println("FileNotFoundException");
                System.exit(0);
            } catch (IOException e)
            {
                e.printStackTrace();
                System.out.println("IOException");
                System.exit(0);
            }
        }
}

