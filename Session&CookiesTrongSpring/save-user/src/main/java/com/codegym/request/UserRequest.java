package com.codegym.request;
// dung lombok thi no se tu zen ra, khi thay doi tren field ko can thay doi nhieu,
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserRequest {



    private String email;
    private String password;

}
