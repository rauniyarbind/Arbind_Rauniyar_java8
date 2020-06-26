import java.util.stream.*;
public class StringofA {
public static void printStrings(Stream<String> stream){
System.out.print("Strings after filtering are:");
stream.filter(s->s.startsWith("a")).filter(s->s.length()==3).forEach(s->{
System.out.print(s+" ");
});
}
public static void main(String []args){
Stream<String> streamOfStrings=Stream.of("ant","apple","exe","computer","any","aprove");
StringofA.printStrings(streamOfStrings);
}
}