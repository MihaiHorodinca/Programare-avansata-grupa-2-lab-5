package Compulsory;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main (String[] args){
        Catalog firstCatalog = new Catalog("myFirstCatalog");

        myImage image = new myImage("My Printscreen", new File("des.jpg"));
        myMovie movie = new myMovie("Cool Highlight", new File("Highlight.mp4"));
        mySong song = new mySong("Mega Hit", new File("On the Edge.mp3"));

        firstCatalog.add(image);
        firstCatalog.add(movie);
        firstCatalog.add(song);

        firstCatalog.list();

        firstCatalog.play(0);

        try{
            firstCatalog.save();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }



        Catalog secondCatalog = new Catalog();

        try {
            secondCatalog.load(new File("myFirstCatalog.bin"));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        secondCatalog.list();
    }
}
