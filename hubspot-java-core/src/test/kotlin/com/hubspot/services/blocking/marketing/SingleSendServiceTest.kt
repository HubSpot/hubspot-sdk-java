// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.marketing.PublicSingleSendEmail
import com.hubspot.models.marketing.PublicSingleSendRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SingleSendServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val singleSendService = client.marketing().singleSend()

        val emailSendStatusView =
            singleSendService.create(
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
