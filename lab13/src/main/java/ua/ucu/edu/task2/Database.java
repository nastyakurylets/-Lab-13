package ua.ucu.edu.task2;

public class Database extends БазаДаних {

    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return отриматиСтатистичніДані();
    }
}