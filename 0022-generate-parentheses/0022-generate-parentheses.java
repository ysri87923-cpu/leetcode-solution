class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate("", 0, 0, n);
        return ans;
    }

    void generate(String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (open < n)
            generate(s + "(", open + 1, close, n);

        if (close < open)
            generate(s + ")", open, close + 1, n);
    }
}