package com.xyzcorp.instructor.caesarshift;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CaesarShiftTest {

    //ZOMBIES
    //--------
    //Zero
    //One
    //Many
    //Boundary
    //Interface
    //Exceptions
    //Simplicity/Refactoring

    // Two inputs: originalString, shift
    // One output: resultString
    // 3. CaesarShift.encode(shift, original) -> result;
    //    CaesarShift.decode(shift, result) -> result;
    //    maybe? BiFunction<Integer, String, String>  = (i, s) -> (s) -> encode(i,s)

    private static Stream<Arguments> shiftOriginResultProvider() {
        return Stream.of(
            Arguments.of(0, "", ""),
            Arguments.of(0, "a", "a")
        );
    }

    @ParameterizedTest(name= "{index}: shift={0}, original={1}, destination={2}")
    @MethodSource("shiftOriginResultProvider")
    void testCaesarShift(int shift, String original, String destination) {
        String result = CaesarShift.encode(shift, original);
        assertThat(result).isEqualTo(destination);
    }
}
