public class CodeSort {
    public static void main(String[] args) {

        int temp;
        boolean fixed = false;

        int[] Array = {50, 70, 30, 66, 10, 45, 60, 80, 35, 55, 42, 22};
        while (fixed == false) {

            fixed = true;


            for (int i = 0; i < Array.length - 1; i++) {

                if (Array[i] > Array[i + 1]) {
                    temp = Array[i + 1];
                    Array[i + 1] = Array[i];
                    Array[i] = temp;


                    fixed = false;
                }

                }

            }

            for (int A : Array) {
                System.out.println(A);


        }

    }

}





