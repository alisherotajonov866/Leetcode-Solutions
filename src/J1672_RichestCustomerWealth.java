public class J1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0,s = 0 ;
        for (int i=0;i<accounts.length;i++){
            s = 0;
            for (int j=0;j<accounts[0].length;j++){
                s += accounts[i][j];
            }
            if (s>max){
                max = s ;
            }
        }
        return max;
    }
}
