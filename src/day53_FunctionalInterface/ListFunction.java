package day53_FunctionalInterface;

import java.util.List;

@FunctionalInterface
public interface ListFunction<T,R> {
    R apply(T t);
}
