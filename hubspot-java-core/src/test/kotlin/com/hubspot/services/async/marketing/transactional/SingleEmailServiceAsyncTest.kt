// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.transactional

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.core.JsonValue
import com.hubspot.models.marketing.PublicSingleSendEmail
import com.hubspot.models.marketing.PublicSingleSendRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SingleEmailServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val singleEmailServiceAsync = client.marketing().transactional().singleEmail()

        val emailSendStatusViewFuture =
            singleEmailServiceAsync.send(
                PublicSingleSendRequestEgg.builder()
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
                    .emailId(0L)
                    .message(
                        PublicSingleSendEmail.builder()
                            .addBcc("string")
                            .addCc("string")
                            .addReplyTo("string")
                            .from("from")
                            .sendId("sendId")
                            .to("to")
                            .build()
                    )
                    .build()
            )

        val emailSendStatusView = emailSendStatusViewFuture.get()
        emailSendStatusView.validate()
    }
}
