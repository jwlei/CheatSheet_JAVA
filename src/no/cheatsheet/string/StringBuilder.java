package no.cheatsheet.string;

public class StringBuilder {
    java.lang.StringBuilder str = new java.lang.StringBuilder();

//Methods in Java StringBuilder:
//
//Method:                                            Description:
//StringBuilder append(X x)                                             This method appends the string representation of the X type argument to the sequence.
//StringBuilder appendCodePoint(int codePoint)                          This method appends the string representation of the codePoint argument to this sequence.
//int capacity()                                                        This method returns the current capacity.
//char charAt(int index)                                                This method returns the char value in this sequence at the specified index.
//IntStream chars()                                                     This method returns a stream of int zero-extending the char values from this sequence.
//int codePointAt(int index)                                            This method returns the character (Unicode code point) at the specified index.
//int codePointBefore(int index)                                        This method returns the character (Unicode code point) before the specified index.
//int codePointCount(int beginIndex, int endIndex)                      This method returns the number of Unicode code points in the specified text range of this sequence.
//IntStream codePoints()                                                This method returns a stream of code point values from this sequence.
//StringBuilder delete(int start, int end)                              This method removes the characters in a substring of this sequence.
//StringBuilder deleteCharAt(int index)                                 This method removes the char at the specified position in this sequence.
//void ensureCapacity(int minimumCapacity)                              This method ensures that the capacity is at least equal to the specified minimum.
//void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)     This method characters are copied from this sequence into the destination character array dst.
//int indexOf()                                                         This method returns the index within this string of the first occurrence of the specified substring.
//StringBuilder insert(int offset, boolean b)                           This method inserts the string representation of the booalternatelean argument into this sequence.
//StringBuilder insert()                                                This method inserts the string representation of the char argument into this sequence.
//int lastIndexOf()                                                     This method returns the index within this string of the last occurrence of the specified substring.
//int length()                                                          This method returns the length (character count).
//int offsetByCodePoints(int index, int codePointOffset)                This method returns the index within this sequence that is offset from the given index by codePointOffset code points.
//StringBuilder replace(int start, int end, String str)                 This method replaces the characters in a substring of this sequence with characters in the specified String.
//StringBuilder reverse()                                               This method causes this character sequence to be replaced by the reverse of the sequence.
//void setCharAt(int index, char ch)                                    In this method, the character at the specified index is set to ch.
//void setLength(int newLength)                                         This method sets the length of the character sequence.
//CharSequence subSequence(int start, int end)                          This method returns a new character sequence that is a subsequence of this sequence.
//String substring()                                                    This method returns a new String that contains a subsequence of characters currently contained in this character sequence.
//String toString()                                                     This method returns a string representing the data in this sequence.
//void trimToSize()                                                     This method attempts to reduce storage used for the character sequence.
}
