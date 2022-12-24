package oop_lesson3;
// Реализация интерфейса через наследования класса
public class Female extends Male { //Класс Женщин, Наследуем от класса Male "поля" имя, фамилия и тд,
                                   //и не только...

    @Override
    public String genders() { //Возвращаем соответствующий пол...
        return "Ж";
    }

    public Female(String firstname, String lastname, int age, int idPerson) {
        super(firstname, lastname, age, idPerson);
    }

    @Override
    public String speak() {// Голос женщины
        return "Сопрано";
    }
}