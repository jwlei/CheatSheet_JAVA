package no.cheatsheet.basics;

public class Operands {
//    Arithmetic Operators    ---------------------------------------------------------------------------------------------------------------------------------------------------------------
//        + (Addition) 	    Adds values on either side of the operator. 	                        A + B will give 30
//        - (Subtraction) 	Subtracts right-hand operand from left-hand operand. 	                A - B will give -10
//        * (Multiplication) 	Multiplies values on either side of the operator. 	                    A * B will give 200
//        / (Division) 	    Divides left-hand operand by right-hand operand. 	                    B / A will give 2
//        % (Modulus) 	    Divides left-hand operand by right-hand operand and returns remainder. 	B % A will give 0
//        ++ (Increment) 	    Increases the value of operand by 1. 	                                B++ gives 21
//        -- (Decrement) 	    Decreases the value of operand by 1. 	                                B-- gives 19


//    Relational Operators    --------------------------------------------------------------------------------------------------------------------------------------------------------------
//        == (equal to) 	                Checks if the values of two operands are equal or not, if yes then condition becomes true. 	                                    (A == B) is not true.
//        != (not equal to) 	            Checks if the values of two operands are equal or not, if values are not equal then condition becomes true. 	                (A != B) is true.
//        > (greater than) 	            Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true. 	        (A > B) is not true.
//        < (less than) 	                Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true. 	            (A < B) is true.
//        >= (greater than or equal to) 	Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true. (A >= B) is not true.
//        <= (less than or equal to) 	    Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true. 	(A <= B) is true.


//    Bitwise Operators       ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//        Java defines several bitwise operators, which can be applied to the integer types, long, int, short, char, and byte.
//        Bitwise operator works on bits and performs bit-by-bit operation. Assume if a = 60 and b = 13; now in binary format they will be as follows −
//
//        & (bitwise and) 	            Binary AND Operator copies a bit to the result if it exists in both operands. 	                                                                                         (A & B) will give 12 which is 0000 1100
//        | (bitwise or) 	                Binary OR Operator copies a bit if it exists in either operand. 	                                                                                                     (A | B) will give 61 which is 0011 1101
//        ^ (bitwise XOR) 	            Binary XOR Operator copies the bit if it is set in one operand but not both. 	                                                                                         (A ^ B) will give 49 which is 0011 0001
//        ~ (bitwise compliment) 	        Binary Ones Complement Operator is unary and has the effect of 'flipping' bits. 	                                                                                     (~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.
//        << (left shift) 	            Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand. 	                                             A << 2 will give 240 which is 1111 0000
//        >> (right shift) 	            Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand. 	                                             A >> 2 will give 15 which is 1111
//        >>> (zero fill right shift) 	Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros. A >>>2 will give 15 which is 0000 1111

//    Logical Operators       -------------------------------------------------------------------------------------------------------------------------------------------------------
//        For boolean variables.
//        && (logical and) 	            Called Logical AND operator. If both the operands are non-zero, then the condition becomes true. 	                                                (A && B) is false
//        || (logical or) 	            Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true. 	                                            (A || B) is true
//        ! (logical not) 	            Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false. 	!(A && B) is true

//    Assignment Operators    ---------------------------------------------------------------------------------------------------------------------------------------------------------
//        = 	Simple assignment operator. Assigns values from right side operands to left side operand. 	                                C = A + B will assign value of A + B into C
//        += 	Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand. 	            C += A is equivalent to C = C + A
//        -= 	Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand. 	C -= A is equivalent to C = C – A
//        *= 	Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand. 	C *= A is equivalent to C = C * A
//        /= 	Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand. 	    C /= A is equivalent to C = C / A
//        %= 	Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand. 	            C %= A is equivalent to C = C % A
//        <<= Left shift AND assignment operator. 	                                                                                    C <<= 2 is same as C = C << 2
//        >>= Right shift AND assignment operator. 	                                                                                    C >>= 2 is same as C = C >> 2
//        &= 	Bitwise AND assignment operator. 	                                                                                        C &= 2 is same as C = C & 2
//        ^= 	bitwise exclusive OR and assignment operator. 	                                                                            C ^= 2 is same as C = C ^ 2
//        |= 	bitwise inclusive OR and assignment operator. 	                                                                            C |= 2 is same as C = C | 2

//    Misc ~~
//    Conditional Operator ( ? : ) ------------------------------------------------------------------------------------------------------------------------------------
//        Conditional operator is also known as the ternary operator. This operator consists of three operands and is used to evaluate Boolean expressions.
//        The goal of the operator is to decide, which value should be assigned to the variable.
//
//        variable x = (expression) ? value if true : value if false

//     instanceof Operator         -------------------------------------------------------------------------------------------------------------------------------
//        ( Object reference variable ) instanceof  (class/interface type)

//     Precedence:
//        Postfix 	    expression++ expression-- 	                                Left to right
//        Unary 	        ++expression –-expression +expression –expression ~ ! 	Right to left
//        Multiplicative 	* / % 	                                                Left to right
//        Additive 	    + - 	                                                    Left to right
//        Shift 	        << >> >>> 	                                            Left to right
//        Relational 	    < > <= >= instanceof 	                                Left to right
//        Equality 	    == != 	                                                    Left to right
//        Bitwise AND 	& 	                                                        Left to right
//        Bitwise XOR 	^ 	                                                        Left to right
//        Bitwise OR 	    | 	                                                    Left to right
//        Logical AND 	&&  	                                                    Left to right
//        Logical OR 	    || 	                                                    Left to right
//        Conditional 	?: 	                                                        Right to left
//        Assignment 	    = += -= *= /= %= ^= |= <<= >>= >>>= 	                Right to left

}
