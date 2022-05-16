pimport java.util.Scanner;



public class Coxinha {

 public static void main(String[] args)
  {

  var scan = new Scanner(System.in);

  double h = scan.nextInt();

  double p = scan.nextInt();

  double media = h / p;

  System.out.printf("%.2f%n", media);

 }

}