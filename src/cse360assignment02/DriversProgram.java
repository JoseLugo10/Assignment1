package cse360assignment02;

public class DriversProgram {

    public static void main(String[] args)
    {
        AddingMachine calc = new AddingMachine();
        calc.add(6);
        calc.subtract(4);
        calc.add(12);
        calc.subtract(3);
        calc.add(6);
        calc.subtract(4);
        calc.add(12);
        calc.subtract(3);
        calc.add(6);
        calc.subtract(4);
        calc.add(12);
        calc.subtract(3);
        calc.add(6);
        calc.subtract(4);
        calc.add(12);
        calc.subtract(3);
        System.out.println(calc.toString());
        System.out.println(calc.getTotal());
        calc.clear();
        System.out.println(calc.toString());
        calc.add(1);
        calc.subtract(20);
        calc.add(9);
        System.out.println(calc.toString());
        System.out.println(calc.getTotal());
    }
}
