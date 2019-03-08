package ac.za.cput.projects;

public class ObjectEqualityDemo
{

    public boolean compareString(String first, String second)
    {
        if(first.equalsIgnoreCase(second))
        {
            return true;
        }
            else
                {
                    return false;
        }
    }

    public String concatString(String first, String second)
    {
        return first.concat(second);
    }
}
