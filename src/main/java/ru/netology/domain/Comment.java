package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.category.Author;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {
    public int id;
    public Author author;
    public String comment;
    public String date;
}
