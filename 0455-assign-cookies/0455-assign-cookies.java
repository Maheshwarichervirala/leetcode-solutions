
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sind=0;
        int gind=0;
        while(gind<g.length && sind<s.length)
        {
            if(s[sind]>=g[gind]){
                gind++;
            }
            sind++;
        }
        return gind;
    }
}