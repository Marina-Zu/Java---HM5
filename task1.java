/**Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

package HW5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class task1 {
    static Map <String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        PhoneBook();
        SearchName();
        AddMan();

    }
    
    public static void PhoneBook(){
        phoneBook.put("Иванов", List.of("89115241", "89521554"));
        phoneBook.put("Петров", List.of("89521456", "895213545"));
        phoneBook.put("Cидоров", List.of("89521453"));
        phoneBook.put("Cергеев", List.of("8952114523"));
        for (var el: phoneBook.entrySet()){
           System.out.println(el.getKey() + " " + el.getValue());
         }
    }

    public static void SearchName(){
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.print("Введите фамилию для поиска:  ");
        String s = iScanner.nextLine();
        System.out.printf("%s: %s \n", s, phoneBook.get(s));
        iScanner.close();
    }

    public static void AddMan(){
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.print("Введите фамилию и номер телефона для добавления:  ");
        String s = iScanner.nextLine();
        String[] sMas =s.split(" ");
        phoneBook.put(sMas[0], List.of(sMas[1]));
        // if (phoneBook.containsKey(sMas[0])){
        //     // List <String> list = new ArrayList<String>();
        //     phoneBook.get(sMas[0]).add(sMas[1]);
        //     // list.add(sMas[1]);
        //     // phoneBook.put(sMas[0], list);
        // } else {
        //     phoneBook.put(sMas[0], List.of(sMas[1]));
        //     }
        
        for (var el: phoneBook.entrySet()){
            System.out.println(el.getKey() + " " + el.getValue());
          }
        
        iScanner.close();
    }

    
}

