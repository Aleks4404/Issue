package ru.netology.domain.comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Issue;

import java.util.Comparator;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateComparator implements Comparator<Issue> {
    private boolean isDescending;

    @Override
    public int compare(Issue issue1, Issue issue2) {

        if (issue1.getUpdateDate() == null && issue2.getUpdateDate()  == null) return 0;
        if (issue1.getUpdateDate()  == null) return 1;
        if (issue2.getUpdateDate()  == null) return -1;
        if (isDescending) {
            return issue2.getUpdateDate().compareTo(issue1.getUpdateDate());
        } else {
            return issue1.getUpdateDate().compareTo(issue2.getUpdateDate());
        }
    }
}
