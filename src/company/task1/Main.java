package company.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<LogEntry> logEntryList = Arrays.asList(
                new LogEntry("user1", "url1"),
                new LogEntry("user2", "url2"),
                new LogEntry("user3", "url3"),
                new LogEntry("user4", "url1"),
                new LogEntry("user1", "url2"),
                new LogEntry("user2", "url3"),
                new LogEntry("user4", "url2"),
                new LogEntry("user4", "url3"),
                new LogEntry("user9", "url2"),
                new LogEntry("user3", "url1")
        );

        Map<String, Long> urlClick = logEntryList.stream()
                .collect(Collectors.groupingBy(LogEntry::getUrl, Collectors.counting()));
        System.out.println(urlClick);


        Map<String, Long> userUrlClick = logEntryList.stream()
                .collect(Collectors.groupingBy(LogEntry::getName, Collectors.counting() ));
        System.out.println(userUrlClick);
    }
}

