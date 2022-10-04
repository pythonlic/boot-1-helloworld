package com.atguigu.boot.bean;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Component
@EqualsAndHashCode
@ConfigurationProperties(prefix = "mycar")
public class Car {
    // v1
    private  String brand;
    private  Integer price;
}
