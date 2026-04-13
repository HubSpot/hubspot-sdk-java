// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.transactional

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.marketing.PublicSingleSendEmail
import com.hubspot.sdk.models.marketing.PublicSingleSendRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SingleEmailServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val singleEmailService = client.marketing().transactional().singleEmail()

        val emailSendStatusView =
            singleEmailService.send(
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

        emailSendStatusView.validate()
    }
}
