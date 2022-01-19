package no.cheatsheet.basics;

public class Math {
    /*
    Method Summary
All MethodsStatic MethodsConcrete Methods Modifier and Type 	Method and Description

static double 	abs(double a)
Returns the absolute value of a double value.

static float 	abs(float a)
Returns the absolute value of a float value.

static int 	abs(int a)
Returns the absolute value of an int value.

static long 	abs(long a)
Returns the absolute value of a long value.

static double 	acos(double a)
Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi.

static int 	addExact(int x, int y)
Returns the sum of its arguments, throwing an exception if the result overflows an int.

static long 	addExact(long x, long y)
Returns the sum of its arguments, throwing an exception if the result overflows a long.

static double 	asin(double a)
Returns the arc sine of a value; the returned angle is in the range -pi/2 through pi/2.

static double 	atan(double a)
Returns the arc tangent of a value; the returned angle is in the range -pi/2 through pi/2.

static double 	atan2(double y, double x)
Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).

static double 	cbrt(double a)
Returns the cube root of a double value.

static double 	ceil(double a)
Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.

static double 	copySign(double magnitude, double sign)
Returns the first floating-point argument with the sign of the second floating-point argument.

static float 	copySign(float magnitude, float sign)
Returns the first floating-point argument with the sign of the second floating-point argument.

static double 	cos(double a)
Returns the trigonometric cosine of an angle.

static double 	cosh(double x)
Returns the hyperbolic cosine of a double value.

static int 	decrementExact(int a)
Returns the argument decremented by one, throwing an exception if the result overflows an int.

static long 	decrementExact(long a)
Returns the argument decremented by one, throwing an exception if the result overflows a long.

static double 	exp(double a)
Returns Euler's number e raised to the power of a double value.

static double 	expm1(double x)
Returns ex -1.

static double 	floor(double a)
Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.

static int 	floorDiv(int x, int y)
Returns the largest (closest to positive infinity) int value that is less than or equal to the algebraic quotient.

static long 	floorDiv(long x, long y)
Returns the largest (closest to positive infinity) long value that is less than or equal to the algebraic quotient.

static int 	floorMod(int x, int y)
Returns the floor modulus of the int arguments.

static long 	floorMod(long x, long y)
Returns the floor modulus of the long arguments.

static int 	getExponent(double d)
Returns the unbiased exponent used in the representation of a double.

static int 	getExponent(float f)
Returns the unbiased exponent used in the representation of a float.

static double 	hypot(double x, double y)
Returns sqrt(x2 +y2) without intermediate overflow or underflow.

static double 	IEEEremainder(double f1, double f2)
Computes the remainder operation on two arguments as prescribed by the IEEE 754 standard.

static int 	incrementExact(int a)
Returns the argument incremented by one, throwing an exception if the result overflows an int.

static long 	incrementExact(long a)
Returns the argument incremented by one, throwing an exception if the result overflows a long.

static double 	log(double a)
Returns the natural logarithm (base e) of a double value.

static double 	log10(double a)
Returns the base 10 logarithm of a double value.

static double 	log1p(double x)
Returns the natural logarithm of the sum of the argument and 1.

static double 	max(double a, double b)
Returns the greater of two double values.

static float 	max(float a, float b)
Returns the greater of two float values.

static int 	max(int a, int b)
Returns the greater of two int values.

static long 	max(long a, long b)
Returns the greater of two long values.

static double 	min(double a, double b)
Returns the smaller of two double values.

static float 	min(float a, float b)
Returns the smaller of two float values.

static int 	min(int a, int b)
Returns the smaller of two int values.

static long 	min(long a, long b)
Returns the smaller of two long values.

static int 	multiplyExact(int x, int y)
Returns the product of the arguments, throwing an exception if the result overflows an int.

static long 	multiplyExact(long x, long y)
Returns the product of the arguments, throwing an exception if the result overflows a long.

static int 	negateExact(int a)
Returns the negation of the argument, throwing an exception if the result overflows an int.

static long 	negateExact(long a)
Returns the negation of the argument, throwing an exception if the result overflows a long.

static double 	nextAfter(double start, double direction)
Returns the floating-point number adjacent to the first argument in the direction of the second argument.

static float 	nextAfter(float start, double direction)
Returns the floating-point number adjacent to the first argument in the direction of the second argument.

static double 	nextDown(double d)
Returns the floating-point value adjacent to d in the direction of negative infinity.

static float 	nextDown(float f)
Returns the floating-point value adjacent to f in the direction of negative infinity.

static double 	nextUp(double d)
Returns the floating-point value adjacent to d in the direction of positive infinity.

static float 	nextUp(float f)
Returns the floating-point value adjacent to f in the direction of positive infinity.

static double 	pow(double a, double b)
Returns the value of the first argument raised to the power of the second argument.

static double 	random()
Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.

static double 	rint(double a)
Returns the double value that is closest in value to the argument and is equal to a mathematical integer.

static long 	round(double a)
Returns the closest long to the argument, with ties rounding to positive infinity.

static int 	round(float a)
Returns the closest int to the argument, with ties rounding to positive infinity.

static double 	scalb(double d, int scaleFactor)
Returns d × 2scaleFactor rounded as if performed by a single correctly rounded floating-point multiply to a member of the double value set.

static float 	scalb(float f, int scaleFactor)
Returns f × 2scaleFactor rounded as if performed by a single correctly rounded floating-point multiply to a member of the float value set.

static double 	signum(double d)
Returns the signum function of the argument; zero if the argument is zero, 1.0 if the argument is greater than zero, -1.0 if the argument is less than zero.

static float 	signum(float f)
Returns the signum function of the argument; zero if the argument is zero, 1.0f if the argument is greater than zero, -1.0f if the argument is less than zero.

static double 	sin(double a)
Returns the trigonometric sine of an angle.

static double 	sinh(double x)
Returns the hyperbolic sine of a double value.

static double 	sqrt(double a)
Returns the correctly rounded positive square root of a double value.

static int 	subtractExact(int x, int y)
Returns the difference of the arguments, throwing an exception if the result overflows an int.

static long 	subtractExact(long x, long y)
Returns the difference of the arguments, throwing an exception if the result overflows a long.

static double 	tan(double a)
Returns the trigonometric tangent of an angle.

static double 	tanh(double x)
Returns the hyperbolic tangent of a double value.

static double 	toDegrees(double angrad)
Converts an angle measured in radians to an approximately equivalent angle measured in degrees.

static int 	toIntExact(long value)
Returns the value of the long argument; throwing an exception if the value overflows an int.

static double 	toRadians(double angdeg)
Converts an angle measured in degrees to an approximately equivalent angle measured in radians.

static double 	ulp(double d)
Returns the size of an ulp of the argument.

static float 	ulp(float f)
Returns the size of an ulp of the argument.


    Methods inherited from class java.lang.Object
    clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait

     */
}
