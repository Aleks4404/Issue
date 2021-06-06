package ru.netology.domain.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Issue;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sort extends Issue {
    private String Newest;
    private String Oldest;
    private String MostCommented;
    private String LeastCommented;
    private String RecentlyUpdated;
    private String LeastRecentlyUpdated;
}
