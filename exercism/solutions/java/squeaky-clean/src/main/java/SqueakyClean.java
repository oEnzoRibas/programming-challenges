import java.util.Arrays;
import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {

        return omitNotLetters(
                letSpeakToNormal(
                        kebabToCamel(
                                spaceToUnderScore(identifier)
                        )
                )
        );
    }

    static String spaceToUnderScore(String str){
        char[] strToArray = str.toCharArray();
        for (int i = 0; i < strToArray.length; i++){
            if (Character.isWhitespace(strToArray[i])){
                strToArray[i] = '_';
            }
        }
        return new String(strToArray);
    }

    static String kebabToCamel(String str){
        StringBuilder newStr = new StringBuilder(str);

        for (int i = 0; i< newStr.length() - 1; i++){
            if (newStr.charAt(i) == '-'){
                newStr.setCharAt(i, Character.toUpperCase(newStr.charAt(i+1)));
                newStr.deleteCharAt(i+1);
            }
        }
        return newStr.toString();
    }

    static String letSpeakToNormal(String str){
        StringBuilder newStr = new StringBuilder(str);

        Map<Character,Character> map = Map.of(
                '3','e',
                '7','t',
                '0','o',
                '1','l',
                '4','a'
        );

        for (int i = 0; i< newStr.length(); i++){
            if (map.containsKey(newStr.charAt(i))){
                newStr.replace(i,i+1,String.valueOf(map.get(newStr.charAt(i))));
            }
        }
        return newStr.toString();
    }

    static String omitNotLetters(String str) {
        StringBuilder newStr = new StringBuilder(str);

        for (int i = 0; i < newStr.length(); i++) {

            char ch = newStr.charAt(i);
            if (!Character.isLetter(ch) && ch != '_') {
                newStr.deleteCharAt(i);
                i--;
            }
        }
        return newStr.toString();

    }
}
