package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Numbers {
    public int [] run() {
        FileReader reader;
        int[] numbers;
        try {
            reader = new FileReader("C:\\Users\\admin\\IdeaProjects\\praktica\\src\\main\\java\\org\\example\\Numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();
            while(line != null){
                stringBuilder.append(line);
                line = bufferedReader.readLine();
            }
            String str = stringBuilder.toString();
            String[] numbersString = str.replace(" ", "").split(",");
            numbers = new int[numbersString.length];
            for (int i=0; i < numbersString.length; i++){
                numbers[i] = Integer.parseInt(numbersString[i]);
            }
        }
        catch (IOException e){
            System.out.println(e);
            numbers = null;
        }

        return numbers;
    }
    public void pop(){
        int[] myNums = run();
        Arrays.sort(myNums);
        System.out.println(Arrays.toString(myNums));

    }
    public  void min(){
        int[] myNums = run();
        int min = Arrays.stream(myNums).min().getAsInt();
        System.out.println("Минимальное значение:" + min);
    }
    public void max(){
        int[] myNums = run();
        int max = Arrays.stream(myNums).max().getAsInt();
        System.out.println("Максимальное значение:" + max);
    }
}