import java.util.Scanner;

public class main {

  public static void main(String[] args){
    Logger logger = new Logger();
    Test test = new Test();
    test.subscribe(logger);
    Scanner scanner = new Scanner(System.in);
    String entrada = "";
    while(!entrada.equals("exit")){
      entrada = scanner.nextLine();
      if(entrada.equals("exit"))
        continue;
      else
        test.next(entrada);
    }


  }

}
