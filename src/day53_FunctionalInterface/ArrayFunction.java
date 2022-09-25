package day53_FunctionalInterface;
@FunctionalInterface
public interface ArrayFunction<T,R> {
    R apply(T arr);
}

//2. Create a functional interface named ArrayFunction that contains the following abstract method:
//
//		R apply(T[] array);
//
//	Use the ArrayFunction interface to:
//
//		2.1 Create a function that can return the maximum number from an array of Integers
//
//		1.2 Create a function that can return the minimum number from an array of Integers
//
//		1.3 Create a function that can return the longest String from an array of String
//
//		1.4 Create a function that can return the shortest String from an array of String
