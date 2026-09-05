import java.util.*;

class RnaTranscription {
    String transcribe(String dnaStrand) {

        Map<Character, Character> transcriptionMap = Map.of(
                'A', 'U',
                'T', 'A',
                'C', 'G',
                'G', 'C'
        );

        StringBuilder rna = new StringBuilder();

        for (char base : dnaStrand.toCharArray()) {
            rna.append(transcriptionMap.get(base));
        }


        return rna.toString();
    }

}
