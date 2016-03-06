package org.ukasik.stringformat;

public class URLUtils 
{
    public static String ToURL(char _DRIVE, String _DIR, String _FILE)
    {
        if(_DIR.contains("\\") && _DIR.endsWith("\\"))
        {
            _DIR = _DIR.replace("\\", "");
        }
        
        return Character.toString(_DRIVE) + ":\\" + _DIR + "\\" + _FILE;
    }
    
    //ONLY FOR WINDOWS
    public static String WindowsDesktopURL(String _USER_NAME)
    {
        return "Users\\" + _USER_NAME + "\\Desktop";
    }
}
