package Praktikum5;

public class Faktorial14 {

    // method faktorialBF
    int faktorialBF(int n) {
        int fakto = 1;
        int i =1;
        while (i <=n) {
            fakto *= i;
            i++;
        //for(int i=1; i<=n; i++){
            //fakto = fakto * i;
        }
        return fakto;
    }
    //method faktorialDC
    int faktorialDC(int n){
        if (n==1){
            return 1;
        } else {
            int fakto =n * faktorialDC(n-1);
            return fakto;
        }
    }
}
 