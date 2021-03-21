package Compulsory;

import java.io.File;

class myImage extends GenericItem {

    public myImage(String name, File file) {
        this.name = name;
        this.file = file;
    }

    @Override
    public String toString() {
        return "myImage{" +
                "name='" + name + '\'' +
                ", file=" + file +
                "}";
    }
}
