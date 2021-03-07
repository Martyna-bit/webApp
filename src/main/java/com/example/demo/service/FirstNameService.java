package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FirstNameService {

    public String fromBehind(String firstName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = firstName.length() - 1; i > -1; i--) {
            stringBuilder.append(firstName.charAt(i));
        }
        return stringBuilder.toString();
    }

    public String isMale(String firstName) {
        if (!(firstName.charAt(firstName.length() - 1) == 'a' || firstName.charAt(firstName.length() - 1) == 'A')) {
            return "Tak";
        } else {
            return "Nie";
        }
    }

    public int vowels(String firstName) {
        int result = 0;
        for (char element : firstName.toCharArray()) {
            if (
                    element == 'a' ||
                            element == 'ą' ||
                            element == 'e' ||
                            element == 'ę' ||
                            element == 'i' ||
                            element == 'o' ||
                            element == 'u' ||
                            element == 'y'
            ) result++;
        }
        return result;
    }

    public int consonants(String firstName) {
        int result = 0;
        for (char element : firstName.toCharArray()) {
            if (
                    !(element == 'a' ||
                            element == 'ą' ||
                            element == 'e' ||
                            element == 'ę' ||
                            element == 'i' ||
                            element == 'o' ||
                            element == 'u' ||
                            element == 'y')
            ) {
                result++;
            }
        }
        return result;
    }
}