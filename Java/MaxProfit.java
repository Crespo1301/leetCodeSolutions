import java.util.Stack;

public class MaxProfit
{
    public static int maxProf(int [] prices) 
    {
        int minPrice = prices[0];
        int maxPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length - 1; i++) 
        {
            if(prices[i] < minPrice) 
            {
                minPrice = prices[i];
                maxPrice = prices[i];
            } 
            else if (prices[i] > maxPrice) 
            {
                maxPrice = prices[i];
         
            }

            System.out.println("Min Price: "+ minPrice + " Max Price: "+ maxPrice);
        }
        maxProfit = maxPrice - minPrice;
        return maxProfit; 
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Max Profit: "+ maxProf(new int[]{7,1,5,3,6,4})); //5
        
    }
}