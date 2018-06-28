package PointOffer;

public class P51_ReplaceSpaces {
    public String replaceSpace(StringBuffer str) {
        if(str == null)
            return null;
        StringBuffer str1 = new StringBuffer();
        for(int i = 0;i < str.length() ;i++){
            if (str.charAt(i) == ' '){
                str1.append('%');
                str1.append('2');
                str1.append('0');
            }
            else{
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }
    public static void main(String[] args){
        StringBuffer str = new StringBuffer();
        str.append("We are happy");
        P51_ReplaceSpaces object = new P51_ReplaceSpaces();
        System.out.print(object.replaceSpace(str));
    }
}
