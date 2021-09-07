package org.example.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserModel {
    private Integer id;
    private String name;
    private String password;
}
