package com.example.biopedia_app;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;

public class CSVREADER {

    public static ArrayList<String[]> Read(int resource){
        String line="";
        ArrayList<String[]> toReturn = new ArrayList<String[]>();
        try{
            //new FileReader(path)
            BufferedReader br = new BufferedReader(new InputStreamReader(MainActivity.instance.getFile(resource)));

            while((line=br.readLine()) != null){
            String[] values = line.split(",");
            toReturn.add(values);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return  toReturn;
    }
}
