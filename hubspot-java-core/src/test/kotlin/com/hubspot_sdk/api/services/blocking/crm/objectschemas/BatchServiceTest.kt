// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objectschemas

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaBatchReadRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().objectSchemas().batch()

        val collectionResponseObjectSchemaNoPaging =
            batchService.get(
                ObjectSchemaBatchReadRequest.builder()
                    .includeAssociationDefinitions(true)
                    .includeAuditMetadata(true)
                    .includePropertyDefinitions(true)
                    .addInput("string")
                    .build()
            )

        collectionResponseObjectSchemaNoPaging.validate()
    }
}
