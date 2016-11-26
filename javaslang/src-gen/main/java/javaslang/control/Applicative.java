/*     / \____  _    _  ____   ______  / \ ____  __    _______
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  //  /\__\   JΛVΛSLΛNG
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/ \ /__\ \   Copyright 2014-2016 Javaslang, http://javaslang.io
 * /___/\_/  \_/\____/\_/  \_/\__\/__/\__\_/  \_//  \__/\_____/   Licensed under the Apache License, Version 2.0
 */
package javaslang.control;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import java.util.function.BiFunction;
import java.util.function.Function;

import javaslang.Function1;
import javaslang.Function2;
import javaslang.Function3;
import javaslang.Function4;
import javaslang.Function5;
import javaslang.Function6;
import javaslang.Function7;
import javaslang.Function8;
import javaslang.control.Option;
import javaslang.control.Try;
import java.util.function.BiFunction;

/**
 * Applicative helpers
 *
 * @author Daniel Dietrich
 * @since 2.1.0
 */
public final class Applicative {

    public static <T1, T2> Function<Option<T1>, Option<T2>> liftOption(Function<T1, T2> f) {
      return (a1) -> a1.flatMap(a1 -> f.apply());
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3> BiFunction<Option<T1>, Option<T2>, Option<T3>> liftOption(BiFunction<T1, T2, T3> f) {
      return (a1, a2) -> a1.flatMap(a1 -> a2.flatMap(a2 -> f.apply()));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4> Function3<Option<T1>, Option<T2>, Option<T3>, Option<T4>> liftOption(Function3<T1, T2, T3, T4> f) {
      return (a1, a2, a3) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> f.apply())));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5> Function4<Option<T1>, Option<T2>, Option<T3>, Option<T4>, Option<T5>> liftOption(Function4<T1, T2, T3, T4, T5> f) {
      return (a1, a2, a3, a4) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> f.apply()))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5, T6> Function5<Option<T1>, Option<T2>, Option<T3>, Option<T4>, Option<T5>, Option<T6>> liftOption(Function5<T1, T2, T3, T4, T5, T6> f) {
      return (a1, a2, a3, a4, a5) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> f.apply())))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5, T6, T7> Function6<Option<T1>, Option<T2>, Option<T3>, Option<T4>, Option<T5>, Option<T6>, Option<T7>> liftOption(Function6<T1, T2, T3, T4, T5, T6, T7> f) {
      return (a1, a2, a3, a4, a5, a6) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> f.apply()))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Function7<Option<T1>, Option<T2>, Option<T3>, Option<T4>, Option<T5>, Option<T6>, Option<T7>, Option<T8>> liftOption(Function7<T1, T2, T3, T4, T5, T6, T7, T8> f) {
      return (a1, a2, a3, a4, a5, a6, a7) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> a7.flatMap(a7 -> f.apply())))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Function8<Option<T1>, Option<T2>, Option<T3>, Option<T4>, Option<T5>, Option<T6>, Option<T7>, Option<T8>, Option<T9>> liftOption(Function8<T1, T2, T3, T4, T5, T6, T7, T8, T9> f) {
      return (a1, a2, a3, a4, a5, a6, a7, a8) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> a7.flatMap(a7 -> a8.flatMap(a8 -> f.apply()))))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }

    public static <T1, T2> Function<Try<T1>, Try<T2>> liftTry(Function<T1, T2> f) {
      return (a1) -> a1.flatMap(a1 -> f.apply());
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3> BiFunction<Try<T1>, Try<T2>, Try<T3>> liftTry(BiFunction<T1, T2, T3> f) {
      return (a1, a2) -> a1.flatMap(a1 -> a2.flatMap(a2 -> f.apply()));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4> Function3<Try<T1>, Try<T2>, Try<T3>, Try<T4>> liftTry(Function3<T1, T2, T3, T4> f) {
      return (a1, a2, a3) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> f.apply())));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5> Function4<Try<T1>, Try<T2>, Try<T3>, Try<T4>, Try<T5>> liftTry(Function4<T1, T2, T3, T4, T5> f) {
      return (a1, a2, a3, a4) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> f.apply()))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5, T6> Function5<Try<T1>, Try<T2>, Try<T3>, Try<T4>, Try<T5>, Try<T6>> liftTry(Function5<T1, T2, T3, T4, T5, T6> f) {
      return (a1, a2, a3, a4, a5) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> f.apply())))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5, T6, T7> Function6<Try<T1>, Try<T2>, Try<T3>, Try<T4>, Try<T5>, Try<T6>, Try<T7>> liftTry(Function6<T1, T2, T3, T4, T5, T6, T7> f) {
      return (a1, a2, a3, a4, a5, a6) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> f.apply()))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Function7<Try<T1>, Try<T2>, Try<T3>, Try<T4>, Try<T5>, Try<T6>, Try<T7>, Try<T8>> liftTry(Function7<T1, T2, T3, T4, T5, T6, T7, T8> f) {
      return (a1, a2, a3, a4, a5, a6, a7) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> a7.flatMap(a7 -> f.apply())))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Function8<Try<T1>, Try<T2>, Try<T3>, Try<T4>, Try<T5>, Try<T6>, Try<T7>, Try<T8>, Try<T9>> liftTry(Function8<T1, T2, T3, T4, T5, T6, T7, T8, T9> f) {
      return (a1, a2, a3, a4, a5, a6, a7, a8) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> a7.flatMap(a7 -> a8.flatMap(a8 -> f.apply()))))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }
}