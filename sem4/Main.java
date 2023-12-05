import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.DataOutput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.Externalizable;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args)
    {
        final String filePath = "person.bin";
        //Person person1 = new Person();
        //try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath)))
        //{
        //    out.writeObject(person1);
        //}
        //catch (IOException e)
        //{
        //    // handle IO Exception
        //}

        Person[] arr = new Person[10];

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath)))
        {
            out.writeObject(arr[0]);
        }
        catch (IOException e)
        {
            System.out.println(e.getStackTrace());
        }

    }
}
