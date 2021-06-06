package ru.netology.manager;

import ru.netology.domain.Status;
import ru.netology.domain.category.Assignee;
import ru.netology.domain.category.Author;
import ru.netology.domain.Issue;
import ru.netology.domain.category.Label;
import ru.netology.domain.comparator.DateComparator;
import ru.netology.domain.comparator.UpdateComparator;
import ru.netology.repository.IssueRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IssueManager {
    private IssueRepository repository;

    public IssueManager(IssueRepository issues) {
        this.repository = issues;
    }

    public void add(Issue issue) {
        repository.add(issue);
    }

    public List<Issue> showOpen() {
        List<Issue> temp = new ArrayList<>();
        for (Issue issue : repository.getAll()) {
            if (issue.getStatus().equals(Status.OPENED)) {
                temp.add(issue);

            }
        }
        return temp;
    }

    public List<Issue> showClosed() {
        List<Issue> temp = new ArrayList<>();
        for (Issue issue : repository.getAll()) {
            if (issue.getStatus().equals(Status.CLOSED)) {
                temp.add(issue);

            }
        }
        return temp;
    }

    public List<Issue> findMatch(Predicate<Issue> predicate) {
        List<Issue> temp = new ArrayList<>();
        for (Issue issue : repository.getAll()) {
            if (predicate.test(issue)) {
                temp.add(issue);
            }
        }
        return temp;
    }

    public List<Issue> filterByAssignee(Assignee assignee) {
        List<Issue> temp = new ArrayList<>();
        for (Issue issue : repository.getAll()) {
            if (issue.getAssigneesSet().contains(assignee)) {
                temp.add(issue);
            }
        }
        return temp;
    }

    public List<Issue> filterByLabel(Label label) {
        List<Issue> temp = new ArrayList<>();
        for (Issue issue : repository.getAll()) {
            if (issue.getLabel().contains(label)) {
                temp.add(issue);
            }
        }
        return temp;
    }

    public List<Issue> sortByTime(DateComparator comparator) {
        List<Issue> issuesAll = repository.getAll();
        issuesAll.sort(comparator);
        return issuesAll;
    }

    public List<Issue> sortByUpdate(UpdateComparator comparator) {
        List<Issue> issuesAll = repository.getAll();
        issuesAll.sort(comparator);
        return issuesAll;
    }

    public Issue findById(int issueId) {
        for (Issue issue : repository.getAll()) {
            if (issue.getId() == issueId) {
                return issue;
            }
        }
        return null;
    }
}

