/*     / \____  _    _  ____   ______  / \ ____  __    _______
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  //  /\__\   JΛVΛSLΛNG
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/ \ /__\ \   Copyright 2014-2016 Javaslang, http://javaslang.io
 * /___/\_/  \_/\____/\_/  \_/\__\/__/\__\_/  \_//  \__/\_____/   Licensed under the Apache License, Version 2.0
 */
package javaslang.control;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ApplicativeTest {

    @Test
    public void shouldLiftOption1() {
      assertThat(Applicative.liftOption((Integer i1) -> i1).apply(Option.of(1))).isEqualTo(Option.of(1));
    }

    @Test
    public void shouldLiftOption2() {
      assertThat(Applicative.liftOption((Integer i1, Integer i2) -> i1 + i2).apply(Option.of(1), Option.of(2))).isEqualTo(Option.of(3));
    }

    @Test
    public void shouldLiftOption3() {
      assertThat(Applicative.liftOption((Integer i1, Integer i2, Integer i3) -> i1 + i2 + i3).apply(Option.of(1), Option.of(2), Option.of(3))).isEqualTo(Option.of(6));
    }

    @Test
    public void shouldLiftOption4() {
      assertThat(Applicative.liftOption((Integer i1, Integer i2, Integer i3, Integer i4) -> i1 + i2 + i3 + i4).apply(Option.of(1), Option.of(2), Option.of(3), Option.of(4))).isEqualTo(Option.of(10));
    }

    @Test
    public void shouldLiftOption5() {
      assertThat(Applicative.liftOption((Integer i1, Integer i2, Integer i3, Integer i4, Integer i5) -> i1 + i2 + i3 + i4 + i5).apply(Option.of(1), Option.of(2), Option.of(3), Option.of(4), Option.of(5))).isEqualTo(Option.of(15));
    }

    @Test
    public void shouldLiftOption6() {
      assertThat(Applicative.liftOption((Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, Integer i6) -> i1 + i2 + i3 + i4 + i5 + i6).apply(Option.of(1), Option.of(2), Option.of(3), Option.of(4), Option.of(5), Option.of(6))).isEqualTo(Option.of(21));
    }

    @Test
    public void shouldLiftOption7() {
      assertThat(Applicative.liftOption((Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, Integer i6, Integer i7) -> i1 + i2 + i3 + i4 + i5 + i6 + i7).apply(Option.of(1), Option.of(2), Option.of(3), Option.of(4), Option.of(5), Option.of(6), Option.of(7))).isEqualTo(Option.of(28));
    }

    @Test
    public void shouldLiftOption8() {
      assertThat(Applicative.liftOption((Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, Integer i6, Integer i7, Integer i8) -> i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8).apply(Option.of(1), Option.of(2), Option.of(3), Option.of(4), Option.of(5), Option.of(6), Option.of(7), Option.of(8))).isEqualTo(Option.of(36));
    }

}