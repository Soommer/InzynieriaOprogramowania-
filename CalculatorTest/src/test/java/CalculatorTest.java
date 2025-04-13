import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void testSumyDwochLiczbDodatnich() {
        int wynik = Calculator.add_numbers(3, 10);
        assertThat(wynik).isEqualTo(13);
    }

    @Test
    public void testSumyLiczbyDodatniejIUjemnej() {
        int wynik = Calculator.add_numbers(7, -2);
        assertThat(wynik).isEqualTo(5);
    }

    @Test
    public void testSumyDwochLiczbUjemnych() {
        int wynik = Calculator.add_numbers(-4, -6);
        assertThat(wynik).isEqualTo(-10);
    }

    @Test
    public void testSumyLiczbyIZera() {
        int wynik1 = Calculator.add_numbers(0, 8);
        int wynik2 = Calculator.add_numbers(5, 0);
        assertThat(wynik1).isEqualTo(8);
        assertThat(wynik2).isEqualTo(5);
    }

    @Test
    public void testLiczbParzystych() {
        assertThat(Calculator.is_even(4)).isTrue();
        assertThat(Calculator.is_even(10)).isTrue();
        assertThat(Calculator.is_even(0)).isTrue();
    }

    @Test
    public void testLiczbNieparzystych() {
        assertThat(Calculator.is_even(3)).isFalse();
        assertThat(Calculator.is_even(7)).isFalse();
        assertThat(Calculator.is_even(-1)).isFalse();
    }

    @Test
    public void testZera() {
        assertThat(Calculator.is_even(0)).isTrue();
    }

    @Test
    public void testDuzejLiczby() {
        assertThat(Calculator.is_even(1_000_000)).isTrue();
        assertThat(Calculator.is_even(999_999)).isFalse();
    }

    @Test
    public void testTemperaturStandardowych() {
        assertThat(Calculator.celsius_to_fahrenheit(0)).isEqualTo(32.0);
        assertThat(Calculator.celsius_to_fahrenheit(100)).isEqualTo(212.0);
    }

    @Test
    public void testWartosciUjemnej() {
        assertThat(Calculator.celsius_to_fahrenheit(-10)).isEqualTo(14.0);
    }

    @Test
    public void testDuzychWartosci() {
        assertThat(Calculator.celsius_to_fahrenheit(1000)).isEqualTo(1832.0);
    }

    @Test
    public void testZeraCelsius() {
        assertThat(Calculator.celsius_to_fahrenheit(0)).isEqualTo(32.0);
    }

    @Test
    public void testMaleLiczby() {
        assertThat(Calculator.factorial(0)).isEqualTo(1);
        assertThat(Calculator.factorial(1)).isEqualTo(1);
        assertThat(Calculator.factorial(2)).isEqualTo(2);
    }

    @Test
    public void testWiekszychLiczb() {
        assertThat(Calculator.factorial(5)).isEqualTo(120);
        assertThat(Calculator.factorial(10)).isEqualTo(3628800);
    }


    @Test
    public void testWydajnosciDlaDuzychLiczb() {
        long result = Calculator.factorial(20); // 20! = 2_432_902_008_176_640_000
        assertThat(result).isEqualTo(2432902008176640000L);
    }

    @Test
    public void testLiczbyPierwsze() {
        assertThat(Calculator.is_prime(2)).isTrue();
        assertThat(Calculator.is_prime(3)).isTrue();
        assertThat(Calculator.is_prime(5)).isTrue();
        assertThat(Calculator.is_prime(7)).isTrue();
    }

    @Test
    public void testLiczbyNiepierwsze() {
        assertThat(Calculator.is_prime(4)).isFalse();
        assertThat(Calculator.is_prime(6)).isFalse();
        assertThat(Calculator.is_prime(8)).isFalse();
        assertThat(Calculator.is_prime(9)).isFalse();
    }

    @Test
    public void testLiczbMniejszychNiz2() {
        assertThat(Calculator.is_prime(1)).isFalse();
        assertThat(Calculator.is_prime(0)).isFalse();
        assertThat(Calculator.is_prime(-5)).isFalse();
    }

    @Test
    public void testDuzejLiczbyPierwszej() {
        // 104729 to 10000-ta liczba pierwsza
        assertThat(Calculator.is_prime(104729)).isTrue();
    }
}

