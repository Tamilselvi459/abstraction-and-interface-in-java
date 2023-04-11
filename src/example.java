interface interfaceex1 {

    int a3 = 10; // by default it is public , final , static
    void show(); // by default it is public & abstract
}
 interface anothermethod{
    void build();
}
public class example implements interfaceex1 ,anothermethod{
    @Override
    public void show() {
        System.out.println("This is the abstract method"); //
    }


    @Override
    public void build() {
        System.out.println("This is another interface"); // this is known as mutiple inhertance it is achieved by
        // interface in java
    }
}
