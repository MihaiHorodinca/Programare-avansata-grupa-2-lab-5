# Programare-avansata-grupa-2-lab-5
### Mihai Horodinca

## Media Catalog
Write an application that can manage a catalog of multimedia items. An entry in this catalog might be a song, a movie, a book, an image or any item that has at least a name and a path in the local file system. (We may also consider specifying a release year, a rating and other additional data, for example the author of the book, etc.)

The main specifications of the application are:

Compulsory (1p)

Create an object-oriented model of the problem. You should have at least the following classes: Catalog and two item classes at your choice. Consider using an interface or an abstract class in order to describe the items in a catalog.
Implement the following methods representing commands that will manage the content of the catalog:
add: adds a new entry into the catalog;
list: prints the content of the catalog on the screen;
play: playback using the native operating system application (see the Desktop class);
save: saves the catalog to an external file (either as a text or binary, using object serialization);
load: loads the catalog from an external file.
The application will signal invalid data (year, path, etc.) using a custom exception.

## Usage

The Main class, upon running, will solve the Compulsory part of the laboratory.
It will create a catalog, fill it with an image, a song and a movie. After that, it will open the image, save the catalog and load it into another object.
