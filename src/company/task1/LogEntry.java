package company.task1;

public class LogEntry {
    String name;
    String url;

    public LogEntry(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}


//    существует класс LogEntry
//        login: String - имя пользователя
//        url: String -  URL-адрес, по которому щелкнул пользователь
//        1 вычислить, сколько раз была нажата каждый URL.
//        2 вычислить сколько раз пользователь нажимал URL (любую URL)
