public class main3 {
    public static void main(String[] args) {
        int i,j,k;
        for (i=1; i<12; i++) {
            for(j=i; j<12;j++) {
                System.out.print(" ");
            }
            for (k=1; k<=i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}