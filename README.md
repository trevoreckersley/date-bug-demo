# Demonstrates a bug in the PostgreSQL driver

Dates before 1970-01-01 with a time value change one day closer to 1970, rather than getting truncated, if the system 
time zone is UTC, GMT, or an offset variant (e.g. UTC-7:00). As part of the main method, this project sets the timezone 
to UTC. This is caused by a rounding error in the PostgreSQL driver. See https://github.com/pgjdbc/pgjdbc/issues/1499 
for more details.

## Required configuration

You must have a running instance of PostgreSQL available with read/write privileges. A spring.datasource.url, 
spring.datasource.username, and spring.datasource.password (if required for the user) must be provided as JVM properties 
or by populating the values in the [application.yml](src/main/resources/application.yml) to connect to said database.

## Execution

Run the compiled JAR file using `java -jar` or execute the Spring Boot application from your IDE (like IntelliJ) if it 
supports it. Flyway will create a `dates` table and some database entries 
[V1_1__init.sql](src/main/resources/db/migration/V1_1__init.sql). Spring will then read the same values from the 
database using both LocalDateTime and LocalDate and write each to the console. The first 5 entries display normal, 
expected behavior when reading the timestamp as a LocalDate; however, the following entries (#6 onward) display the
bug that occurs when LocalDate is used for a date less than 1970-01-01 and the time of day is not midnight.