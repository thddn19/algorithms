import java.util.Scanner;

public class 유클리드공약수 {
    public static void main(String[] args) {
        int n = gcd(2339,2002);
        System.out.println(n);
        q();
        int i = 1;
        int j = 1;
        boolean flag = true;
//        for (; flag; i++) {
//            for (; flag ; j++) {
//                if(n == i*2339-j*2002)
//                    flag = false;
//            }
//        }
//        System.out.println(i+" "+ j);
    }

    static private int gcd(int a, int b) {
        //if(b == 0) return a;
        return b != 0 ? gcd(b, a%b) : a;
    }

    public static void q() {
        Scanner input = new Scanner(System.in);
        System.out.println("modulo 역원을 구하고 싶은 값 A를 입력해주세요.");
        int a = input.nextInt();
        System.out.println("module값 B를 입력해주세요.");
        int b = input.nextInt();
        /*
         * modulo의 역수를 구하는 방법은 다음과 같습니다. A와 B가 주어지고 0~B-1의 값을 C라고 하였을 때, A * C mod B =
         * 1이 되는 C의 값을 A의 모듈로 역원 이라고 합니다. 이 프로그램에서는 위 방식을 사용하여 모듈로의 역원을 구하도록 설계하였습니다.
         */
        int inverseMod = 0;
        boolean inverseModExist = false;
        for (int i = 0; i < b; i++) {
            int multiple = a * i;
            inverseMod = multiple % b;
            if (inverseMod == 1) {
                inverseMod = i;
                inverseModExist = true;
                break;
            }
        }
        if (inverseModExist)
            System.out.println(a + " 의 모듈로 역원은 " + inverseMod + "입니다.");
        else
            System.out.println(a + " 의 모듈로 역원은 존재하지 않습니다.");
    }
}
