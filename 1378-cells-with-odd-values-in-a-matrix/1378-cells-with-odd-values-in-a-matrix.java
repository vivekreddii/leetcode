class Solution {
    public int oddCells(int m, int n, int[][] indices) { 
        int[] rows=new int[m];
        int[] cols=new int[n];

        for(int[] arr:indices){
            rows[arr[0]]++;
            cols[arr[1]]++;
        }

        int row_count=0;
        int col_count=0;
        for(int i=0;i<m;i++){
            if(rows[i]%2!=0){
                row_count++;
            }
        }

        for(int i=0;i<n;i++){
            if(cols[i]%2!=0){
                col_count++;
            }
        }

        int ans=0;

        ans=(row_count*(n-col_count))+((m-row_count)*col_count);

        return ans;
    }
}