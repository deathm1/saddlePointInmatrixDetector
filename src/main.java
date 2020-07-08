import java.util.*;

public class main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sizeOfMartix = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[sizeOfMartix][sizeOfMartix];

        int temp=sizeOfMartix;
        int ans = 0;



        for(int i=0; i<temp; i++){
            String line = sc.nextLine().trim();
            String[] array = line.split(" ");

            for (int j=0; j<sizeOfMartix; j++){
                matrix[i][j]=Integer.parseInt(array[j]);
            }
        }

        //Finding saddle point in the array
        for(int i=0; i<temp; i++){
            int min_row = matrix[i][0], col_ind = 0;

            for (int j = 1; j < sizeOfMartix; j++) {
                if (min_row > matrix[i][j])
                {
                    min_row = matrix[i][j];
                    col_ind = j;

                }
            }
            System.out.println("c:"+min_row+"ind:"+col_ind);


            int k;
            for (k = 0; k < sizeOfMartix; k++){
                if (min_row < matrix[k][col_ind])
                    break;

            }

            System.out.println(k);
            if (k == sizeOfMartix)
            {
                System.out.println("Saddle Point " + min_row + " at " + "("+i+","+col_ind+")");
            }
            else {
                System.out.println("Saddle Point not found");
            }



        }




    }

}
