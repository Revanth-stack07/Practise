class practise {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m || i < n; ++i) 
        {
            if (i < m) 
            {
                ans.append(word1.charAt(i));
            }
            if (i < n) 
            {
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
}

public class Solution{
    public static void main(String[] args) {
        practise ob = new practise();
        System.out.println(ob.mergeAlternately("abc", "pqr"));

        
    }
}