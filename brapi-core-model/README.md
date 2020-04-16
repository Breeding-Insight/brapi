# brapi-core-model
BrAPI 2.0 Core Module Data Model

See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.0

To include this dependency in your project, add the following dependency:

```
<dependency>
  <groupId>org.brapi</groupId>
  <artifactId>brapi-core-model</artifactId>
  <version>2.0-SNAPSHOT</version>
</dependency>
```

### settings.xml
Currently, this package IS NOT in Maven Central, but hosted in GitHub Packages, you will need to modify your `settings.xml` file to add the following repository:

```
<repository>
    <id>github</id>
    <name>GitHub Breeding Insight Apache Maven Packages</name>
    <url>https://maven.pkg.github.com/Breeding-Insight/brapi-core-model</url>
</repository>
```

You will also need to add a `server` configuration item:

```
<server>
    <id>github</id>
    <username>${username}</username>
    <password>${password/token}</password>
</server>
```
