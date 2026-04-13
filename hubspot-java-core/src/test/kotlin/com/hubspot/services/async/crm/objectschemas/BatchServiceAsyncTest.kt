// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objectschemas

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.crm.objectschemas.ObjectSchemaBatchReadRequest
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
