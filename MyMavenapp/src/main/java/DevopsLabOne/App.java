package DevopsLabOne;

/**
 * Hello world!
 */
public class App {
    public String getmessage(){
        return "Hello Sridhar!";
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app = new App();
        System.out.println(app.getmessage());
    }
}
