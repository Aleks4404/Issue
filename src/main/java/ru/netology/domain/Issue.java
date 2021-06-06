package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.newIssue.NewIssue;
import ru.netology.domain.category.*;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Issue {
    private int id;
    private String name; // Имя
    private NewIssue newIssue; // Новый выпуск
    private int countComment; // Кол-во комментариев
    private Status status; // Статус
    private Author author; // Автор
    private Set<Label> label = new HashSet<>(); // Маркировка
    private Projects projects; // Проект
    private String milestones; // Вехи
    private Set<Assignee> assigneesSet = new HashSet<>(); // Правопреемник
    private Sort sort; // Сортировать
    private Date creationDate; // Дата создания
    private Date updateDate; // Дата обновления
    private Date commentDate;

    public Issue(int id, String name, NewIssue newIssue, int countComment, Status status, Author author, Set<Label> label, String project, String milestones, Set<Assignee> assigneesSet, Sort sort, Date creationDate, Date updateDate, Date commentDate) {
        this.id = id;
        this.name = name;
        this.newIssue = newIssue;
        this.countComment = countComment;
        this.status = status;
        this.author = author;
        this.label = label;
        this.projects = projects;
        this.milestones = milestones;
        this.assigneesSet = assigneesSet;
        this.sort = sort;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.commentDate = commentDate;
    }

    public Issue(int id, String name, Author author, Label label, Assignee assignee, Status status, Date createDate, Date updateDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.label.add(label);
        this.assigneesSet.add(assignee);
        this.status = status;
        this.creationDate = createDate;
        this.updateDate = updateDate;
    }

    public void setStatus(Status status) {
        this.status = status;
        updateDate = new Date();
    }

    public <T> Comparable getCreateDate() {
        return null;
    }
}
