# aws-connection-test

Project that depicts issues with connections with AWS

run tests:
```bath
 ./gradlew run
```
**Important**: make sure you have AWS region and AWS creds set in your envs/local profile.

Results depict that first call to AWS (when there are no connection in the pool).

```bash
DDB test
Query execution time (ms): 530
Query execution time (ms): 77
Query execution time (ms): 76
Query execution time (ms): 76
Query execution time (ms): 75
Query execution time (ms): 77
Query execution time (ms): 79
Query execution time (ms): 77
Query execution time (ms): 75
Query execution time (ms): 75
Pause
Query execution time (ms): 369
Query execution time (ms): 83
Query execution time (ms): 79
Query execution time (ms): 79
Query execution time (ms): 273
Query execution time (ms): 184
Query execution time (ms): 86
Query execution time (ms): 79
Query execution time (ms): 91
Query execution time (ms): 80
Pause
Cognito test
Query execution time (ms): 449
Query execution time (ms): 121
Query execution time (ms): 121
Query execution time (ms): 130
Query execution time (ms): 115
Query execution time (ms): 122
Query execution time (ms): 117
Query execution time (ms): 111
Query execution time (ms): 117
Query execution time (ms): 120
Pause
Query execution time (ms): 305
Query execution time (ms): 104
Query execution time (ms): 100
Query execution time (ms): 103
Query execution time (ms): 96
Query execution time (ms): 101
Query execution time (ms): 117
Query execution time (ms): 101
Query execution time (ms): 109
Query execution time (ms): 109

```

See the blog post about it
https://medium.com/@ugolnikovroman/aws-services-performance-c08685e88b69