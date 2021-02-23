package M3.nivel3;

class Fibonacci {
    public static void main(String[] args) {

        //Creamos la serie Fibonaci de 11 números:
        //los 10 primeros números me los da el enunciado y calculo el siguiente número

        int n = 11, t1 = 0, t2 = 1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}

