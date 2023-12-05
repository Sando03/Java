import java.io.*;
import java.time.LocalDate;

public class Person implements Externalizable
{
    private String name;
    private LocalDate birth;
    private int age;
    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeObject(name);
        out.writeObject(birth);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        name = (String) in.readObject();
        birth = (LocalDate) in.readObject();
        this.recalculateAge(birth);
    }

    public void recalculateAge(LocalDate birth)
    {
        int year = birth.getYear();
        LocalDate temp = LocalDate.now();
        int current_year = temp.getYear();

        int output = current_year - year;
        this.setAge(output);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getDate()
    {
        return this.birth;
    }

    public void setDate(LocalDate date)
    {
        this.birth = date;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
