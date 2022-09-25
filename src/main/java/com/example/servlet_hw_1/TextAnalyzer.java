package com.example.servlet_hw_1;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer {

    private HashSet<String> vowel = new HashSet<>();
    private HashSet<String> consonants = new HashSet<>();
    private HashSet<String> punctuation = new HashSet<>();

    int punctuationCount = 0;
    int vowelCount = 0;
    int consonantsCount = 0;

    Pattern patternPunctuation = Pattern.compile("[.,!:;?-]");
    Pattern patternVowel = Pattern.compile("[eyuioaуеёыаоэяию]");
    Pattern patternConsonants = Pattern.compile("[йцкнгшщзхфвпрлджчсмтбqwrtpsdfghjklzxcvbnm]");

    public String getAnalyzer(String text) {
        String result = "";

        Matcher matcherConsonants = patternConsonants.matcher(text);
        while (matcherConsonants.find()) {
            consonantsCount++;
            consonants.add(matcherConsonants.group());
        }

        Matcher matcherPunctuation = patternPunctuation.matcher(text);
        while (matcherPunctuation.find()) {
            punctuationCount++;
            punctuation.add(matcherPunctuation.group());
        }


        Matcher matcherVowel = patternVowel.matcher(text);
        while (matcherVowel.find()) {
            vowelCount++;
            vowel.add(matcherVowel.group());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<b>Text statistics : </b><br>");
        sb.append("<b>1) number of vowels : </b>" + vowelCount + "<br>");
        sb.append("<b>List of vowels </b>" + vowel.toString() + "<br>");
        sb.append("<b>2) number of consonants : </b>" + consonantsCount + "<br>");
        sb.append("<b>List of consonants </b>" + consonants.toString() + "<br>");
        sb.append("<b>3) number of punctuation : </b>" + punctuationCount + "<br>");
        sb.append("<b>List of punctuation </b>" + punctuation.toString() + "<br>");

        result = sb.toString();

        return result;
    }

}
