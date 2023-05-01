import java.util.Arrays;
import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String first_input=input.next();
        String[] splited=first_input.split("-");
        String[] splited_sorted=new String[splited.length];
        int index=0;
        for (String i : splited) {
            char[] tochar=i.toCharArray();
            Arrays.sort(tochar);
            splited_sorted[index]=new String(tochar);
            index++;
        }
        for (int i = 0; i < splited.length; i++) {
            for (int j = i+1; j < splited.length; j++) {
                if (splited[i].equals(splited[j])) {
                    splited[j] = "0";
                }
            }
        }
        for (int i = 0; i < splited.length; i++) {
            if (splited[i].equals("0")){
                continue;
            }
            String out="*"+splited[i]+"* ";
            for (int j = i+1; j < splited.length; j++) {
                if (splited_sorted[i].equals(splited_sorted[j])){
                    if (!splited[j].equals("0")) {
                        out = out + "*" + splited[j] + "* ";
                        splited[j] = "0";
                    }
                }
            }
            System.out.println(out);
        }
    }
}