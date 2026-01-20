class Solution {
    public int maxDistinct(String s) {
        String str="";
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(str.indexOf(c)==-1){
                str+=c;
                count++;
            }
        }
        return count;
    }
}
