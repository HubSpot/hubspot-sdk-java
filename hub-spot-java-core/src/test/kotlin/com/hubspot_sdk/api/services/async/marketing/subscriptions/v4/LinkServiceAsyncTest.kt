// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.subscriptions.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.LinkGenerationRequest
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.links.LinkCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LinkServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val linkServiceAsync = client.marketing().subscriptions().v4().links()

        val linkGenerationResponseFuture =
            linkServiceAsync.create(
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

        val linkGenerationResponse = linkGenerationResponseFuture.get()
        linkGenerationResponse.validate()
    }
}
