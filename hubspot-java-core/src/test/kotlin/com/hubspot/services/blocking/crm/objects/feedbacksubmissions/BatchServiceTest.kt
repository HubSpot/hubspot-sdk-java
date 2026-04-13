// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects.feedbacksubmissions

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot.models.crm.objects.SimplePublicObjectId
import com.hubspot.models.crm.objects.feedbacksubmissions.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().objects().feedbackSubmissions().batch()

        val batchResponseSimplePublicObject =
            batchService.get(
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

        batchResponseSimplePublicObject.validate()
    }
}
