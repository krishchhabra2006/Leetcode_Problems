import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if (p.length()>s.length()) return ans;
        int[] mpp=new int[26];
        int[] temp=new int[26];
        for (int i=0;i<p.length();i++) {
            mpp[p.charAt(i)-'a']++;
            temp[s.charAt(i)-'a']++;
        }
        if (Arrays.equals(temp,mpp)) ans.add(0);
        for (int i = p.length();i<s.length(); i++) {
             temp[s.charAt(i)-'a']++;
             temp[s.charAt(i -p.length())-'a']--;
             if(Arrays.equals(temp,mpp)){
                ans.add(i-p.length()+1);
             }
        }
        return ans;
    }
}