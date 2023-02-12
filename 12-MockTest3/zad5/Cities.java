import java.util.ArrayList;

public class Cities {

    private String[] city_names;
    private ArrayList<String> names;

    public Cities(String[] city_names){
        this.city_names = city_names;
        this.names = new ArrayList<String>();
    }

    public ArrayList<String> filter(char letter){
        for(int i=0; i<city_names.length; i++){
            if(city_names[i].charAt(0) == letter){
                names.add(city_names[i]);

            }
        }
        return this.names;
    }

    public String cities(){
        return String.join("", names);
    }

    public static void main(String[] args){
        String[] str1 = {"Warszawa", "Sopot", "Kielce", "Szczecin"};
        Cities c1 = new Cities(str1);
        c1.filter('S');
        System.out.println(c1.cities());
    }

}
