public class Unary {
    public static void main(String[] args) {
        int a = 5;
        int b = -a;
        int c = -b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int x = 7;
        x = x +1;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++a;
        System.out.println(a);


        System.out.println("Watching incremnet");
        int p = 6;
        System.out.println(p++);
        System.out.println(p);

        System.out.println(++p);
        System.out.println(p);
        
        int g = 10;
        System.out.println("Watching decrement");
        System.out.println(g--);
        System.out.println(g);

        System.out.println(--g);
        System.out.println(g);
    }
}
 