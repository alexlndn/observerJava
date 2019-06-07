import helpers.Observer;

class Logger implements Observer {

  public Logger(){
    
  }

  @Override
  public void notifyHandler(Object value) {
    System.out.println("Valor notificado: " + value);
  }

}
