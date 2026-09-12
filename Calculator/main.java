public class main {
    public static void main(String[] args){
        Calculator c = new Calculator();
        Calculator c2 = new Calculator(1,2,"+");
        System.out.println(c);
        System.out.println(c2);
        System.out.println("");

        c.setMem1(5);
        c.setMem2(7);
        c.setOp("+");
        System.out.println(c);
        System.out.println(c.perform());
        System.out.println("");

        c.swap();
        c.setOp("-");
        System.out.println(c);
        System.out.println(c.perform());
        System.out.println("");

        c.setOp("*");
        System.out.println(c.perform());
        System.out.println("");

        c.swap();
        c.setOp("/");
        System.out.println(c);
        System.out.println(c.perform());
        System.out.println("");

        System.out.println(c);
        System.out.println("mem2 is " + c.getMem2());
        System.out.println("");

        System.out.println(c.performDiv());
        System.out.println("");

        c.setMem2(0);
        System.out.println(c.perform());
        System.out.println(c);
    }
}
