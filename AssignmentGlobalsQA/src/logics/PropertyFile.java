package logics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropertyFile {

    Properties p;

    public PropertyFile(String filePath)  {
       try {
           FileReader reader = new FileReader(filePath);
           p = new Properties();
           p.load(reader);

       }
       catch(Exception e)
       {
           e.printStackTrace();
       }


    }
    public String getData(String data)
    {
        return p.getProperty(data);
    }

}
