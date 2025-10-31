// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.LinkGenerationRequest
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.links.LinkCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LinkServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val linkService = client.marketing().subscriptions().v4().links()

        val linkGenerationResponse =
            linkService.create(
                LinkCreateParams.builder()
                    .channel(LinkCreateParams.Channel.EMAIL)
                    .businessUnitId(0L)
                    .linkGenerationRequest(
                        LinkGenerationRequest.builder()
                            .subscriberIdString("subscriberIdString")
                            .language("language")
                            .subscriptionId(0L)
                            .build()
                    )
                    .build()
            )

        linkGenerationResponse.validate()
    }
}
