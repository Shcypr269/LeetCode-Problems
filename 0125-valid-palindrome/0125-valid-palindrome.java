class Solution {
    public boolean isPalindrome(String s) {
    String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            rev += st.charAt(i);
        }
        if (st.equals(rev)) {
            return true;
        } else
            return false;
    }
}