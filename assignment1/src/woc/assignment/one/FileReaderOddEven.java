package woc.assignment.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderOddEven {
    public static void main(String[] args) {
        try{
            File fl = new File("sample.txt");
            FileReader fr = new FileReader(fl);
            BufferedReader br=new BufferedReader(fr);
            String line="";
            String separator = "->";
            while (null!=br.readLine()){
                String[] strARR = line.split(" ");
                for(String key : strARR){
                    System.out.println(key+separator);
                    if(separator.equals("->"))
                        separator = "<-";
                    else
                        separator = "->";
                }
            }

        }catch (Exception e){
            System.out.println("Caught exception"+e.getStackTrace());
        }
    }
}
