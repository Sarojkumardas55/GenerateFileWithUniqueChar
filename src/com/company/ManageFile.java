package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class ManageFile implements StringInterface {

    public  void writeFile(int count){
         GenerateString generate=new GenerateString();
         UserInput userInput=new UserInput();
        count=userInput.getNumber();
        System.out.println("COUNT = "+count);


        try {
            FileWriter myWriter = new FileWriter("Saroj.txt");
            for (int i=0;i<count;i++){

                myWriter.write(generate.generateString()+"\n");
                //System.out.println();
            }
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    @Override
    public String generateString() {
        return null;
    }

    @Override
    public int getNumber() {
        return 0;
    }


}
