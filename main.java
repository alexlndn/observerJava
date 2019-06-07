import java.util.Scanner;

public class main {

  public static void main(String[] args){
    System.out.println("*** Patron Observer ***");
    System.out.println("|}- type exit to quit");
    System.out.println();
    Logger logger = new Logger("Logger 1");
    Logger logger2 = new Logger("Logger 2");
    Logger logger3 = new Logger("Logger 3");
    Test test = new Test();
    test.subscribe(logger);
    test.subscribe(logger2);
    test.subscribe(logger3);
    Scanner scanner = new Scanner(System.in);
    String entrada = "";
    int veces = 0;
    while(!entrada.equals("exit")){
      entrada = scanner.nextLine();
      if(veces == 1)
        test.unsubscribe(logger3);
      if(veces == 3)
        test.unsubscribe(logger2);
      veces++;
      if(entrada.equals("exit"))
        continue;
      else
        test.next(entrada);
    }
    scanner.close();


  }

}
