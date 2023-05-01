import java.util.Scanner;

public class Main {
    static Data_maker[] list_input;
    static int number_of_possible_state;
    static int debt_org ;
    public static Data_maker[] getvopy(Data_maker[] a){
        Data_maker[]copy=new Data_maker[a.length];
        for (int i = 0; i < a.length; i++) {
            copy[i]=new Data_maker();
            copy[i].setNumber(a[i].getNumber());
            copy[i].setValue((a[i].getValue()));


        }
        return copy;
    }



     static public void recursive(Data_maker[] vo,int debt_3){
        for (int i = 0; i < vo.length; i++) {
            if (vo[i].getNumber()==0){
                continue;
            }
            if (debt_3==0){
                number_of_possible_state++;
                break;
            }
            if (debt_3>0) {
                if (debt_3 - vo[i].getValue()>0) {
                    Data_maker[]x=getvopy(vo);
                     int debt_4 = debt_3 - vo[i].getValue();
                    x[i].setNumber(x[i].getNumber() - 1);
                    recursive(x, debt_4);
                }
            }

        }
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int debt=input.nextInt();
        debt_org=debt;
        int number_of_state=input.nextInt();
        list_input= new Data_maker[number_of_state];
        for (int i = 0; i < number_of_state; i++) {
            list_input[i]=new Data_maker();
            list_input[i].setValue(input.nextInt());
            list_input[i].setNumber(input.nextInt());
        }
        recursive(list_input,debt_org);
        System.out.println(number_of_possible_state);




    }
}
class Data_maker{
    private int value;
    private int number;
    Data_maker(int value,int number){
        this.number=number;
        this.value=value;
    }
    Data_maker(){

    }

    public int getNumber() {
        return number;
    }

    public int getValue() {
        return value;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setValue(int value) {
        this.value = value;
    }
}