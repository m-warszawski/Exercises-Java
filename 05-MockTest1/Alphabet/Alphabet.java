public class Alphabet
{
    public static boolean isAlphabet(String text){
       boolean sorted = true;

       for(int i=0; i<text.length()-1; i++){
            if(text.charAt(i) >= text.charAt(i+1)){
                sorted = false;
                break;
            }
       }
       return sorted;
    }
}

