package chapter2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // SE7以前
        legacy();

        // SE8以降
        modern();
    }

    /**
     * 現在の100日後の日付を西暦2011年09月24日という形式で表示する
     */
    public static void legacy() {

        // 現在日時を取得
        Date now = new Date();

        // Calendarクラスに現在日時をセット
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        // 100日後の日付を取得
        int day = calendar.get(Calendar.DATE) + 100;
        calendar.set(Calendar.DATE, day);
        Date future = calendar.getTime();

        // 表示
        SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(sdf.format(future));
    }

    /**
     * SE8以降のTime APIを用いて表示
     */
    public static void modern() {

        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(100);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(future.format(dtf));

    }

}
