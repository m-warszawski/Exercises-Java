public class Numbers implements Ok {

    private int[] nums;

    public Numbers(int[] nums) {
        this.nums = nums;
    }

    public boolean OK(){
        for(int i=0; i<nums.length; i++){
            if( (i%2 == 0 && nums[i]%2 != 0) || (i%2 != 0 && nums[i]%2 == 0) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr1 = {6,7,6,1,4};
        int[] arr2 = {2,5,2,8,4};
        Numbers n1 = new Numbers(arr1);
        Numbers n2 = new Numbers(arr2);
        System.out.println(n1.OK());
        System.out.println(n2.OK());
    }

}
