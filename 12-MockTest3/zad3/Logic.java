public class Logic {

    private boolean[] values;

    public Logic(boolean[] values){
        this.values = values;
    }

    public int opposite(){
        int lp = 0;
        for(int i=1; i<values.length-1; i++){
            if(values[i] != values[i-1] && values[i] != values[i+1]){
                lp++;
            }
        }
        return lp;
    }

    public static void main(String[] args){
        boolean[] arr1 = {true, false, false};
        boolean[] arr2 = {true, false, true, false};
        boolean[] arr3 = {true, false, true, true, false, true, false, true, false};
        Logic l1 = new Logic(arr1);
        Logic l2 = new Logic(arr2);
        Logic l3 = new Logic(arr3);
        System.out.println(l1.opposite());
        System.out.println(l2.opposite());
        System.out.println(l3.opposite());
    }

}
