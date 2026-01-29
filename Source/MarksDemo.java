class NegativeMarksException extends RuntimeException {
public NegativeMarksException(String msg) {
super(msg);
}
}
public class MarksDemo {
public static void main(String[] args) {
int marks = -10;
if(marks < 0) {
throw new NegativeMarksException("Marks cannot be negative.")
}
}
}
