import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        double a, b, c;

        Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

        if(a>0 && b>0 && c>0)
        {
                if (a+b>c && a+c>b && b+c>a){
                    System.out.println("TAK");
                }
                else{
                    System.out.println("NIE");
                }
        }else{
            System.out.println("BŁĄD");
        }
        }

    }
