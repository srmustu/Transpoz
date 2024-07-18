import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matrisin boyutlarını kullanıcıdan al
        System.out.print("Matrisin satır sayısı: ");
        int rows = scanner.nextInt();
        System.out.print("Matrisin sütun sayısı: ");
        int cols = scanner.nextInt();

        // Matrisi oluştur
        int[][] matrix = new int[rows][cols];

        // Matrisin elemanlarını kullanıcıdan al
        System.out.println("Matrisin elemanlarını giriniz: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Matris[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu hesapla
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Orijinal matrisi yazdır
        System.out.println("Matris: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }

        // Transpoze matrisi yazdır
        System.out.println("Transpoze: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "    ");
            }
            System.out.println();
        }
    }

}
