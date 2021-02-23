package M3.nivel2;

public class ArrayBidimensional {
    public static void main(String[] args) {

        // Escribimos las notas de los alumnos

        int[][] notes = { {7, 8, 8}, {6, 5, 8} };

        for (int[] note : notes) {
            int sum = 0;
            for (int i : note) {
                sum += i;
            }
            System.out.println("La nota media es: " + sum / note.length);
            System.out.println();
        }
    }
}
