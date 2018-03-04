# spring-web-reactjs-example
This is the code developed to show on how to develop Spring Web with ReactJS.

### Requirements

- Maven
- JDK 8

### Configuration

First you need to edit `application.properties` and put in your Stormpath application keys.

Also to enable deletion you need to either delete the `void delete()` method in `EmployeeRepository.java`
or replace 'ROLE_ADMIN' with the URL of the Stormpath Group you are using to authorize.

### Running

To build and start the server simply type

```sh
$ mvn spring-boot:run
```

from the root directory.

### Using

Browse to `localhost:8080` to see the application in action.

The database is in memory so rebooting should reset the data.

### License

MIT

