package com.company;

public class GenerateString implements StringInterface{
    @Override
    public String generateString() {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        // create a super set of all characters
        String allCharacters = lowerCase + upperCase + numbers;
        // initialize a string to hold result
        StringBuffer randomString = new StringBuffer();
        // loop for 100 times
        for (int i = 0; i < 100; i++) {
            // generate a random number between 0 and length of all characters
            int randomIndex = (int)(Math.random() * allCharacters.length());
            // retrieve character at index and add it to result
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();

    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public void writeFile(int x) {

    }
}
