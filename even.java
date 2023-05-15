public class even{
    public static void main(String[] args) {
        int arr[]={23,34,3454,3};
        System.out.println(findnum(arr));
    }
    static int findnum(int arr[]){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        String s=String.valueOf(num);
        if(s.length()%2==0){
            return true;
        }
        return false;
    }
}
