package demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File file) {
        if(file.isDirectory()) return true;
        return file.getName().toLowerCase().endsWith(".class");
    }

}
