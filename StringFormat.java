package org.ukasik.stringformat;

public class StringFormat 
{
    private StringFormatArray ListOfValue = new StringFormatArray();
    
    private String FormatChar = "%";

    public String getFormatChar() 
    {
        return FormatChar;
    }

    public void setFormatChar(String FormatChar) 
    {
        this.FormatChar = FormatChar;
    }
    
    public StringFormat()
    {
    
    }
    
    public StringFormat(StringFormatArray _SFA)
    {
        this.ListOfValue = _SFA;
    }
    
    public Boolean AddFormat(String _VALUE)
    {
        if(!ListOfValue.contains(_VALUE))
        {
            ListOfValue.add(_VALUE);
            return true;
        }
        return false;
    }
    
    public Boolean AddFormat(String _VALUE, int _INDEX)
    {
        return ListOfValue.add(_INDEX,_VALUE);
    }
    
    public void SetFormat(StringFormatArray _VALUE_LIST)
    {
        ListOfValue.clear();
        ListOfValue = _VALUE_LIST;
    }
    
    public boolean SetFormatFromFile(StringFormatFile _FILE)
    {
        ListOfValue.clear();
        ListOfValue = new StringFormatArray().Converter(_FILE.FormatFormTXT());
        return true;
    }
    
    public boolean AddFormatFromString(String _VALUE)
    {
        if(_VALUE.contains("-"))
        {
            String[] data;
            data = _VALUE.split("-");
            for(String s : data)
            {
                AddFormat(s);     
            }
            return true;
        }  
        return false;
    }
    
    public String Changle(String _TEXT)
    {
        for(int i = 0; i < ListOfValue.size(); i++)
        {
            if(_TEXT.contains(FormatChar + i))
            {
                _TEXT = _TEXT.replace(FormatChar+ i, ListOfValue.get(i));
            }
        }
        return _TEXT;
    }
    
}
