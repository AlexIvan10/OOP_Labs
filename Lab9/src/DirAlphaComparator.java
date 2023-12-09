import java.io.File;
import java.util.Comparator;

public class DirAlphaComparator implements Comparator<File> {
    public int compare(File a, File b){
        if(a.isDirectory() && !b.isDirectory())
            return -1;
        else if(!a.isDirectory() && b.isDirectory())
            return 1;
        else
            return a.getName().compareToIgnoreCase(b.getName());
    }
}
