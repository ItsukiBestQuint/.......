import java.util.Random;

public class Villegas_twoDim {
    public static void main(String[] args) {
        Random num = new Random();

        int[][] twoDim = new int[5][5];

        int i = 0;
        int j = 0;
   

        System.out.println("1) Output the array elements");

        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                twoDim[i][j] = (int) (Math.random()*(75-10)+10);
                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("2) Output the sum of prime numbers in the array");
        boolean prime;
        int sumPrime = 0;
        for (i = 0; i < 5 ; i++){
            for (j = 0; j < 5; j++){
                for (int k = 2; k <= Math.sqrt(twoDim[i][j]) ; k++){
                    if (twoDim[i][j]%k==0){
                        prime = false;
                    }
                }
                if(prime = true){
                    sumPrime = sumPrime + twoDim[i][j];
                }
            }
        }

        System.out.println(sumPrime);
        System.out.println("3) Output the elements in the main diagonal");
           for (i = 0; i < 5 ; i++){
            for (j = 0; j < 5; j++){
                if (i == j){
                System.out.print(twoDim[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("4) Output the sum of elements below the diagonal");
        int sum1 = 0;
        for (i = 0; i < 5 ; i++){
            for (j = 0; j < 5; j++){
                if (i > j){
                    sum1 = sum1 + twoDim[i][j];
                }
            }
      }
    System.out.println(sum1);

        System.out.println("5) Output the sum of elements above the diagonal");
        int sum2 = 0;
        for (i = 0; i < 5 ; i++){
            for (j = 0; j < 5; j++){
                if (i < j){
                    sum2 = sum2 + twoDim[i][j];
                }
            }
      }
    System.out.println(sum2);

    System.out.println("6) Output the odd numbers below the diagonal");
    for (i = 0; i < 5 ; i++){
        for (j = 0; j < 5; j++){
            if (i > j){
                if (twoDim[i][j]%2!=0){
                    System.out.print(twoDim[i][j] +" ");
                }
            }
        }
  }
  System.out.println();
  System.out.println("6) Output the even numbers above the diagonal");
    for (i = 0; i < 5 ; i++){
        for (j = 0; j < 5; j++){
            if (i < j){
                if (twoDim[i][j]%2==0){
                    System.out.print(twoDim[i][j] +" ");
                }
            }
        }
  }
}
    
}
    

