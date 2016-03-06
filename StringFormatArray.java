package org.ukasik.stringformat;

import java.util.ArrayList;

public class StringFormatArray
{
    
    private ArrayList<String> ListOfValue = new ArrayList<>();
    
    public StringFormatArray Converter(ArrayList<String> _VALUE_TO_CON)
    {
        ListOfValue = _VALUE_TO_CON;
        return this;
    }
    
    public boolean add(String _VALUE)
    {
        if(!ListOfValue.contains(_VALUE))
        {
            ListOfValue.add(_VALUE);
            return true;
        }
        return false;
    }
    
    public boolean add(int _INDEX, String _VALUE)
    {
        if(!ListOfValue.contains(_VALUE))
        {
            try
            {
                ListOfValue.add(_INDEX, _VALUE);
            }
            catch (IndexOutOfBoundsException IOOBE)
            {
                System.err.println("The specified INDEX already exists !");
                return false;
            }    
            return true;
        }
        else
        {
            System.err.println("The specified value already exists !");
            return false;
        }
    }
    
    public void clear()
    {
        ListOfValue.clear();
    }
    
    public int size()
    {
        return ListOfValue.size();
    }
    
    public String get(int _INDEX)
    {
        return ListOfValue.get(_INDEX);
    }
    
    public boolean contains(String _VALUE)
    {
        return ListOfValue.contains(_VALUE);
    }
    
}
