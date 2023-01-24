package HW2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteString {
    public static void main(String[] args) {
        String str = String.valueOf(CreateTest());
        //System.out.println(str);
        WriteFile(str);
    }
    public static StringBuilder CreateTest (){
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        return sb;
    }

    public static void WriteFile(String str){
        try (FileWriter writer = new FileWriter ("file.txt", false)){
            writer.write(str);
            writer.flush();
            System.out.println("Запись файла успешно завершена");
        } catch (IOException e) {
            System.out.println("Ошибка!: " + e);
        }

    }
}
