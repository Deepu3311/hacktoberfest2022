class RevrseString{
    public static void main(String[] args) {
        String st = "Rishabh";
        String rev = "";
        for(int i=st.length()-1;i>=0;i--){
            rev = rev+st.charAt(i);

        }
        System.out.println(rev);
    }
}