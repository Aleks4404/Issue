package ru.netology.repository;

import ru.netology.domain.Issue;
import ru.netology.domain.Status;

import java.util.ArrayList;
import java.util.List;

public class IssueRepository {
    private List<Issue> issues = new ArrayList<>();

    public List<Issue> getAll() {
        return issues;
    }

    public void add(Issue issue) {
        issues.add(issue);
    }

    public void open(int issueId) {
        for (Issue issue : issues) {
            if (issue.getId() == issueId) {
                issue.setStatus(Status.OPENED);
            }
        }
    }

    public void close(int issueId) {
        for (Issue issue : issues) {
            if (issue.getId() == issueId) {
                issue.setStatus(Status.CLOSED);
            }
        }
    }

    public void deleteById(int issueId) {
        for (Issue issue : issues) {
            if (issue.getId() == issueId) {
                issues.remove(issue);
                return;
            }
        }
    }

    public Issue findById(int issueId) {
        for (Issue issue : issues) {
            if (issue.getId() == issueId) {
                return issue;
            }
        }
        return null;
    }
}