import helpers.Observer;

class Logger implements Observer {
  private String name;
  
  public Logger(String name){
    this.name = name;
  }

  @Override
  public void notifyHandler(Object value) {
    System.out.println(this.name + " notificado con: " + value);
  }

}
