public class H2_main{
    public static void main(String[] args){
        int i = 10;
        int j = 2;
        int k = 7;
        int max = 20;
        int min = 1;
        if (i < j && i < k){
            min = i;
        }
        else if (j < i && j < k){
            min = j;
        }
        else {
            min = k;
        }
        
        if (i > j && i > k){
            max = i;
    }
        else if (j > i && i > k){
            max = j;
        }
        else {
            max = k;
        }
        System.out.println(min);
        System.out.println(max);
}
}