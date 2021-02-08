package M2.nivel2;

public class ScaleAsterics {
    public static void main(String[] args) {
        int sizeOfPyramid = 8;

        for(int i = 1; i <= sizeOfPyramid;i++) {
            // reducimos numero de espacios en cada linea que dibujemos en la consola
            for(int j = i; j <= sizeOfPyramid-1; j++) {
                System.out.print(" ");
            }
            // el numero de asteriscos por linea es 2*rownumber-1
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}