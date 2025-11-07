package outer;


public class Cat {

Cat()

{

this(4);

System.out.println("Cat Constructor");

}

Cat(int x)

{

this("Tom");

System.out.println("Cat has "+x+" legs");

}

Cat(String name)

{


System.out.println("Cat name is "+name);

eat();

}

void eat()

{

this.eat(6);

System.out.println("Eats Rats");

}

void eat(int x)

{

System.out.println("Eats "+x+" rats per day");

}

public static void main(String[] args) {

new Cat();

}

}