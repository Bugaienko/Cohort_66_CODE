package lesson_50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.06.2025
 */

public class JavaTime {

    /*
    java.util.Date
    java.util.Calendar
    java.text.SimpleDateFormat

    Joda-Time -> Java Time API (в Java 8)
     */


    public static void main(String[] args) {

        // LocalDate - представляет дату (год, месяц, день) без времени и часового пояса

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("date: " + date);

        // прибавить 1 день к дате
        // Объекты в библиотеке java time практически все неизменяемы
        LocalDate tomorrow =  date.plusDays(1);

        System.out.println("date: " + date);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeeks: " + date.plusWeeks(4)); // плюс 4 недели к дате
        System.out.println("yesterday: " + date.minusDays(1)); // минус 1 день

        LocalDate date1 = LocalDate.of(2002, 2, 15); // Установить дату (год, месяц, число)
        System.out.println("date1: " + date1);

        // Можно использовать Enum с названием месяца
        date1 = LocalDate.of(2003, Month.FEBRUARY, 15);
        System.out.println("date1: " + date1);

        System.out.println("год: " + date1.getYear() + "; месяц-enum: " + date1.getMonth() + "; месяц-число: " + date1.getMonthValue());
        System.out.println("число: " + date1.getDayOfMonth() + "; день недели: " + date1.getDayOfWeek() + "; день года: " + date1.getDayOfYear());
        System.out.println("дней в месяце: " + date1.lengthOfMonth() + "; дней в году: " + date1.lengthOfYear() + "; isLeap: " + date1.isLeapYear());

        String dateString = "2000-01-25"; // Формат строки год-месяц-число
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println("date2: " + date2 + "; "  + date2.getYear());

        System.out.println("\n =================== LocalTime ================= ");
        // LocalTime - представляет время (часы, минуты, секунды, наносекунды)

        // 1 / 1 000 000 000= 10^-9

        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("time: " + time);

        time = LocalTime.of(21, 33);
        time = LocalTime.of(21, 33, 44);
        time = LocalTime.of(21, 33, 44, 5642342);

        System.out.println("time: " + time);
        // возвращает новый объект LocalTime + 1 час к времени "старого" объекта
        System.out.println("time.plusHours(1): " + time.plusHours(1));
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());

        String timeStr = "12:33:45";
        LocalTime time1 = LocalTime.parse(timeStr);
        System.out.println("time1: " + time1 + " | " + time1.getMinute());
        // Ожидает строку в формате ISO-8601 ("2001-01-15T08:15:45+01:00")

        System.out.println("\n =================== LocalDateTime ============");
        // LocalDateTime - представляет дату и время без учета часового пояса

        LocalDateTime localDateTime = LocalDateTime.now(); // получить текущие дата-время
        System.out.println("localDateTime: " + localDateTime);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 33, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);
        dateTime = LocalDateTime.of(2025, 12, 31,23, 59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());

        // Доступны все методы классов LocalDate + LocalTime
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(10): " + dateTime.minusYears(10));

        String strDT = "2001-01-15T08:15:45";
        LocalDateTime parseDT = LocalDateTime.parse(strDT);
        System.out.println("parseDT: " + parseDT + " | " +  parseDT.getDayOfYear());

        System.out.println("\n================ ZonedDateTime ==============");
        // ZonedDateTime - представляет дату и время с часовым поясом

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println(zonedDateTime.getZone());

        System.out.println("\n =============== isAfter, isBefore, until, equals ======");

        // sAfter, isBefore, until, equals есть у всех объектов, представляющих дату и/или время

        LocalDate date3 = LocalDate.of(2020, 10, 15);
        LocalDate date4 = LocalDate.of(2020, 6, 10);

        // boolean isAfter - проверяет, что текущий объект после (позже) указанного объекта
        System.out.println("date3.isAfter(date4): " + date3.isAfter(date4));

        // boolean isBefore - проверяет, что текущий объект до (раньше) указанного объекта
        System.out.println("date3.isBefore(date4): " + date3.isBefore(date4));

        // equals - проверяет даты/время на равенство
        System.out.println("date3.equals(date4): " + date3.equals(date4));
        System.out.println("date3.isEqual(date4): " + date3.isEqual(date4));

        // until - метод измеряет разницу между текущим и указанным объектом даты/времени -> long
        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("between: " + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println(dateTime1.until(dateTime2, ChronoUnit.SECONDS));

        // Два универсальных метода
        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.HOURS);
        System.out.println(dateTime3);
        System.out.println(dateTime3.plus(5, ChronoUnit.YEARS));

        System.out.println("\n ========== Duration, Period, Instant ===== ");

        // Классы Duration, Period оба представляют собой отрезки времени
        // Но используются для разных типов временных сущностей
        // Duration - менее продолжительные: часы, минутах, секундах
        // Period - для долгосрочных отрезков: дни, месяцы, годы

        // Instant - представляет собой точку во времени на временной шкале в Григорианском календаре
        // сколько прошло миллисекунд с 1 января 1970 года UTC
        Instant instant = Instant.now();
        System.out.println("instant: " + instant.getEpochSecond());


        System.out.println("\n ======= DateTimeFormatter =============");

        // DateTimeFormatter форматирование и парсинга даты и времени
        // Позволяет создавать форматированные строки из даты-времени.
        // И также обратно парсить строки (разных форматов) в объекты даты/времени

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        String formatedString = now.format(formatter);
        System.out.println("formatedString: " + formatedString);

        /*
        y - год
        M - месяц
        d - день
        H - час в формате 0 до 23
        h - час в формате 0 до 12, a - для отображения AM/PM
        m - минута
        s - секунда
        остальные символы в шаблоне отображаются "как есть"

        Количество повторений символа определяет формат отображения unit-а
        yy - двузначный год, например 25 для 2025
        yyyy - 4-значный год
        M - месяц без ведущего нуля -> "6" или "12"
        MM - месяц в двухзначном формате -> "06" или "12"
        d - день без ведущего нуля: "3" или "27"
        dd - двухзначный день: "03" или "27"
        H - часы без нуля
        HH - часы с ведущим нулем
        h
        HH
         */

        System.out.println("=====================\n");

        String dateForParse = "2023-10-26 19:05";
        System.out.println("dateForParse: " + dateForParse);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parseLDT = LocalDateTime.parse(dateForParse, formatter1);

        System.out.println("parseLDT: " + parseLDT);
        System.out.println(parseLDT.getDayOfWeek() + " | " + parseLDT.getHour());

        /*
        "15-12-2022 20-46"
        Запарсить строку в формат LocalDateTime
        Распечатать отдельно месяц, число, час из объекта LDT

        13-01-2023 00-47
        Какому дню недели соответствует вторая дата
        Сколько дней между этими двумя датами
         */

        System.out.println("================\n");

        String dateStr1 =  "15-12-2022 20-46";
        String dateStr2 =  "13-01-2023 00-47";

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");

        LocalDateTime ldt1 = LocalDateTime.parse(dateStr1, formatter2);
        LocalDateTime ldt2 = LocalDateTime.parse(dateStr2, formatter2);

        System.out.println(ldt1.getMonth() + " | " + ldt1.getDayOfMonth() + " | " + ldt1.getHour());
        System.out.println(ldt2.getDayOfWeek());
        System.out.println(ldt2.getDayOfWeek().getValue());
        System.out.println("разница в днях: " + ldt1.until(ldt2, ChronoUnit.DAYS));
        System.out.println("разница в днях: " + ldt2.until(ldt1, ChronoUnit.DAYS));






    }
}
