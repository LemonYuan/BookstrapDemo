import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by lemon on 2016/8/8.
 */
public class write {
    public  static  void main(String args[])
    {
        File file=new File ("myfile.txt");;
        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream(file);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            System.out.print("hahah");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
