import java.util.Random;

class Squa extends Thread

{

    int a;

    Squa(int n) {

        a = n;

    }

    public void run(){

        int sqr = a * a;

        System.out.println("Square of " + a + " = " + sqr );

    }

}

class Cube extends Thread {

    int a;

    Cube(int n) {
        a = n;

    }

    public void run() {

        int cub = a * a * a;

        System.out.println("Cube of " + a + " = " + cub );

    }

}

class N extends Thread {

    public void run() {

        Random random = new Random();

        for(int i =0; i<10; i++) {

            int randomInteger = random.nextInt(100);

            System.out.println("Random Integer generated : "  + randomInteger);

            if(randomInteger%2==0) {
                System.out.println("Number is Even ");
                Squa s = new Squa(randomInteger);

                s.start();
            }
            else{
                System.out.println("Number is Odd");
                Cube c = new Cube(randomInteger);

                c.start();
            }

            try {

                Thread.sleep(1000);

            } catch (Exception ex) {

                System.out.println(ex);

            }

        }

    }

}

public class Program1 {

    public static void main(String args[])

    {

        N no = new N();

        no.start();

    }

}