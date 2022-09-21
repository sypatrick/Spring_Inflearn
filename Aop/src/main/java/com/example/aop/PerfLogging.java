package com.example.aop;

import java.lang.annotation.*;
/*
 이 애노테이션은 로깅에 사용합니다.

 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS) // 어노테이션 유지 Class : class 파일까지 남아있다. Source : 컴파일하고 나면 사라진다.
public @interface PerfLogging {
}
