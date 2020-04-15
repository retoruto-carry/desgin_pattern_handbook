package factory_method;

import factory_method.framework.*;
import factory_method.idcard.*;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("card_1");
    Product card2 = factory.create("card_2");
    Product card3 = factory.create("card_3");
    card1.use();
    card2.use();
    card3.use();
    List<String> owners = ((IDCardFactory) factory).getOwners();
    System.out.println(owners.toString());
  }

}