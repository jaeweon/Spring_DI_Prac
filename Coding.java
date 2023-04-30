package com.example.demo.dependency;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 해당 객체를 Spring에서 관리하도록 설정
@Data // getter, setter, toString, hashcode
// @NoArgsConstructor // 기본 생성자
//@AllArgsConstructor // 모든 필드를 초기화 할 수 있는 생성자 선언
@RequiredArgsConstructor // final 또는 @NonNUll 이 붙은 친구들만 초기화 시켜 줌
public class Coding {

    // 필드 주입 (방법 1)
    // 굉장히 편하게 주입 할 수 있다.
    // 다른 곳 에서 바로 변형이 가능하기 때문에 값이 변경 될 수 있는 심각한 문제가 생길 수 있다.
//    @Autowired
    private final Computer computer;

    // 생성자 주입 (방법 2 = 주로 쓰는 방식)
//    @Autowired
//    public Coding(Computer computer) { // computer는 이제 부터 생성자를 통해 주입을 받게 되고
//        this.computer = computer;      // 생성자는 필드를 메모리에 올림과 동시에 초기화 되기 때문에
//          }                            // final을 사용할 수 있고
   }                                  // 선언과 동시에 초기화 된다.
