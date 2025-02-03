### common library
Simple test library with Spring JPA + OpenFeign QueryDSL to reproduce an issue with `@MappedSuperclass` and `@Querysupertype` on an `abstract BaseEntity`

NOTE - this library doesnt do much useful, except house the code to be imported by the dependent project. When using `BaseEntity` in the dependent project, Querydsl throws a `NullPointerException` during KSP processing.
