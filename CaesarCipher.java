import java.util.Scanner;

public class CaesarCipher
{
   public static void main(String[] args)
   {
    Scanner in = new Scanner(System.in);
    char[]abeceda=new char[6666666]; // this causes overflow... :-D
    char[]sifrovaciTabulka=new char[6666666];

     for(int i=0;i<abeceda.length ; i++){
     abeceda[i]=(char)(39+i);
     }
     System.out.println("Zadej klic: ");
     String klic=in.next();

     for(int i=0;i<klic.length() ; i++){
     sifrovaciTabulka[i]=klic.charAt(i);
     }

    int k = klic.length();

     for(int i=0;i<abeceda.length ; i++){
      int j;
       for(j=0;j<klic.length();j++){
        if(abeceda[i]==klic.charAt(j)){
        break;
        }
        }
        if(j==klic.length()){
        sifrovaciTabulka[k]=abeceda[i];
        k++;
        }

    }
    System.out.println(abeceda);
    System.out.println(sifrovaciTabulka);

  }
}