//hey easy h bro 
public String compress(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result.append(s.charAt(i)).append(count);
                count = 1; // reset count for new character
            }
        }
        // Append the last character group manually
        result.append(s.charAt(s.length() - 1)).append(count);
        return result.toString();
    }
