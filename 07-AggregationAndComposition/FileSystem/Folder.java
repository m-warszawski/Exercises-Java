import java.util.ArrayList;
import java.time.LocalDate;

public class Folder{
    private String name;
    private int size;
    private String dateOfCreation;
    private ArrayList<File> files = new ArrayList<File>();

    public Folder(String name, int size){
        this.name = name;
        LocalDate date = LocalDate.now();
        this.dateOfCreation = date;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public void setName(String name){
        this.name = name;
    }

    public void createFile(String name, int size, String type){
        File f1 = new File("Liść 1",10,"tekstowy");
        files.add(f1);
    }

    public void deleteFile(int id){
        files.remove(id);
    }

    public String displayFiles(){
        for(int i=0; i<files.size(); i++){
            System.out.println(files[i]);
        }
    }

    public static void main(String args[]){
        Folder f1 = new Folder("Drzewo", 10);
    }
}