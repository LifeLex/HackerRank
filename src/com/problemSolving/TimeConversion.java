package com.problemSolving;
import java.io.*;
import java.util.*;


public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String time = null;
        if (s.matches(".*AM")){
            if (s.substring(0,2).matches("12")){
                time="00"+s.substring(2,8);
                return time;
            }else{
                return s.replace("AM","");
            }

        }else{
            switch (s.substring(0,2)){
                case "01":
                    time="13"+s.substring(2,8);
                    break;
                case "02":
                    time="14"+s.substring(2,8);
                    break;
                case "03":
                    time="15"+s.substring(2,8);
                    break;
                case "04":
                    time="16"+s.substring(2,8);
                    break;
                case "05":
                    time="17"+s.substring(2,8);
                    break;
                case "06":
                    time="18"+s.substring(2,8);
                    break;
                case "07":
                    time="19"+s.substring(2,8);
                    break;
                case "08":
                    time="20"+s.substring(2,8);
                    break;
                case "09":
                    time="21"+s.substring(2,8);
                    break;
                case "10":
                    time="22"+s.substring(2,8);
                    break;
                case "11":
                    time="23"+s.substring(2,8);
                    break;
                case "12":
                    time="12"+s.substring(2,8);
                    break;

            }
        }

        return time;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
