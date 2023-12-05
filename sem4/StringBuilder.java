public class StringBuilder {
    private String str;
    public StringBuilder(String s)
    {
        this.setStr(s);
    }

    public StringBuilder()
    {
        this.setStr("");
    }

    public int size()
    {
        return str.length();
    }

    public void insert(char c, int index)
    {
        String out = "";
        for(int i = 0; i < index; i++)
        {
            out += this.getStr().charAt(i);
        }
        out += c;
        for(int i = index + 1; i < this.size(); i++)
        {
            out += this.getStr().charAt(i);
        }
        this.setStr(out);
    }

    public String getStr()
    {
        return this.str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }
}
