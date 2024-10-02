//(1672. Richest Customer Wealth)

public class max_Wealth_1672 {
    public static void main(String[] args) {

        int[][] accounts = { {1,2,3},{9,3,0}};
        System.out.println(maximumWealth(accounts));

    }
    static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for( int pearson =0; pearson < accounts.length; pearson++){
            int sum =0;
            for(int account =0; account < accounts[pearson].length; account++){

                sum += accounts[pearson][account];

            }

            if(sum>ans){
                ans =sum;
            }
        }
        return ans;
    }
}
