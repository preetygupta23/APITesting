public class PowerCalculator
{

    public int sum(int a,int b)
    {
        return(a+b);
    }

    public double power(int a, int b)
    {
        int result = 1;
        if (a==0)
        {
            return 0;
        }
        if (b > 0)
        {
            for (int i = 1; i <= b; i++)
            {
                result = result * a;
            }
            return result;
        }

       if (b<0)
        {
            b= b * (-1);
            return (1/power(a,b));
        }
        if(b==0)
        {
            return 1;
        }
        return 0;

    }
}
