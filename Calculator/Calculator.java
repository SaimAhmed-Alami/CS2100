public class Calculator {
    private int mem1;
    private int mem2;
    private String op;

    public Calculator(){
        this.mem1 =0;
        this.mem2 = 0;
        this.op = "";
    }

    public Calculator(int op1, int op2, String newOp){
        this.mem1 = op1;
        this.mem2 = op2;
        this.op = newOp;
    }

    //getters
    public int getMem1(){
        return mem1;
    }

    public int getMem2(){
        return mem2;
    }

    public String getOp(){
        return op;
    }

    //setters
    public void setMem1(int op1){
        mem1 = op1;
    }

    public void setMem2(int op2){
        mem2 = op2;
    }

    public void setOp(String newOp){
        op = newOp;
    }

    //toString
    public String toString(){
        return Integer.toString(mem1)+" "+op+" "+Integer.toString(mem2);
    }

    //others
    public int perform(){
        if (op.equals("/") && mem2==0) return 0;
        mem2 = switch(op){
            case "+" -> mem1+mem2;
            case "-" -> mem1-mem2;
            case "*" -> mem1*mem2;
            case "/" -> mem1/mem2;
            case "^" -> mem1^mem2;
            default -> 0;
        };
        return mem2;

    }

    public double performDiv(){
        if (op.equals("/") && mem2 !=0){
            return (double)mem1/mem2;
        }
        else{
            return 0.0;
        }
    }

    public void swap(){
        int temp = mem1;
        mem1 = mem2;
        mem2 = temp;
    }
}
