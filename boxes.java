public class boxes {
    public static void main(String[] args) {
       
        int k = 5;
        for (int i = 1; i <= k; i++) {
            

            for (int j = 1; j <= k; j++) {
                
     
                
                if (i == 1 || i == k || j == 1 || j == k || i == j || j == (k - i + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }

            System.out.println();
        }
    }
}