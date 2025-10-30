public class H3_main {
    public static void main(String[] args){
        int i = 1;
        int j = 2;
        int k = -10;

        boolean A1 = i > j;
        boolean A2 = i > 200;
        boolean A3 = j > 100;

        if(A1 == true && A2 == false && A3 == false){
            k = 1;
        }
        else if (A1 == true && A2 == true && A3 == false){
            k = 2;
        }
        else if (A1 == true && A2 == true && A3 == true){
            k = 3;
        }
        else if (A1 == false && A2 == false && A3 == false){
            k = 4;
        }
        else{
        }
        System.out.println(k);
    }
}
