public interface example {

    int a3 = 10; // by default it is public , final , static
    void show(); // by default it is public & abstract
}
class interfaceexample implements example {
    @Override
    public void show() {
        System.out.println("This is the abstract method"); //
    }


        }
