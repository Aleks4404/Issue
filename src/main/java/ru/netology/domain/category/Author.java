package ru.netology.domain.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Issue;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author extends Issue {
    public int id;
    public String name;
}
