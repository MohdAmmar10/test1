import java.util.*;

import javax.lang.model.util.ElementScanner6;
class Calc
{
    static boolean isOpd(char c)
    {
        return(c>='0'&&c<='9');
    }
    static int value(char c)
    {
        return (int) c-'0';
    }
    static int evaluate(String e)
    {
        if(e.length()==0)
            return -1;
        int res=value(e.charAt(0));
        for(int i=1;i<e.length();i+=2)
        {
            char op=e.charAt(i),opd=e.charAt(i+1);
            if(isOpd(opd)==false)
                return -1;
            if(op=='+')
                res+=value(opd);
            else if(op=='-')
                res-=value(opd);
            else if(op=='*')
                res*=value(opd);
            else if(op=='/')
                res/=value(opd);
            else
                return -1;           
        }
        return res;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String eq;
    eq=sc.nextLine();
    int res=evaluate(eq);
    if(res==-1)
    {
        System.out.println("Expression is invalid");
    }
    else
    {
    System.out.println(res);
    }
    }   

}