package ru.netology.domain.comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Issue;

import java.util.Comparator;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DateComparator implements Comparator<Issue> {
    private boolean isDescending;

    @Override
    public int compare(Issue issue1, Issue issue2) {
        if (isDescending) {
            return issue2.getCreateDate().compareTo(issue1.getCreateDate());
        } else {
            return issue1.getCreateDate().compareTo(issue2.getCreateDate());
        }
    }
}

