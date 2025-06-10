package lesson_37;

import homeworks.hw_26.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    // @BeforeEach - Метод, который выполняется перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method setUp");
    }
    /*
    @BeforeEach - Метод, который выполняется перед КАЖДЫМ тестовым методом
    @BeforeAll - метод выполняется ОДИН раз перед выполнением первого тестового метода
    @AfterEach - выполняется после КАЖДОГО тестового метода
    @AfterAll - метод выполняется один раз после выполнения ВСЕХ тестовых методов
    @Disabled - указывает, что тест отключен и выполняться не будет
     */

    @AfterAll
    static void finallyMethod() {
        System.out.println("Method afterAll");
    }



    // @Test Указываем фреймворку JUnit, что метод является тестовым
    // Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition() {
        System.out.println("Test Addition");

        // Протестировать, правильно ли работает метод add класса Calculator
        int result = Calculator.add(2, 3);

        // Реальный / фактический результат работы методы сохранен в result
        // Ожидаемое значение - 5

        // Методы проверки утверждений (Assertions)
        Assertions.assertEquals(5, result); // Проверяет равны ли два значения. Тест будет пройден, если 2 значения равны
        Assertions.assertNotEquals(0, result); // Тест будет пройден, если фактический результат НЕ совпадает с "неожидаемым" результатом
        Assertions.assertTrue(result >= 4); // Проверяет, что условие верно (условие возвращает true)
        assertEquals(10, 5 + 5); // статический импорт позволяет использовать статические методы без обращения к классу.
        assertFalse(result > 10); // проверяет, что условие ложно (условие возвращает false)
        assertNull(null); // Проверяет, что объект null. Тест будет пройден, если объект равен null
        assertNotNull("String"); // Проверяет, что объект не равен null
    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Empty test");
        // Если в методе нет ложного утверждения - он считается пройденным
        // В том числе пустой (вообще без утверждений) считается пройденным

    }

    // Параметризованные тесты
    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("Current value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testInts(int value) {
        System.out.println("Int: " + value);
        assertTrue(value != 0);
    }

    // @CsvSource
    // CsvFileSource
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCsvSource(String fruit, int rank) {
        System.out.println("Fruit: " + fruit + " Rank: " + rank);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    // Источник данных - метод

    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceInt(int value) {
        System.out.println("current value: " + value);
        assertNotEquals(100, value);
    }

    // Источник данных - статический метод
    static Stream<Integer> testDataFruits() {
        return Stream.of(1, 2, -10, 0, 16);
    }


    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, Integer expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);

    }

    static Stream<Arguments> testDataArguments(){
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }







}