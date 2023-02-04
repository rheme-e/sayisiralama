package Giris;
import java.util.Scanner;
public class SayilariSirala {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,x,y;
        System.out.print("Kaç Sayı Gireceksiniz:");
        n=inp.nextInt();
        int max=0,min=0;
        for(int i=1; i<=n ; i++){
            System.out.print(i+". Sayıyı Giriniz:");
            x=inp.nextInt();
            if(x>max){
                max=x;
            }if(x<min){
                min=x;
        }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
