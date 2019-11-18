public class SolutionAB {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if (A.length != 0) {
            B[0] = 1;
            //计算下三角连乘
            for (int i = 1; i < A.length; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }
            int temp = 1;
            //计算上三角
            for (int j = A.length - 2; j >= 0; j--) {
                temp *= A[j + 1];
                B[j] *= temp;
            }
        }
        return B;
    }
}
