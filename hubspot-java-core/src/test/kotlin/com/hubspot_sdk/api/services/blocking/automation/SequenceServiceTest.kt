// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SequenceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sequenceService = client.automation().sequences()

        val page = sequenceService.list(SequenceListParams.builder().userId("userId").build())

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sequenceService = client.automation().sequences()

        val publicSequenceResponse =
            sequenceService.get(
                SequenceGetParams.builder().sequenceId("sequenceId").userId("userId").build()
            )

        publicSequenceResponse.validate()
    }
}
