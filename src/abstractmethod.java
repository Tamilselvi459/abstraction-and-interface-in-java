abstract class abstractex {
    protected int a = 20;
    abstract void display();
    void function(){
        System.out.println("this is non abstract method");
    }
}
 public class abstractmethod extends abstractex{

    @Override
    void display() {
        System.out.println("this is abstarct method");
    }
}
