public class StringBuilderNotes {
    public static void main(String[] args) {

        // 1. Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 2. append() → add at end
        sb.append(" World");
        System.out.println(sb);   // Hello World

        // 3. insert() → add at specific index
        sb.insert(5, ",");
        System.out.println(sb);   // Hello, World

        // 4. replace() → replace part of string
        sb.replace(6, 11, "Java");
        System.out.println(sb);   // Hello, Java

        // 5. delete() → delete part
        sb.delete(5, 6);
        System.out.println(sb);   // Hello Java

        // 6. deleteCharAt() → delete single char
        sb.deleteCharAt(5);
        System.out.println(sb);   // HelloJava

        // 7. reverse() → reverse string
        sb.reverse();
        System.out.println(sb);   // avaJolleH

        // 8. length() → length of string
        System.out.println(sb.length()); // 9

        // 9. charAt() → character at index
        System.out.println(sb.charAt(0)); // a

        // 10. setCharAt() → change character
        sb.setCharAt(0, 'A');
        System.out.println(sb);   // AvaJolleH

        // 11. substring() → get part (returns String)
        String sub = sb.substring(0, 4);
        System.out.println(sub);  // AvaJ

        // 12. toString() → convert to String
        String normalString = sb.toString();
        System.out.println(normalString);
    }
}
