package Compulsory;

import java.awt.*;
import java.io.*;
import java.util.LinkedList;

public class Catalog implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;

    private String name;
    private LinkedList<GenericItem> items = new LinkedList<>();

    public Catalog (){

    }

    public Catalog (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add (GenericItem newItem){
        items.add(newItem);
    }

    public void list (){
        int i = 0;
        for (GenericItem item : items){
            System.out.println(i++ + ": " + item.toString());
        }
    }

    public void play (Integer position){
        Integer myCursor = 0;

        for (GenericItem item : items)
            if (myCursor == position){
                Desktop d = Desktop.getDesktop();

                try {
                    d.open(item.getFile());
                }
                catch (IOException e){
                    System.out.println(e);
                }

                break;
            }
            else
                myCursor ++;
    }

    public void save () throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.getName() + ".bin"));

        objectOutputStream.writeObject(this);
    }

    public void load (File file) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        Catalog loadedCatalog = (Catalog) objectInputStream.readObject();

        loadedCatalog.list();
    }
}
