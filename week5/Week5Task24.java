import java.util.Arrays;
import java.util.Scanner;

public class Week5Task24 {
    public static void main(String[] args){
        boolean[] aHash = new boolean[256];
        Arrays.fill(aHash, false);
        aHash['A'] = true;
        aHash['E'] = true;
        aHash['I'] = true;
        aHash['O'] = true;
        aHash['U'] = true;
        aHash['a'] = true;
        aHash['e'] = true;
        aHash['i'] = true;
        aHash['o'] = true;
        aHash['u'] = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);
        if(ch > 'z' || ch <'A'){
            System.out.println(ch+" is a invalid input");
        }
        else if(aHash[ch]) {
            System.out.println(ch+" is a vowel");
        }
        else {
            System.out.println(ch+" is a consonant");
        }
    }
}
