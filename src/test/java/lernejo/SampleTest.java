package lernejo;
import fr.lernejo.Sample;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
class SampleTest {

    @Test
    void add_test() {
        fr.lernejo.Sample s = new fr.lernejo.Sample();
        fr.lernejo.Sample.Operation operation = fr.lernejo.Sample.Operation.ADD;
        int a = 10;
        int b = 10;
        int result = s.op(operation, a, b);
        Assertions.assertThat(result)
            .isEqualTo(20);
    }


    void mult(){
        fr.lernejo.Sample s = new fr.lernejo.Sample();
        fr.lernejo.Sample.Operation operation = fr.lernejo.Sample.Operation.MULT;
        int a = 2;
        int b = 3;
        int result = s.op(operation, a, b);
        Assertions.assertThat(result)
            .isEqualTo(6);
    }

    @Test
    void factorielle() {
        fr.lernejo.Sample s = new fr.lernejo.Sample();
        //int n = 2;
        int result = s.fact(2);
        Assertions.assertThat(result).as("factorielle de 2")
            .isEqualTo(2);
    }

    @Test
    void arg_fact() {
        fr.lernejo.Sample s = new Sample();

        org.assertj.core.api.Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> s.fact(-1));
    }
}


