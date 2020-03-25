import java.util.Scanner;

public class Stack3{
    public static void main(String[] args) {
        st s = new st();
        Scanner input = new Scanner(System.in);
        first:while(true){
            System.out.println("1.push in integer stack");
            System.out.println("2.push in float stack");
            System.out.println("3.push in character stack");
            System.out.println("4.pop in integer stack");
            System.out.println("5.pop in float stack");
            System.out.println("6.pop in character stack");
            System.out.println("7.exit");
            System.out.println("select on of the above Stack operations");
            int opt =input.nextInt();
            switch(opt){
                case 1:System.out.println("Enter data to push in the int_stack");
                       int x = input.nextInt();
                       s.push(x);
                case 2:System.out.println("Enter data to push in float_stack");
                       float f = input.nextFloat();
                       s.push(f);
                case 3:System.out.println("Enter data to push in char_stack");
                       char c = input.next().charAt(0);
                       s.push(c);
                case 4:s.ipop();
                case 5:s.fpop();
                case 6:s.cpop();
                case 7:break first;
                default:System.out.println("Please enter valid option");
                    
            }
        }
    }
}
class st{
    static int itop = -1;
    static int ftop = -1;
    static int ctop = -1;
    int[] a = new int[5];
    float[] b = new float[5];
    char[] d = new char[5];
    void push(int x){
        if(itop == 5)
            System.out.println("Stack overflow");
        else{
            itop++;
            a[itop] = x;
        }
    }
    void push(float f){
        if(ftop == 5)
            System.out.println("Stack overflow");
        else{
            ftop++;
            b[ftop] = f;
        }
    }
    void push(char c){
        if(ctop == 5)
            System.out.println("Stack overflow");
        else{
            ctop++;
            d[ctop] = c;
        }
    }
    void ipop(){
        if(itop == -1)
            System.out.println("Stack is empty");
        else{
            System.out.println("Top ele in int_stack is "+a[itop--]);
        }
    }
    void fpop(){
        if(ftop == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top ele in int_stack is "+b[ftop--]);
        }
    }
    void cpop(){
        if(ctop == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top ele in int_stack is "+d[ctop--]);
        }
    }
}