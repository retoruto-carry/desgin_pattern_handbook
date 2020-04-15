package factory_method.idcard;
import factory_method.framework.*;

public class IDCard extends Product {
  private String owner;
  IDCard(String owner) {
    this.owner = owner;
    System.out.println(owner + "のカードを作ります");
  }
  public void use() {
    System.out.println(owner + "のカードを使います");
  }
  public String getOwner() {
    return owner;
  }

}