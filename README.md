# Test microservice on MVC.
___

### For run is needed:
* Java 11
* Free 8080 port

### Usage:
* To run app use: 

``java -jar holidayPayCalc-0.0.1-SNAPSHOT.jar``
* Show work web page:

[http://localhost:8080/](http://localhost:8080/)

### Endpoints:
*  ``/`` for main web page.
* ``/calculate`` takes ``get`` request with query params for calculating weekend salary. For example:
``/calculate?daysOfWeekend=21&middleSalary=150000``