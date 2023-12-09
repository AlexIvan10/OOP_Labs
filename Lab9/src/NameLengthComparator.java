import java.io.File;
import java.util.Comparator;

public class NameLengthComparator implements Comparator<File> {
    public int compare(File a, File b){
        int c = a.getName().length() - b.getName().length();
        if(c != 0)
            return c;
        else{
            return a.getName().compareToIgnoreCase(b.getName());
        }
    }
}
