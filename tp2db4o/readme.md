se necesita utilizar el db4o.jar que trae esto en /lib/, proviene del archivo de al lado, que esta sin renombrar

se instala con maven

mvn install:install-file -Dfile=lib/db4o.jar -DgroupId=com.db4o -DartifactId=db4o -Dversion=8.0 -Dpackaging=jar

y en el pom.xml hay que agregar:

<dependencies>
    <dependency>
        <groupId>com.db4o</groupId>
        <artifactId>db4o</artifactId>
        <version>8.0</version>
    </dependency>
</dependencies>




# Para compilar

 
mvn compile

# Para Ejecutar

mvn exec:java -Dexec.mainClass="com.tp2.App"

# Salida:

Hello World!
Juan
Adios World!

# Para Ejecutar el JAR ejecutable:

java -jar target/tp2-1.0-SNAPSHOT.jar

## Salida:
Hello World!
Juan
Juan
Juan
Juan
Adios World!

nota: tiene muchos juan porque se corrio varias veces

