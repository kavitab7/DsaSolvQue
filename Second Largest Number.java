https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] ans = {-1 , -1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMax = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        for(int i =0;i<n;i++){
            if( a[i]!=max && a[i]>secMax ){
                secMax = a[i];
            }
            if( a[i]!=min && a[i]<secMin){
                secMin = a[i];
            }
            
        }
        ans[0] = secMax;
        ans[1] = secMin;
        return ans;
    }
}
