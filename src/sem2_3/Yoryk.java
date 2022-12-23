package sem2_3;

public interface Yoryk {
    int getUserId();

    default int getAminId() { //Метод по умолчанию, если не будет его реализации
        return 1;

    }

    static int getUniversalId() { //Не наследуется реализирующими классами, вызывается точечной
                                  // анотацией по имени интрерфейса
        return 5;
    }
}
