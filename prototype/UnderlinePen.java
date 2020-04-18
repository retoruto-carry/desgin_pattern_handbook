package prototype;
import prototype.framework.*;

public class UnderlinePen implements Product {
  private char underlineChar;
  public UnderlinePen(char underlineChar) {
    this.underlineChar = underlineChar;
  }
  public void use(String s) {
    int length = s.getBytes().length;
    System.out.println("\"" + s + "\"");
    System.out.print(" ");
    for(int i = 0; i < length; i++) {
      System.out.print(underlineChar);
    }
    System.out.println("");
  }

  public Product createClone() {
    Product p = null;
    try {
      p = (Product)clone();

    } catch(CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }

}