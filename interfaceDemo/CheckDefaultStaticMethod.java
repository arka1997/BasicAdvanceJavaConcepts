package interfaceDemo;

public interface CheckDefaultStaticMethod {
abstract default void test() {
	//abstract is incomplete method
	//default is complete method
}
}
