package m4p1_algoritma;
public class M4P2_AlgoritmaPencarian_PK_No1 {
    
    public static void main(String[] args) {
        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;
        sequentialSearch(exampleVariableOne, target);
    }

    private static void sequentialSearch(int[] parameterOne, int parameterTwo) {
        int index = -1; 
        //searches each index of the array until it reaches the last index
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                //if the target is found, int index is seat as the value of i and 
                //the for loop is terminated
               index = i;
               break;
            }
            
        }
        if (index == -1) {
           System.out.println("your target integer does not exist in the array");   
        }else{
            System.out.println("your target integer is in index " + index + " of the array");
        }
    }
    
}
