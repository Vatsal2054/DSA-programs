import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int top = (-1);
        int[] s = new int[100];
        int x = 0;
        int menu = 0;
        System.out.println("Enter a number to access a menu operation\nPush    -1 \nPop     -2 \nDisplay -3\nExit    -4");
        do{
            int exit = 0;
            System.out.print("Select function : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                System.out.print("Enter an element to push to the stack: ");
                    x = sc.nextInt();
                    push(sc, s, top, x);
                    top++;
                    break;

                case 2:
                    x = pop(s, top);
                    System.out.println("The popped element is:" + x + "\n");
                    break;

                case 3:
                    display(s,top);
                    break;

                case 4:
                    exit = 1;
                    break;

                default:
                    break;
            }
            if(exit == 1)
            {
                break;
            }
        }while(menu >= 1 && menu <= 4);
        
            
    }

    private static void display(int[] s, int top) {
        for (int i = top; i >= 0; i--) {
            System.out.print("Element " + (top-i+1) + " :" + s[i] + "\n");
        }
    }

    private static int pop(int[] s, int x) {
        int temp = 0;
        if(x == (-1))
        {
            System.out.println("Underflow");
        }
        else{
            temp = s[x];
            return temp;
        }
        return temp;
    }

    private static void push(Scanner sc, int[] s, int top, int x) {
        if(top == (s.length-1)){
            System.out.println("Overflow");
        }
        else{
            top++;
            s[top] = x;
        }
        return;
    }
}
