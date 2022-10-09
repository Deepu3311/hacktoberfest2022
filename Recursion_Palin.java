/This is to check whether a String is Palingrome or not using Recursion
public class Recursive_Palin {
    public static void main(String[] args)
    {
        String st="NamaN";
        String s1="Hello";
        System.out.println(chk(0,st.length(),st));
        System.out.println(chk(0,s1.length(),s1));

    }
    public static boolean chk(int i,int n,String st)
    {
        if(i>n/2)return true;
       if( st.charAt(i)!=st.charAt(n-i-1))return false;
       return chk(i+1,n,st);
    }

}
