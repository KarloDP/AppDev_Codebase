package Gumayagay_Kenneth;

public String longestPalindromeSubstring(String s) {
    if (s == null || s.isEmpty()) return "";
    char[] arr = s.toCharArray();
    int start = 0, end = 0;
    for (int i = 0; i < arr.length; i++) {
        int len1 = expand(arr, i, i);
        int len2 = expand(arr, i, i + 1);
        int len = Math.max(len1, len2);
        if (len > end - start + 1) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}
private int expand(char[] a, int left, int right) {
    while (left >= 0 && right < a.length && a[left] == a[right]) {
        left--;
        right++;
    }

    return right - left - 1;
}
}