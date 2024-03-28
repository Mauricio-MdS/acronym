import java.util.Arrays;

class Acronym {

    private final String acronym;

    Acronym(String phrase) {
        var sb = new StringBuilder();
        Arrays.stream(phrase.split("[ _-]")).forEach(word -> {
            if (!word.isBlank()) sb.append(word.charAt(0));
        });

        acronym = sb.toString().toUpperCase();
    }

    String get() {
        return acronym;
    }

}
