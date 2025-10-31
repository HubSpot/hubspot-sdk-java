// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.feedbacksubmissions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.SimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.feedbacksubmissions.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.crm().objects().feedbackSubmissions().batch()

        val batchResponseSimplePublicObjectFuture =
            batchServiceAsync.get(
                BatchGetParams.builder()
                    .archived(true)
                    .batchReadInputSimplePublicObjectId(
                        BatchReadInputSimplePublicObjectId.builder()
                            .addInput(SimplePublicObjectId.builder().id("id").build())
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
