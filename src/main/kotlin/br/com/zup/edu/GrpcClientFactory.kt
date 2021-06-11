package br.com.zup.edu

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class GrpcClientFactory {

    @Singleton
    fun fretesClientStup(@GrpcChannel("fretes") channel: ManagedChannel ): FretesServiceGrpc.FretesServiceBlockingStub? {
//Esse fretes acima, vem do application.yml

//        val channel: ManagedChannel = ManagedChannelBuilder
//            .forAddress("localhost", 50051)
//            .usePlaintext()
//            .maxRetryAttempts(10)
//            .build()

        return FretesServiceGrpc.newBlockingStub(channel)
    }
}