import helpers.Observable;
import helpers.Observer;
import java.util.ArrayList;

public class Test implements Observable {

  private ArrayList<Observer> subscribers;

  public Test(){
    this.subscribers = new ArrayList<>();
  }

  @Override
  public void subscribe(Observer obj) {
    System.out.println("Nueva suscripción!");
    this.subscribers.add(obj);
  }

  @Override
  public boolean unsubscribe(Observer obj) {
    int index = this.subscribers.indexOf(obj);
    try {
      this.subscribers.remove(index);
      return true;
    }catch(IndexOutOfBoundsException e){
      return false;
    }
  }

  @Override
  public void next(Object value){
    for (Observer sub : this.subscribers) {
      sub.notifyHandler(value);
    }
  }
  
}
