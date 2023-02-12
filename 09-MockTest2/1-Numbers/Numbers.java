public class Numbers{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    Numbers(int a, int b, int c, int d, int e){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
    }

    public boolean different(){
        int[] arr1 = {this.a, this.b, this.c, this.d, this.e};

        for(int i=0; i<arr1.length; i++){
            int current = arr1[i];
            for(int j=0; j<arr1.length; j++) {
                if(current==arr1[j] && i!=j){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        Numbers n1 = new Numbers(3,4,2,1,6);
        System.out.println(n1.different());

        Numbers n2 = new Numbers(9,7,4,3,7);
        System.out.println(n2.different());
    }

}



