Centralized Configuration
To demonstrate centralized triggering of config re fetch.
https://spring.io/guides/gs/centralized-configuration/
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

To print out what the configuration has for a particular application :
http://localhost:8888/cli/default

Change and commit the config file.

http://localhost:8888/cli/default reflects the changes right away

The application still sees the old values :
http://localhost:8080/message

Will NOT make the client re read config data :
http://localhost:8080/actuator/refresh
"There was an unexpected error (type=Method Not Allowed, status=405)."

The refresh can be triggered by curs (no idea why) :
refreshTrigger.sh : curl localhost:8080/actuator/refresh -d {} -H "Content-Type: application/json"
["config.client.version","message"]
^ I suspect this will be returned, if the configuration has actually changed

The application sees now the new values :
http://localhost:8080/message

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
THE ABOVE WORKS AS DESCRIBED ABOVE DEPENDING ON VERSIONS :
 
    <!--    <version>2.4.2</version> WON'T WORK -->
    <!--     <version>2.3.2.RELEASE</version> WORKS -->
    <version>2.3.4.RELEASE</version> <!-- WORKS springboot.ticketsonlinemicrosvc -->


    <!--  1  <spring-cloud.version>2020.0.1</spring-cloud.version> WON'T WORK -->
    <!--  2  <spring-cloud.version>Hoxton.SR6</spring-cloud.version> WORKS -->
    <spring-cloud.version>Hoxton.SR8</spring-cloud.version> <!-- WORKS springboot.ticketsonlinemicrosvc -->
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
