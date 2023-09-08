
/**
 * Write a description of class whileloops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloops
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        System.out.println("Hello World!");
        int i = 0;
        int k = 20;
        while (i < 15) {
            System.out.println ("i is equal to " + i + ", which is less than 15");
            i += 1;
        }
        while (k > 5) {
            System.out.println ("k is equal to " + k + ", which is greater than 5");
            k -= 1;
        }
        while (a < 10 && b <= 20) {
            System.out.println ("both a is less than 10 (" + a + ") AND b is less than 20 (" + b + ")");
            a += 1;
            b += 1;
        }
    }
    
    
    public static void main(String[] args)
    {        
        whileloops hw = new whileloops();
        hw.run();
    }

}
