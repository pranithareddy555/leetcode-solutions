class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // int len1 = str1.length();
        // int len2 = str2.length();
        // int r = len1/len2;
        // int i=0,j=0;
        // StringBuilder largest= new StringBuilder();
        // while(i<=r)
        // {
        //     if(str1[i]==str2[j])
        //     largest.append(str1.charAt(i++));
        //     System.out.println("");
        // }
        // return largest.toString();
        if(!((str1+str2).equals((str2+str1))))
        return "";

        int gcdLen = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLen);
    }
    public int gcd(int a, int b)
        {
            if(b==0)
            return a;
            return gcd(b, a%b);
        }
}