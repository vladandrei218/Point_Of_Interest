
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            Menu menu = new Menu();
            menu.run();
        }
        else{
            Menu_2 menu_2 = new Menu_2();
            menu_2.run();
        }
    }
}
