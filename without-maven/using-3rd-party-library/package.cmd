:: Compile
:: 1. Add jar file in lib folder to classpath
:: 2. Set target directory
javac -cp ./lib/* -d ./target/classes  ./src/main/java/org/example/sampleartifact/*.java


:: Run
:: 1. Set ./target/classes and ./lib folder on classpath
:: 2. Run HelloWorld
java  -cp ./lib/*;./target/classes org.example.sampleartifact.HelloWorld
