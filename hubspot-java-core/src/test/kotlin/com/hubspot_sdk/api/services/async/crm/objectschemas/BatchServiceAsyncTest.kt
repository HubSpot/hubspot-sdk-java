// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objectschemas

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaBatchReadRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().objectSchemas().batch()

        val collectionResponseObjectSchemaNoPagingFuture =
            batchServiceAsync.get(
                ObjectSchemaBatchReadRequest.builder()
                    .includeAssociationDefinitions(true)
                    .includeAuditMetadata(true)
                    .includePropertyDefinitions(true)
                    .addInput("string")
                    .build()
            )

        val collectionResponseObjectSchemaNoPaging =
            collectionResponseObjectSchemaNoPagingFuture.get()
        collectionResponseObjectSchemaNoPaging.validate()
    }
}
