package homework_8.utils;

import homework_8.loader.core.FormatRate;

import java.io.File;
import java.io.FileWriter;

public class WorkWithFile {

    public void saveToFile(String filePath, String fileName, FormatRate formatRate) {
        File file = new File(checkPath(filePath) + fileName);

        try {
            FileWriter writer = new FileWriter(file, false);

            writer.write(formatRate.toString());
            writer.close();
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private String checkPath(String filePath) {
        String  saveToFolder = filePath;
        String defaultFolder = "homework/src/homework_8/out/";

        //try {
        //    File file = new File(saveToFolder);
        //    boolean isCreated = file.mkdirs();
        //    boolean isTmp = file.getParent().equals(null);
        //    if (!isCreated || (file.getParent().equals(null))) {
        //        saveToFolder = defaultFolder;
        //    }
        //} catch(Exception e){
        //    saveToFolder = defaultFolder;
        //}

        try {
            File file = new File(saveToFolder);

            if (!file.exists() && !file.isDirectory()) {
                saveToFolder = defaultFolder;
            }

        } catch(Exception e) {
            saveToFolder = defaultFolder;
        }

        return saveToFolder;
    }
}
