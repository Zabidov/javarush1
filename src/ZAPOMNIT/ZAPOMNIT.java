package ZAPOMNIT;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;


public class ZAPOMNIT {
    private ArrayList<Long> original = new ArrayList<Long>();

    /*private static void triple(int x) {
        x++;
    } - не сработает, так как все параметры передаются по значению. */

    /*Integer a = 100;
    Integer b = 100;
    Integer c = 1000;
    Integer d = 1000;
        System.out.println(a == b);  true, так как между -128 до 127
        System.out.println(c == d); false, так как Интегер объект и проверка как объект*/

    //str 190 karti

    //static boolean equals(Object a, Object b)
    //возвращает тру если оба нуль, фолс если один из них нуль. А если не то и не то, то вызывает a.equals(b)

    //ARRAYLIST!  Если заранее известно размер массива можно сделать так
    //ArrayList<Employee> staff = new ArrayList<>(100);   или так
    //staff.ensureCapacity(100);   экономия памяти.  Но в отличии от обычного массива это лишь ВОЗМОЖНАЯ величина
    //она может меняться выделяя дополнительную память
    //Если точно известно, что не будет увеличиваться размер можно пользоваться методом trimToSize();
    //Если после этого добавить новые элементы потребуется много памяти

    //можно вызвать один конструктов из другого. для этого надо в теле конструктора написано this() и добавить что надо. Пример
    //public Employee(double s)
    //this("Employee " + nextid, s);
    //nextid++;


    //методы не могут изменять примитивы. Но могут изменять состояние объектов передав. в кач параметра (по ссылке)
    //методы не могут присоединить новые объекты к объектным параметрам  swap(Employee a, Employee b) - не сработает

    //alt+ins и делегировать все методы из листа. потом уже через ctrl+R заменить паблики на паблик+синх!!!
    public static void main(String[] args) {
        LocalDate newYearsEve = LocalDate.of(2019,8,30);
        LocalDate aThDaysLater = newYearsEve.plusDays(1500);
        int year = aThDaysLater.getYear();
        int month = aThDaysLater.getMonthValue();
        int day = aThDaysLater.getDayOfMonth();
        System.out.println(""+year+" "+month+" "+day);
        //drugim klassom
        GregorianCalendar someDay = new GregorianCalendar(2019,7,30);
        //нумерация с нуля. поэтому 7 это август
        someDay.add(Calendar.DAY_OF_MONTH, 1000);
        //в отличии от предыдущего метода плюсдейс, этот метод меняет самдей переменную
        year = someDay.get(Calendar.YEAR);
        month = someDay.get(Calendar.MONTH) +1; //изза нумерации с нуля
        day = someDay.get(Calendar.DAY_OF_MONTH);
        System.out.println(""+year+" "+month+" "+day);
        int x = 23;
        if (Double.isNaN(x)) ; //проверяет не является ли х числом.
        //на примере 0/0 или квадратный корень из отрицательного числа дает результат NAN ( не число)
        System.out.println(2.0 - 1.1);
        //выведет 0.8999999  для исключения ошибок надо пользоваться классом BidDecimal

        //continue = в цикле передаст в начало цикла управление, игнорируя продолжение цикла

        int[][] magicSquare =
                {
                        {0, 1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20}
                };
        System.out.println(magicSquare[2][4]);
        //Arrays.sort(magicSquare);
        System.out.println(Arrays.deepToString(magicSquare));
        System.out.println(magicSquare[3][4]);
        String all = String.join(" / ", "ololo", "ololo2", "ololo3");
        //выведет ололо / ололо2 / ололо3

        //all.equalsIgnoreCase("all");
    }
    List<Long> omg = new List<Long>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NotNull
        @Override
        public Iterator<Long> iterator() {
            return null;
        }

        @NotNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NotNull
        @Override
        public <T> T[] toArray(@NotNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Long aLong) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NotNull Collection<? extends Long> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Long> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public Long get(int index) {
            return null;
        }

        @Override
        public Long set(int index, Long element) {
            return null;
        }

        @Override
        public void add(int index, Long element) {

        }

        @Override
        public Long remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @NotNull
        @Override
        public ListIterator<Long> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Long> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Long> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
}