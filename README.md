# KARROS_TEST_AUTOMATION

## Instructions

Clone the repo:

Git: 
```
$ git clone https://github.com/levietquynh/KARROS_TEST_AUTOMATION.git
```

Or download a ZIP of master [manually](https://github.com//levietquynh/KARROS_TEST_AUTOMATION/archive/master.zip) and expand the contents someplace on your system

## Prerequisites

* Have a JDK installed
* Have Maven installed and available on your PATH
* Have Chrome installed

## Run test

Go to folder which you cloned code and open Command Prompt

Run mvn -clean to clears the target directory into which Maven normally builds your project.

```
$ mvn -clean
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building com.karrostest.automation 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ com.karrostest.automation ---
[INFO] Deleting D:\test\KARROS_TEST_AUTOMATION\target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.330 s
[INFO] Finished at: 2020-01-05T23:13:56+07:00
[INFO] Final Memory: 5M/116M
[INFO] ------------------------------------------------------------------------
```
Then run mvn -test to run test
```
$ mvn -test
.......
2020-01-05 23:09:40,559 INFO  com.karros.test.Count_Request - The number of requests are submitted and approved in 2019 is: 5           
2020-01-05 23:09:42,689 INFO  com.karros.test.API_Test - Validate Response Status                                                       
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - Validate Response Header                                                       
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,692 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,693 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,693 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:42,693 INFO  com.karros.test.API_Test - Validate Response Body                                                         
2020-01-05 23:09:43,132 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
2020-01-05 23:09:43,141 INFO  com.karros.test.API_Test - ===PASSED===                                                                   
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 23.808 s - in TestSuite                                          
[INFO]                                                                                                                                  
[INFO] Results:                                                                                                                         
[INFO]                                                                                                                                  
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0                                                                                 
[INFO]                                                                                                                                  
[INFO] ------------------------------------------------------------------------                                                         
[INFO] BUILD SUCCESS                                                                                                                    
[INFO] ------------------------------------------------------------------------                                                         
[INFO] Total time: 28.761 s                                                                                                             
[INFO] Finished at: 2020-01-05T23:09:44+07:00                                                                                           
[INFO] Final Memory: 22M/201M                                                                                                           
[INFO] ------------------------------------------------------------------------                                                         
```
