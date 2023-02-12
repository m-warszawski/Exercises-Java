public class Arrays{

    public static boolean arr(int[] arr1, int[] arr2){

        int lp1 = 0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>=10 && arr1[i]<=99){
                lp1++;
            }
        }

        int lp2 = 0;
        for(int j=0; j<arr2.length; j++){
            if(arr2[j]>=10 && arr2[j]<=99){
                lp2++;
            }
        }

        if(lp1==lp2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,9,5};
       System.out.println(Arrays.arr(arr1, arr2));
    }

}