import java.util.Scanner;

public class D {


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        int aval=input.nextInt();
        int dovom=input.nextInt();
        int i_aval=0;
        int j_aval=0;
        int i_dovom=0;
        int j_dovom=0;

        int sater=0;
        int soton=0;
        int neshangarsatr=n-1;
        int neshangarsatr2=1;
        int neshangarsoton=n-1;
        int neshangarsoton2=0;
        boolean toRight=true;
        boolean toleft=false;
        boolean todawn=false;
        boolean toup=false;

        for (int i=1;i<n*n+1;i++){
            if (i==aval){
                i_aval=soton;
                j_aval=sater;
            }
            if (i==dovom){
                i_dovom=soton;
                j_dovom=sater;
            }


            if (soton<neshangarsoton && toRight==true){
                soton++;
                if (soton==neshangarsoton){
                    neshangarsoton--;
                    toRight=false;
                    todawn=true;
                }
            } else if (sater<neshangarsatr && todawn==true) {
                sater++;
                if (sater==neshangarsatr){
                    neshangarsatr--;
                    todawn=false;
                    toleft=true;
                }
            } else if (soton>neshangarsoton2 && toleft==true) {
                soton--;
                if (soton==neshangarsoton2){
                    neshangarsoton2++;
                    toleft=false;
                    toup=true;
                }
            } else if (sater>neshangarsatr2&& toup==true) {
                sater--;
                if (sater==neshangarsatr2){
                    neshangarsatr2++;
                    toup=false;
                    toRight=true;
                }
            }
        }
        int t_s=j_dovom-j_aval;
        int t_t=i_dovom-i_aval;
        if (t_t!=0){
            if (t_t>0){
                System.out.println(Math.abs(t_t)+" "+"R");

            }else {
                System.out.println(Math.abs(t_t)+ " "+"L");
            }
        }
        if (t_s!=0){
            if (t_s>0){
                System.out.println(Math.abs(t_s)+" "+"U");

            }else {
                System.out.println(Math.abs(t_s)+" "+"D");
            }
        }








    }
}

