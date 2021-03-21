package Compulsory;

import java.io.File;
import java.io.Serializable;

abstract class GenericItem implements Serializable {

    protected String name;
    protected File file;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public abstract String toString();
}
