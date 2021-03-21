package Compulsory;

import java.io.File;

class myMovie extends GenericItem {

    public myMovie (String name, File file){
        this.name = name;
        this.file = file;
    }

    @Override
    public String toString() {
        return "myMovie{" +
                "name='" + name + '\'' +
                ", file=" + file +
                '}';
    }
}
