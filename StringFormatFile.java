package org.ukasik.stringformat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StringFormatFile 
{
    private BufferedReader br;
    private String URL;
    private ArrayList<String> ListOfLine = new ArrayList<>();
    
    public StringFormatFile(String _URL)
    {
        this.URL = _URL;
    }
    
    public ArrayList<String> FormatFormTXT()
    { 
        try
        {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(URL));
            
            while((sCurrentLine = br.readLine()) != null)
            {
                if(sCurrentLine.contains("- "))
                {
                    sCurrentLine = sCurrentLine.replace("- ", "");
                    ListOfLine.add(sCurrentLine);
                }
            }
        }
        catch (FileNotFoundException exc)
        {
            System.err.println("Nie znaleziono pliku !");
        }
        catch (IOException exc)
        {
            System.err.println("Blad: " + exc);
        }
        return ListOfLine;
    }
}
