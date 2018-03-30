=== STEP 1 ===

In order to build a properly started SpringBoot application follow the guide in here 
(https://intellij-support.jetbrains.com/hc/en-us/community/posts/115000113870-Gradle-Spring-Boot-Project-Cannot-Run-From-IDEA)



=== STEP 2 ===

In this example the user is using Maven but the way of thinking is the same. 

You have to add the "spring-web" dependency as it is shown here 
(https://stackoverflow.com/questions/8422720/what-dependency-is-missing-for-org-springframework-web-bind-annotation-requestma).



=== STEP 3 ===

It maybe needs to change the Kotlin version



=== STEP 4 ===

You run it with ./gradlew bootRun or ./gradlew clean bootRun
