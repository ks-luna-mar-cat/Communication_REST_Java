# Communication_REST_Java
**Program Structure**

1. MainController invoke RestClient.Communicate() method to access rest endpoint and return  dataset from rest webservice.
            
I used this Json input to send data.
{   "serviceLineIds": ["e675e4e7-978a-4c89-ad09-63b30965821f"],   "latLong": "(45.5235,-122.676)",   "duration": 15,      "orderedLabId": "",   "page": 1,  "scheduleDate": current date/time in milliseconds since the epoch(used Instant.now().toEpochMilli()) ,   "allClinics": false }

2. Get returned data as string to MainController.

3. Pass data to ParseMain.converter() method. This method unmarshals Json data into java objects.

** Instruction to run this program **


Run main method(Starting Point) on MainController.class
