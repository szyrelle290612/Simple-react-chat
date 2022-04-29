package com.example.Simplechatapp.user;

import com.example.Simplechatapp.model.Status;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserApp {
    private String userName;
    private String password;
}