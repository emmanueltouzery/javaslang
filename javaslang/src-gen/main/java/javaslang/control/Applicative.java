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

import javaslang.Function2;
import javaslang.control.Option;
import java.util.function.BiFunction;

/**
 * Applicative helpers
 *
 * @author Daniel Dietrich
 * @since 2.1.0
 */
public final class Applicative {

    public static <T,U,V> Function<Option<T>,Option<U>,Option<V>> liftOption(Function<T, U, V> f) {
      return (a1) -> a1.flatMap(a1 -> f.apply());
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> BiFunction<Option<T>,Option<U>,Option<V>> liftOption(BiFunction<T, U, V> f) {
      return (a1, a2) -> a1.flatMap(a1 -> a2.flatMap(a2 -> f.apply()));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function3<Option<T>,Option<U>,Option<V>> liftOption(Function3<T, U, V> f) {
      return (a1, a2, a3) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> f.apply())));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function4<Option<T>,Option<U>,Option<V>> liftOption(Function4<T, U, V> f) {
      return (a1, a2, a3, a4) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> f.apply()))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function5<Option<T>,Option<U>,Option<V>> liftOption(Function5<T, U, V> f) {
      return (a1, a2, a3, a4, a5) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> f.apply())))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function6<Option<T>,Option<U>,Option<V>> liftOption(Function6<T, U, V> f) {
      return (a1, a2, a3, a4, a5, a6) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> f.apply()))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function7<Option<T>,Option<U>,Option<V>> liftOption(Function7<T, U, V> f) {
      return (a1, a2, a3, a4, a5, a6, a7) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> a7.flatMap(a7 -> f.apply())))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function8<Option<T>,Option<U>,Option<V>> liftOption(Function8<T, U, V> f) {
      return (a1, a2, a3, a4, a5, a6, a7, a8) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> a7.flatMap(a7 -> a8.flatMap(a8 -> f.apply()))))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }

    public static <T,U,V> Function<Try<T>,Try<U>,Try<V>> liftTry(Function<T, U, V> f) {
      return (a1) -> a1.flatMap(a1 -> f.apply());
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> BiFunction<Try<T>,Try<U>,Try<V>> liftTry(BiFunction<T, U, V> f) {
      return (a1, a2) -> a1.flatMap(a1 -> a2.flatMap(a2 -> f.apply()));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function3<Try<T>,Try<U>,Try<V>> liftTry(Function3<T, U, V> f) {
      return (a1, a2, a3) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> f.apply())));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function4<Try<T>,Try<U>,Try<V>> liftTry(Function4<T, U, V> f) {
      return (a1, a2, a3, a4) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> f.apply()))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function5<Try<T>,Try<U>,Try<V>> liftTry(Function5<T, U, V> f) {
      return (a1, a2, a3, a4, a5) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> f.apply())))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function6<Try<T>,Try<U>,Try<V>> liftTry(Function6<T, U, V> f) {
      return (a1, a2, a3, a4, a5, a6) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> f.apply()))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function7<Try<T>,Try<U>,Try<V>> liftTry(Function7<T, U, V> f) {
      return (a1, a2, a3, a4, a5, a6, a7) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> a7.flatMap(a7 -> f.apply())))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }  
    public static <T,U,V> Function8<Try<T>,Try<U>,Try<V>> liftTry(Function8<T, U, V> f) {
      return (a1, a2, a3, a4, a5, a6, a7, a8) -> a1.flatMap(a1 -> a2.flatMap(a2 -> a3.flatMap(a3 -> a4.flatMap(a4 -> a5.flatMap(a5 -> a6.flatMap(a6 -> a7.flatMap(a7 -> a8.flatMap(a8 -> f.apply()))))))));
      return (a, b) -> a.flatMap(a1 -> b.map(b1 -> f.apply(a1, b1)));
    }
}