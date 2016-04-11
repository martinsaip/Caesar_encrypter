import java.util.Scanner;

public class Abeceda
{

 public static void main ( String[] args )
{
   Scanner sc = new Scanner( System.in );
 char[] abeceda= new char [26];
 char[] klic= new char [26];

    for (int i = 0;  i<abeceda.length; i++) {
        abeceda[i] = (char)(i+65);
        System.out.print (abeceda [i]);
    }

    System.out.println ("Zadej klic: ");
    String tabulka=sc.nextLine();

    for (int i = 0 ; i< tabulka.length(); i++)
      klic[i]=tabulka.charAt(i);

    System.out.println(klic);

    int pom = tabulka.length();

 }
 }