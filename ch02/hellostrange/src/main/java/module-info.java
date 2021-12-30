module helloStrange {
	requires javafx.graphics;
	requires javafx.controls;
	requires strange;
	exports org.redfx.javaqc.ch02.hellostrange to javafx.graphics;
}