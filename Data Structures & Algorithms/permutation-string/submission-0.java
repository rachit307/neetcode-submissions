class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length())
        {
            return false;
        }
        int n = s1.length();
        int[] bucket1 = new int[26];
        int[] bucket2 = new int[26];

        for(int i =0;i<n;i++)
        {
            char ch = s1.charAt(i);
            bucket1[ch-'a']+=1;
        }

        for(int i =0;i<n;i++)
        {
            char ch = s2.charAt(i);
            bucket2[ch-'a']+=1;
        }

        if(Arrays.equals(bucket1,bucket2))
        {
            return true;
        }

        for(int i=n;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            bucket2[ch-'a']+=1;
            char ch2 = s2.charAt(i-n);
            bucket2[ch2-'a']-=1;

            if(Arrays.equals(bucket1,bucket2))
            {
                return true;
            }
        }
        return false;
    }

}
