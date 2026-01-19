import java.util.Stack;

public class MaxProfit
{
    public static int maxProf(int [] prices) 
    {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) 
        {
            if (prices[i] < minPrice) 
            {
                minPrice = prices[i];
            } 
            else 
            {
                int profitToday = prices[i] - minPrice;
                if (profitToday > maxProfit) 
                {
                    maxProfit = profitToday;
                }
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Max Profit: "+ maxProf(new int[]{2,4,1})); //5
        
    }
}