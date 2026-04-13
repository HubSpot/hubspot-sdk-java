// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects.feedbacksubmissions

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectId
import com.hubspot.sdk.models.crm.objects.feedbacksubmissions.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.crm().objects().feedbackSubmissions().batch()

        val batchResponseSimplePublicObjectFuture =
            batchServiceAsync.get(
                BatchGetParams.builder()
                    .archived(true)
                    .batchReadInputSimplePublicObjectId(
                        BatchReadInputSimplePublicObjectId.builder()
                            .addInput(SimplePublicObjectId.builder().id("430001").build())
                            .addProperty("string")
                            .addPropertiesWithHistory("string")
                            .idProperty("idProperty")
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicObject = batchResponseSimplePublicObjectFuture.get()
        batchResponseSimplePublicObject.validate()
    }
}
