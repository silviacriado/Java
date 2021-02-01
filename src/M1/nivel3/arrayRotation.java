package M1.nivel3;

public class arrayRotation {
    public static void rotateLeft(int array[], int d, int n) {
        for (int i = 0; i < d; i++)
        //calling function without passing the number of rotations
        {
            rotateArrayByOne(array, n);
        }
    }
    public static void rotateArrayByOne(int array[], int n) {
        int i, temp;
        //temporary array (array auxiliar) to store newly created array
        temp = array[0];
        for (i = 0; i < n - 1; i++)
        //shifts array element to the left by 1
        array[i] = array[i + 1];
        array[i] = temp;
    }
    public static void main(String args[]) {
        //Array inicial
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int r = 1;
        int n = array.length;
        System.out.println("Array inicial: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        rotateLeft(array, r, n);
        System.out.println("\nArray después de rotación: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}