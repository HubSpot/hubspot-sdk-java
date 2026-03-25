// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.transactional.PublicSingleSendEmail
import com.hubspot_sdk.api.models.marketing.transactional.PublicSingleSendRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionalServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val transactionalService = client.marketing().transactional()

        val emailSendStatusView =
            transactionalService.send(
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
