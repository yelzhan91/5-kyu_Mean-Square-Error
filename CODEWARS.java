public class CODEWARS {
    public static void main(String[] args) {
         int[] arr1 = {1, 2, 3};
         int[] arr2 = {4, 5, 6};
         double res = 0;
         res = solution(arr1, arr2);
         System.out.println(res);//9.0
         /*int[] arr1 = {10, 20, 10, 2};
         int[] arr2 = {10, 25, 5, -2};
         double res = 0;
         res = solution(arr1, arr2);
         System.out.println(res);//16.5*/
         /*int[] arr1 = {0, -1};
         int[] arr2 = {-1, 0};
         double res = 0;
         res = solution(arr1, arr2);
         System.out.println(res);//1.0*/
         /*int[] arr1 = {10, 10};
         int[] arr2 = {10, 10};
         double res = 0;
         res = solution(arr1, arr2);
         System.out.println(res);//0.0*/
    }
    public static double solution(int[] arr1, int[] arr2) {
        double res = 0;
        int[] diff = new int[arr1.length];
        for (int i = 0; i< arr1.length; i++) {
            diff[i] = Math.abs(arr1[i]-arr2[i]);
            res += Math.pow(diff[i], 2);
        }
        res = res/ diff.length;
        return res;
    }
}