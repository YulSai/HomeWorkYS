package home_work_5.additional.StringMaker;

import home_work_5.additional.StringMaker.api.IFileToString;

import java.io.IOException;

public class MakerForString {
    public MakerForString() {
    }

    public String createTextToString() throws IOException {
        String fileName = "C:\\Users\\yluya\\IdeaProjects\\JD1\\HomeWork\\src\\home_work_5\\resources\\Война и мир_книга.txt";
        IFileToString reader = new FileToString();

        return reader.readerToString(fileName);
    }

    public String handleString(String text) {
        String chars = "(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)";
        return text.replaceAll(chars, "  ").replaceAll("\\s{1,}", " ").toLowerCase();
    }

    public String[] transformStringToArray(String text) {
        String[] arr = text.split(" ");
        return arr;
    }

    public String[] prepareString (String text){
        return transformStringToArray(handleString(text));
    }


}
