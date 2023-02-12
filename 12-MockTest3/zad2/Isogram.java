import java.util.Arrays;

public class Isogram {

    public static boolean isogram(String text){

        char letters[] = text.toCharArray();
        Arrays.sort(letters);

        for(int i=0; i<letters.length-1; i++)
            if(letters[i] == letters[i+1]){
                return false;
            }
        return true;
    }

    public static void main(String[] args){
        Isogram i1 = new Isogram();
        System.out.println(i1.isogram("red sun"));
        System.out.println(i1.isogram("blue water"));
        System.out.println(i1.isogram("BLUE water"));
        System.out.println(i1.isogram("my blue water"));
    }
}
