# brapi-pheno-model
BrAPI 2.0 Phenotyping Module Data Model

See https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.0

To include this dependency in your project, add the following dependency:

```
<dependency>
  <groupId>org.brapi</groupId>
  <artifactId>brapi-pheno-model</artifactId>
  <version>2.0-SNAPSHOT</version>
</dependency>
```

### settings.xml
Currently, this package ***IS NOT*** in Maven Central, but hosted in GitHub Packages, you will need to modify your `settings.xml` file to add the following repository:

```
<repository>
    <id>github</id>
    <name>GitHub Breeding Insight Apache Maven Packages</name>
    <url>https://maven.pkg.github.com/Breeding-Insight/brapi-pheno-model</url>
</repository>
```

You will also need to add a `server` configuration item:

```
<server>
    <id>github</id>
    <username>${env.GITHUB_ACTOR}</username>
    <password>${env.GITHUB_TOKEN}</password>
</server>
```

`GITHUB_ACTOR` - your GitHub username  
`GITHUB_TOKEN` - You can generate a token for authenticating to GitHub's package manager by following these instructions: https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line.  
*Note: your token needs to at least have `read:package` rights.

An example `settings.xml` file:

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

    <activeProfiles>
        <activeProfile>github</activeProfile>
    </activeProfiles>

    <profiles>
        <profile>
            <id>github</id>
            <repositories>
                <repository>
                    <id>central</id>
                    <url>https://repo1.maven.org/maven2</url>
                    <releases><enabled>true</enabled></releases>
                    <snapshots><enabled>true</enabled></snapshots>
                </repository>
                <repository>
                    <id>github</id>
                    <name>GitHub Breeding Insight Apache Maven Packages</name>
                    <url>https://maven.pkg.github.com/Breeding-Insight/brapi-pheno-model</url>
                </repository>
            </repositories>
        </profile>
    </profiles>

    <servers>
        <server>
            <id>github</id>
            <username>${env.GITHUB_ACTOR}</username>
            <password>${env.GITHUB_TOKEN}</password>
        </server>
    </servers>
</settings>
```

If you don't want to modify your global `settings.xml`, you can create one to live in your code, then when running maven commands, include the `--settings` flag, ex: `mvn clean install --settings settings.xml`