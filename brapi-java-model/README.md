# BrAPI Java Models
A library of BrAPI data models for JVM languages

See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1
See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1
See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1
See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1

## Integration

### Maven:
```xml
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