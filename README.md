spring-boot-rest-example
========================

`spring-boot`  `rest`  `spring-data-mongodb`


**Take note of:**

>   If you don't want inheriting from  `spring-boot-starter-parent` in pom.xml ,you have to declare this `dependencyManagement` to avoid a lot of confused exceptions.(version conflict):
   
    <dependencyManagement>
         <dependencies>
            <dependency>
                <!-- Import dependency management from Spring Boot -->
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>1.1.0.BUILD-SNAPSHOT</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>





