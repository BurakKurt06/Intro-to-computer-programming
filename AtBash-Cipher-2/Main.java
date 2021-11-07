class Main {
       public static String decode(String cipher) {
        String text = "";
        for(Character c: cipher.toLowerCase().toCharArray())
            text += cipher(c);
        return text;
    }

    public static String encode(String text) {
        String cipherText = "";
        for(Character c: text.toLowerCase().toCharArray()) {
            if(cipherText.length() % 6 == 5)
                cipherText += " ";
            cipherText += cipher(c);
        }
        return cipherText.trim();
    }

    private static String cipher(Character c) {
        if('0' <= c && c <= '9')
            return String.valueOf(c);
        else if ('a' <= c && c <= 'z')
            return String.valueOf((char) (219 - (int) c));
        else
            return "";
    }
}