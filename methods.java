import java.util.*;
public class methods{
    void fung(){
        System.out.println("he");
    }

   int  Fun2(int m,int n,int p){
        return m+n+p;

    }
    static class Fun1 {
        int add(int a,int b){
            return a+b;
        }
        int sub(int p,int p1){
            return p-p1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fun1 h = new Fun1();
        System.out.println("Enter first no");
        int l = sc.nextInt();
        int l1 = sc.nextInt();
        int a = h.add(l, l1);
        int y = h.sub(5, 10);
        System.out.println(a);
        System.out.println(y);
        methods k = new methods();
        k.fung();
        methods s = new methods();
        int c = s.Fun2(1,2,3);
        System.out.println(c);
    }
}
