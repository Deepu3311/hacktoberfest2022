class PalindromString{
    public static void main(String[] args) {
        String st = "madam";
        String rev = "";
        for(int i=st.length()-1;i>=0;i--){
            rev = rev+st.charAt(i);
        }
        if(rev.equals(st)){
            System.out.println("String is Palindrom");
        }
        else{
            System.out.println("String is not Palindrom");
        }
    }
}