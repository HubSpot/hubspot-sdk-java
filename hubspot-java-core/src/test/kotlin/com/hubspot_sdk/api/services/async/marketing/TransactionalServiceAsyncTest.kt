// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.transactional.PublicSingleSendEmail
import com.hubspot_sdk.api.models.marketing.transactional.PublicSingleSendRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionalServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val transactionalServiceAsync = client.marketing().transactional()

        val emailSendStatusViewFuture =
            transactionalServiceAsync.send(
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
