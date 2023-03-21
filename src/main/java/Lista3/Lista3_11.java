package Lista3;

public class Lista3_11 {
    public static void main(String[] args) {

        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[30];

        for (int iA = 1; iA < A.length; iA++) {
            System.out.println("matriz A: " + iA);
            A[iA] = iA;
        }

        System.out.println("Valores da matriz B");


        for (int iB = 1; iB < B.length; iB++) {
            System.out.println("matriz B: " + iB);
            B[iB] = iB;
        }

        System.out.println("Matriz c, valores somados:");

        for (int i = 1; i < 15; i++) {
            C[i] = A[i];
            C[i + 15] = B[i];
        }

        for (int i = 0; i < 30; i++) {
            System.out.println("valores C: " + C[i]);


        }

    }
}