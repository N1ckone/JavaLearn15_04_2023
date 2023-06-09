package homeWork7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TelephoneDirectory {

    private List<Entry> entries = new ArrayList<>();


    public static void main(String[] args) {
       TelephoneDirectory directory = new TelephoneDirectory();
       directory.add("Иванов", "+79995552233");
       directory.add("Некрасова", "+79857353535");
       directory.add("Петров", "+79123172635");
       directory.add("Иванов", "+79263742421");
       directory.get("Некрасова");
       directory.get("Иванов");
    }
    public void add(String surname, String number) {
        Entry entry = new Entry(surname, number);
        entries.add(entry);

    }

    public void get(String surname) {
        for (Entry entry : entries) {
            if(entry.getSurname().equals(surname)) {
                System.out.println(entry.number);
            }
        }
    }

    @Override
    public String toString() {
        return entries.toString();
    }

    private static class Entry{

        private String surname;
        private String number;

        public String getSurname() {
            return surname;
        }

        public String getNumber() {
            return number;
        }

        public Entry(String surname, String number) {
            this.surname = surname;
            this.number = number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Entry entry = (Entry) o;

            if (!Objects.equals(surname, entry.surname)) return false;
            return Objects.equals(number, entry.number);
        }

        @Override
        public int hashCode() {
            int result = surname != null ? surname.hashCode() : 0;
            result = 31 * result + (number != null ? number.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Запись (Фамилия:" + getSurname() + " | Номер: " + getNumber() + ")";
        }
    }
}
