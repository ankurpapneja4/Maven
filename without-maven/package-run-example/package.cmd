:: Compile
javac -d target/classes ./src/main/java/org/example/sampleartifact/*.java

:: Package
:: c : Create Mode , f : File Name , C : Change directory , . : Include All Files 
jar -cf ./target/app.jar -C ./target/classes .

:: Run
:: cp : ClassPath - Add Jar to Class Path
java  -cp ./target/app.jar  org.example.sampleartifact.HelloWorld