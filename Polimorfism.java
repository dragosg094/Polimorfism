package pack1.Polimorfism;

import java.util.ArrayList;

public class Polimorfism {

    public static void staticPolimorf(String var) {
        System.out.println("String: " + var);
    }
    public static void staticPolimorf(int var) {
        System.out.println("int: " + var);
    }
    public static void staticPolimorf(double var) {
        System.out.println("double: " + var);
    }
    public static void staticPolimorf(char var) {
        System.out.println("char: " + var);
    }
    public static void staticPolimorf(boolean var) {
        System.out.println("boolean: " + var);
    }
    public static void main(String [] args){

        Polimorfism1 example1 = new Polimorfism1();
        Polimorfism1 example2 = new Polimorfism2();
        Polimorfism1 example3 = new Polimorfism3();

        ArrayList<Polimorfism1> list = new ArrayList<>();
        list.add(example1);
        list.add(example2);
        list.add(example3);

       // Exemplu de polimorfism dinamic
        for(int i = 0; i<3;i++){
          list.get(i).printInfo();
        }

        //Exemplu de polimorfism static

        staticPolimorf(1);
        staticPolimorf('c');
        staticPolimorf(2.0);
        staticPolimorf("cuvinte");
        staticPolimorf(true);

    }


}
