// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects.feedbacksubmissions

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.feedbacksubmissions.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
