package concert;

public class Widget implements Performance {
    Widget() {System.out.println("Creating object of the Widget class"); }
    public void perform() {
        System.out.println("perform method of Widget's object invoked");
    }
}
