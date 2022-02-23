## JD-Spark-WordCount

Project based on Article: <https://www.journaldev.com/20342/apache-spark-example-word-count-program-java>

## Create Base Project 

Go to your 44-517 folder. Open Git Bash. Run the following command (see note below):

`mvn archetype:generate -DgroupId=com.journaldev.sparkdemo -DartifactId=JD-Spark-WordCount -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

## Open the project folder in VS Code

- Edit pom.xml in root project folder (see article)
- Edit App.java (change the class name AND file name to WordCounter - see article)
- Create input.txt in the root project folder (add any text you like)


## Run Maven Commands

Open PS as Admin and run the mvn commands based on those in the article to count the words:

`mvn dependency:tree`
`mvn clean`
`mvn compile`
`mvn exec:java "-Dexec.mainClass=com.journaldev.sparkdemo.WordCounter" "-Dexec.args=input.txt"`

Alternate: The article command is for Git Bash:

`mvn exec:java -Dexec.mainClass=com.journaldev.sparkdemo.WordCounter -Dexec.args="input.txt"`

## Warnings

You do not need to debug the version warnings for this exercise. 

## Verify Output

- What new folder was created during execution?
- What file has the results?

## Understand the Code

Explore the code. 

- Understand where code begins, the classes and methods used, the output folder creation. 
- Review the pom.xml. Understand the project elements including dependencies, and Maven plugins. 
- What is Maven? What is a plugin? 

## Common Error

Delete the output directory before regenerating new output. 
Find the associated code. Could you change the output folder? 
