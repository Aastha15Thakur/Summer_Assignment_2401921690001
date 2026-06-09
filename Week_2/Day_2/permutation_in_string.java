class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        String sortedS1 = new String(arr1);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String window = s2.substring(i, i + s1.length());
            char[] arr2 = window.toCharArray();
            Arrays.sort(arr2);

            String sortedWindow = new String(arr2);

            if (sortedWindow.equals(sortedS1)) {
                return true;
            }
        }

        return false;
    }
}