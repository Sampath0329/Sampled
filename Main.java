 interface Animal {
}
 class Cat implements Animal {
}
 class Boy implements Animal {}


 class Car {  //Not a sub class of Animal
}


 class Sample <T extends Animal> {
}
public class Main {
   public static void main(String[] args) {
       Sample<Boy> sample;     //Legal
       Sample<Cat> sample2;    //Legal
       //Sample<Car> sample3;    //Error
   }
}

