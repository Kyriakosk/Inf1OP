package uk.ac.ed.inf.op.model;

public class Client extends Person {
  private int budget;
  public Client(String fstName,String lstName, String email, int budget){
    super(fstName,lstName,email);
    this.budget = budget;
  }
  
  public int getBudget(){
    return budget;
  }

}
