public class Solution {
public void sortColors(int[] A) {
    int one = 0; 
    int two = 0;
    for(int i=0;i<A.length;i++){
        if(A[i]==0){
            A[i] = A[two];
            A[two] = A[one];
            A[one] = 0;
            one++;
            two++;
        }
        else if(A[i]==1){
            A[i] = A[two];
            A[two] = 1;
            two++;
        }
    }
}}
