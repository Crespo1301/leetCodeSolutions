import java.util.Stack;

public class ContainsDuplicate
{
    public boolean containsDuplicate(int [] nums) 
    {
        Stack<Integer> stack = new Stack<>();
        for(int num : nums)
        {
            if(stack.contains(num))
            {
                return true;
            }
            stack.push(num);
        }
        return false;
        
    }
    
    public static void main(String[] args) 
    {
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(new int[]{1,2,3,1})); // true
    }
}