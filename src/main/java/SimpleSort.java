public class SimpleSort {
    public static void main(String[] args) {
        
        int[] x = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] y = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};
        int[] z = new int[24];
        int x1 = 0, y1 = 0;
        
        for(int i =0; i < z.length; i++) {
            if(y[y1] < x[x1]) {
                z[i] = y[y1];
                if(y1 < 10) {
                    y1++;
                }
            } else if(x[x1] < y[y1]) {
                z[i] = x[x1];
                x1++;
            }
            System.out.print(z[i] + " ");
        }
        // This doesn't work, fix it later
    }
}