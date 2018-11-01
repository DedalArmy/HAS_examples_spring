# HAS_examples_spring
Repository used to store the examples of the Home Automation System (HAS) using Spring Framework 5.
The original example of HAS created by Alexandre Le Borgne is available here : [https://github.com/DedalArmy/HAS_example](https://github.com/DedalArmy/HAS_example).

# Prerequistes

To build and run the project you must have installed on your machine :
* Maven
* Java Development Kit version 1.8
* The port 8888 open and not already used

# Project structure
```console
.
├── example_1_original
│   ├── pom.xml #Maven module example_1_original
│   └── src
│       └── ...
│ 
├── example_2_annotations_original_xml
│   ├── pom.xml #Maven module example_2_annotations_original_xml
│   └── src
│       └── ...
│ 
├── example_3_mixed_conf
│   ├── pom.xml #Maven module example_3_mixed_conf
│   └── src
│       └── ...
│ 
├── example_4_annotations_conf
│   ├── pom.xml #Maven module example_4_annotations_conf
│   └── src
│       └── ...
├── .gitignore
├── pom.xml #Maven Parent POM
└── README.md

```

# Build and run

To build a specific example :
1. go to the folder of the desired module
2. Run the following command to build the project (
    ```console
    # lego@dedalarmy in ~/HAS_examples_spring/[desired_module]
    $ mvn clean install
    ```
3. After to launch Spring Boot, please run the command :
    ```console
    # lego@dedalarmy in ~/HAS_examples_spring/[desired_module]
    $ mvn spring-boot:run
    ```
And normally (but only if you're lucky and kind :sparkles: ) the Spring Boot app starts correctly :+1:

# Use the Spring Boot Actuator API

The Maven project use the dependency Spring Boot Actuator to monitor the Spring apps.
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-actuator</artifactId>
  <version>2.0.5.RELEASE</version>
</dependency>
```

The endpoint to access at the Actuator API is : **/actuator** . in my case it's for example : **localhost:8888/actuator**

To see the beans of the launched Spring Boot application use : **/actuator/beans**, always in my case it's  **localhost:8888/actuator/beans**
