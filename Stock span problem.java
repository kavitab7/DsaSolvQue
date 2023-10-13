
https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[n];
        ans[0]=1;
        s.push(0);
        for(int i=1;i<n;i++){
            while(!s.isEmpty() && price[i]>=price[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=i+1;
            }else{
                int p=s.peek();
                ans[i]=i-p;
            }
            s.push(i);
        }
        return ans;
    }
    
}
