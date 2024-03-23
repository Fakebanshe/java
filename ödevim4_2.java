package ödevim4_2;

import java.util.Random;

public class belirli {
    public static void main(String[] args) {
        // Matrislerin boyutlarını belirleme
        int[][] dizi1 = new int[2][3];
        int[][] dizi2 = new int[4][2];

        // Rastgele değerlerle matrisleri doldurma
        randomDegerlerleDoldur(dizi1);
        randomDegerlerleDoldur(dizi2);

        // İki matrisi çarpma ve sonucunu toplama
        int[][] carpim = matrisCarp(dizi1, dizi2);
        int toplam = matrisTopla(carpim);

        // Sonuçları yazdırma
        System.out.println("Matris 1:");
        matrisiYazdir(dizi1);
        System.out.println("Matris 2:");
        matrisiYazdir(dizi2);
        System.out.println("Çarpım Matrisi:");
        matrisiYazdir(carpim);
        System.out.println("Toplam: " + toplam);
    }

    // Verilen matrisi belirtilen aralıkta rastgele değerlerle dolduran metot
    public static void randomDegerlerleDoldur(int[][] matris) {
        Random rand = new Random();

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j] = rand.nextInt(10); // 0-9 arası rastgele değerler
            }
        }
    }

    // İki matrisin çarpımını hesaplayan metot
    public static int[][] matrisCarp(int[][] matris1, int[][] matris2) {
        int[][] carpim = new int[matris1.length][matris2[0].length];

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris2[0].length; j++) {
                for (int k = 0; k < matris1[0].length; k++) {
                    carpim[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }
        return carpim;
    }

    // Bir matrisin elemanlarının toplamını hesaplayan metot
    public static int matrisTopla(int[][] matris) {
        int toplam = 0;
        for (int[] row : matris) {
            for (int value : row) {
                toplam += value;
            }
        }
        return toplam;
    }

    // Matrisi ekrana yazdıran metot
    public static void matrisiYazdir(int[][] matris) {
        for (int[] row : matris) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
