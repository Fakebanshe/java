package ödev4;

public class vektör {

    // İki vektörü çarparak sonucu döndüren metod
    public static double[] vectorMultiplication(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Vektörlerin boyutları eşit olmalıdır.");
        }

        double[] result = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            result[i] = vector1[i] * vector2[i];
        }
        return result;
    }

    // İki vektörü toplayarak sonucu döndüren metod
    public static double[] vectorAddition(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Vektörlerin boyutları eşit olmalıdır.");
        }

        double[] result = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            result[i] = vector1[i] + vector2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        double[] vector1 = {1, 2};
        double[] vector2 = {4, 5};

        // Çarpım işlemi
        double[] product = vectorMultiplication(vector1, vector2);
        System.out.print("Çarpım: ");
        for (double num : product) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Toplama işlemi
        double[] sum = vectorAddition(vector1, vector2);
        System.out.print("Toplam: ");
        for (double num : sum) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
