package woc.assignment.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class FileReaderOddEven {
    public static void main(String[] args) {
        try{

            //String filePath = Paths.get("").toAbsolutePath().toString()+"/woc/assignment/one/"+"sample.txt";
            File fl = new File("/home/mi/IdeaProjects/assignment1/src/woc/assignment/one/sample.txt");
            FileReader fr = new FileReader(fl);
            BufferedReader br=new BufferedReader(fr);
            String line="";
            String separator = "->";
            while ((line=br.readLine())!=null){

                String[] strARR = line.split(" ");
                for(String key : strARR){
                    System.out.print(key+separator);
                }
                System.out.println("");
                if(separator.equals("->"))
                    separator = "<-";
                else
                    separator = "->";
            }

        }catch (Exception e){
            System.out.println("Caught exception"+e.getStackTrace());

        }
    }
}
