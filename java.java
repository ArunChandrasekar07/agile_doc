✅ a) Addition
package com.example;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}
✅ b) Even / Odd (your style)
package com.example;

public class Even {
    public String even(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
✅ c) Multiplication
package com.example;

public class Multiplication {
    public int multiply(int a, int b) {
        return a * b;
    }
}
✅ d) Factorial
package com.example;

public class Factorial {
    public int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
✅ e) Prime Number
package com.example;

public class Prime {
    public String check(int n) {
        int flag = 0;

        if (n <= 1) {
            flag = 1;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0) {
            return "Prime";
        } else {
            return "Not Prime";
        }
    }
}
✅ (Optional) Main class to test all
package com.example;

public class Main {
    public static void main(String[] args) {

        Addition a = new Addition();
        System.out.println(a.add(2,3));

        Even e = new Even();
        System.out.println(e.even(5));

        Multiplication m = new Multiplication();
        System.out.println(m.multiply(2,4));

        Factorial f = new Factorial();
        System.out.println(f.fact(5));

        Prime p = new Prime();
        System.out.println(p.check(7));
    }
}