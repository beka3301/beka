import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /* ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("Оригинальный список: " + list);

        list.remove(1);
        System.out.println(" После удаления элемента с индексом 1: " + list);

        list.add(1, "New Element");
        System.out.println("Новый элемент по индексу 1: " + list);*/

       /* ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(8);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма элементов " + sum);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);

        numbers.set(1, 20);
        System.out.println("Обновления элемента с индексом 1: " + numbers);*/



        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Bos", 40));
        people.add(new Person("Charlie", 22));

        System.out.println("All people:");
        for (Person person : people) {
            System.out.println(person.name + " - " + person.age + " лет");
        }

        ArrayList<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (person.age > 25) {
                filteredList.add(person);
            }
        }

        System.out.println("\nЛюди старше 25 лет:");
        for (Person person : filteredList) {
            System.out.println(person.name + " - " + person.age + " лет");
        }

    }
    }





