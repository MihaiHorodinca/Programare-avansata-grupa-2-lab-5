package Compulsory;

import java.io.File;

class mySong extends GenericItem {

    public mySong (String name, File file) {
        this.name = name;
        this.file = file;
    }

    @Override
    public String toString() {
        return "mySong{" +
                "name='" + name + '\'' +
                ", file=" + file +
                "}\n";
    }
}
