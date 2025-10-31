// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.transactional

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.PublicSingleSendEmail
import com.hubspot_sdk.api.models.marketing.PublicSingleSendRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SingleEmailServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val singleEmailServiceAsync = client.marketing().transactional().singleEmail()

        val emailSendStatusViewFuture =
            singleEmailServiceAsync.send(
                PublicSingleSendRequestEgg.builder()
                    .emailId(0L)
                    .message(
                        PublicSingleSendEmail.builder()
                            .to("to")
                            .addBcc("string")
                            .addCc("string")
                            .from("from")
                            .addReplyTo("string")
                            .sendId("sendId")
                            .build()
                    )
                    .contactProperties(
                        PublicSingleSendRequestEgg.ContactProperties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .customProperties(
                        PublicSingleSendRequestEgg.CustomProperties.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val emailSendStatusView = emailSendStatusViewFuture.get()
        emailSendStatusView.validate()
    }
}
