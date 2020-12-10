import java.util.Scanner;

public class ConvertNumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1-999");
        int number = scanner.nextInt();
        String stingOutput="";
        if (number<100) {
            stingOutput=convertNumber3(number);
        }else if (number<1000){
            int x = number/100;
            int y = number-100*x;
            stingOutput=convertNumber1(x)+" hundred " + ((convertNumber3(y)=="")?"":" and ")+convertNumber3(y);
        }else {
            stingOutput="out of ability";
        }
        System.out.println(stingOutput);
    }

    public static String convertNumber1(int x) {
        String str;
        switch (x) {
            case 1:
                str="one";
                break;
            case 2:
                str="two";
                break;
            case 3:
                str="three";
                break;
            case 4:
                str="four";
                break;
            case 5:
                str="five";
                break;
            case 6:
                str="six";
                break;
            case 7:
                str="seven";
                break;
            case 8:
                str="eight";
                break;
            case 9:
                str="nine";
                break;
            case 10:
                str="ten";
                break;
            default:
                str="";
                break;
        }
        return str;
    }
    public static String convertNumber2(int x){
        String str;
        switch (x) {
            case 11:
                str= "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str = "thirteen";
                break;
            case 14:
                str = "fourteen";
                break;
            case 15:
                str = "fifteen";
                break;
            case 16:
                str = "sixteen";
                break;
            case 17:
                str = "seventeen";
                break;
            case 18:
                str = "eighteen";
                break;
            case 19:
                str = "nineteen";
                break;
            default:
                str = "out of ability";
                break;
        }
        return str;
    }
    public static String convertNumber3(int x){
        String str="";
        if (x<=10){
            str= convertNumber1(x);
        }else if (x<20){
            str= convertNumber2(x);
        }else if (x<100) {
            int a = x / 10;
            int b = x - 10 * a;
            switch (a){
                case 2:
                    str = "twenty" + convertNumber1(b);
                    break;
                case 3:
                    str = "thirty" + convertNumber1(b);
                    break;
                case 5:
                    str = "fifty" + convertNumber1(b);
                    break;
                default:
                    str = convertNumber1(a) + "ty " + convertNumber1(b);
            }
        }
        return str;
    }

}


