class Recursion{
    static void subString(String str, String args){
        if(str.length()==0){
            System.out.println(args);
            return;
        }
        char ch = str.charAt(0);
        subString(str.substring(1), args+ch);
        subString(str.substring(1), args);
    }
    public static void main(String[] args){
        subString("abc", "");
    }
}