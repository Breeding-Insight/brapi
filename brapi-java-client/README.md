# BrAPI Java Client

This is a Java client library for making calls to a BrAPI-compliant service.  

The library is currently in development to support BrAPI v2.0.

## Usage
Each API group that has been defined in the BrAPI specification as a correlating class.  Each class exposes public methods to make appropriate calls for that type.  For example, the `CallsAPI` class can make a `GET` request to retrieve a list of available calls that the target service supports.

The `BrAPIClient` is a central execution wrapper that is responsible for executing REST calls to the BrAPI service.  It is recommended that a single instance of `BrAPIClient` be created per BrAPI service you are communicating with. This allows for shared authorization across all calls.

The `BrAPIClient` will automatically add an `Authorization` header to each request.  To set an authorization token in the `BrAPIClient`:

```java
Authentication authorizationToken = brAPIClient.getAuthentication("AuthorizationToken");
if(authorizationToken instanceof OAuth) {
    ((OAuth)authorizationToken).setAccessToken(authToken);
}
```

## Building the project

If using IntelliJ, create a new configuration for Maven to build your project. 

```
Working Directory: <your_path>/brapi-client
Command: clean install
```

If not using IntelliJ, running the command 

```mvn clean install```

when in your brapi-client directory will build the project. 

## Running the tests

Every endpoint will have tests written for that endpoint. The tests are written in JUnit and can be run in IntelliJ by right clicking on the `src/test/java` folder and selecting `Run 'All Tests'`. 

You can run all of the tests via terminal by using mvn `mvn test`. 

## Development
The `CallsAPI` can be used as a template for creating additional API classes.  You will notice that the `CallsAPI` extends `BrAPIEndpoint`, and that `CallsAPI` calls to the `BrAPIEndpoint` constructor via `super`.<br><br>
Each REST method in an API class should call the `BrAPIClient` to execute the request.  This ensures that consistent code is used for creating the request, as well as parsing the main response structure.  When executing a request, call to either `BrAPIClient#execute(BrAPIRequest)` or `BrAPIClient#execute(BrAPIRequest, ResponseHandlerFunction)`.<br><br>
`BrAPIClient#execute(BrAPIRequest)` is meant for requests that do not need to process the response.<br>
`BrAPIClient#execute(BrAPIRequest, ResponseHandlerFunction)` is meant for requests that return a body that needs further processing.  The `ResponseHandlerFunction` parameter is a lambda function that passes the `Metadata`, result object and a `GSON` parser.  An example that returns a list of `Call` objects:
```java
brapiClient.execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<Call>>() {
            }.getType();
            DataResponse<Call> result = gson.fromJson(resultJson, resultGsonType);
            return result.data();
        });
```

Every endpoint should have at least one test

## Developing Tests

Each endpoint should have at least one test that uses the BrAPI test server as the destination. The `test` package should match the project structure, which endpoint test methods within the API classes. 
