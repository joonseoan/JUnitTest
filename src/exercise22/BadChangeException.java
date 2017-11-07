package exercise22;

public class BadChangeException extends Exception{
  public BadChangeException(){
    super();
  }
  public BadChangeException(String message){
    super(message);
  }
}