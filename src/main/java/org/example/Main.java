package org.example;

import software.amazon.awssdk.services.cognitoidentityprovider.CognitoIdentityProviderClient;
import software.amazon.awssdk.services.cognitoidentityprovider.model.ListUserPoolsRequest;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

public class Main {

    public static CognitoIdentityProviderClient cognito = CognitoIdentityProviderClient.builder()
            .build();

    private static final DynamoDbClient dynamoDbClient = DynamoDbClient.builder()
            .build();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("DDB test");
        for (int i = 0; i < 2; i++) {
            doWork(() -> dynamoDbClient.listTables().toBuilder().build());
            System.out.println("Pause");
            Thread.sleep(62000);
        }
        System.out.println("Cognito test");
        for (int i = 0; i < 2; i++) {
            doWork(() -> cognito.listUserPools(ListUserPoolsRequest.builder().build()).toBuilder().build());
            System.out.println("Pause");
            Thread.sleep(62000);
        }

    }


    private static void doWork(Runnable runnable) {
        for (int i = 0; i < 10; i++) {
            long started = System.currentTimeMillis();
            runnable.run();
            long ended = System.currentTimeMillis();
            System.out.println("Query execution time (ms): " + (ended - started));
        }
    }
}