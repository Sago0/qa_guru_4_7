import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {
    @Test
    @Tag("positive")
    void succesTest() {
        assertEquals(true, true);
    }

    @Test
    void negativeTest() {
        assertEquals(true, false);
    }

    @Test
    @Tag("positive")
    void successWithHamcrestTest() {
        assertThat(true, is(true));
    }

    @Test
    void negativeWithHamcrestTest() {
        assertThat(true, is(false));
    }

    @Test
    @Tag("positive")
    @DisplayName("Some positive test")
    void successWithHamcrestAndStepsTest() {
        step("Assert that true is true", () ->
                assertThat(true, is(true)));
    }

    @Test
    @DisplayName("Some negative test")
    void negativeWithHamcrestAndStepsTest() {
        step("Assert that true is false", () ->
                assertThat(true, is(false)));
    }
}
