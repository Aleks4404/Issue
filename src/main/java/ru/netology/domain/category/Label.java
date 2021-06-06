package ru.netology.domain.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Issue;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Label extends Issue {
    private int id;
    private String theme;
}
