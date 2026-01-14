package Java8;

import java.util.function.Function;

/*
 * https://medium.com/@AlexanderObregon/how-javas-lambda-expressions-work-under-the-hood-8f783ae37928
 * Inspecting Lambda Behavior at Runtime
To see how a lambda behaves at runtime, you can use the -XX:+PrintCompilation flag 
when running your program:

java -XX:+PrintCompilation LambdaExample
This will show when the lambda is compiled and optimized during execution. 
The JVM may inline the lambda into the calling method, eliminating any method call overhead.
 */

public class LambdaExample {
	public static void main(String[] args) {
		Function<Integer, Integer> square = x -> x * x;
		System.out.println(square.apply(5));
	}
}
