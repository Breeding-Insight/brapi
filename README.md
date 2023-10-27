# brapi
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FBreeding-Insight%2Fbrapi.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2FBreeding-Insight%2Fbrapi?ref=badge_shield)

Java libraries for modeling BrAPI objects (`brapi-java-model`) and interacting with external BrAPI services (`brapi-java-client`) in the JVM

See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1  
See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1  
See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1  
See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1  

## Integration

### Maven:
```xml
<dependency>
    <groupId>org.brapi</groupId>
    <artifactId>brapi-java-client</artifactId>
    <version>${brapi-java-client.version}</version>
</dependency>
...
<dependency>
    <groupId>org.brapi</groupId>
    <artifactId>brapi-java-model</artifactId>
    <version>${brapi-java-model.version}</version>
</dependency>
```

Referencing Snapshots:
Add the Nexus Sonatype Snapshots repository to your pom:

```xml
<repository>
    <id>ossrh</id>
    <url>https://s01.oss.sonatype.org/content/repositories/snapshots/</url>
    <releases>
        <enabled>false</enabled>
    </releases>
</repository>
```

## Development Environment Setup
This project uses lombok so your development environment has to be configured to handle the lombok annotations. Instructions for popular editors are available [here](https://projectlombok.org/setup/overview).

### Building the project

If using IntelliJ, create a new configuration for Maven to build your project.

```
Working Directory: <your_path>/brapi
Command: clean install
```

If not using IntelliJ, running the command

```mvn clean install```

when in your brapi directory will build the project.

### Running the tests

You can run all the tests running `mvn test`.


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FBreeding-Insight%2Fbrapi.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2FBreeding-Insight%2Fbrapi?ref=badge_large)
