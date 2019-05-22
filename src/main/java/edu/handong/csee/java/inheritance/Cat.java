package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        
        Animal myAnimal2 = myDog;
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        myAnimal2.testInstanceMethod();
        /*
         *polimorphysm은 같은 상위 클래스이지만 이를 상속하는 하위클래스들에 의해 다양하게 분류될 수 있다는 의미
         *overriding은 상위클래스의 메소드를 하위클래스에서 재정의 할 수 있어서 유지보수에 좋음. 하위클래스의 메소드가 호출됨.
         *hiding은 상위클래스의 스태틱메소드에서의 오버라이딩을 의미한다. 
         * */
    }
}

