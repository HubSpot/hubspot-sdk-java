// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.transactional.singleemail

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.PublicSingleSendEmail
import com.hubspot_sdk.api.models.marketing.PublicSingleSendRequestEgg
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SingleEmailSendParamsTest {

    @Test
    fun create() {
        SingleEmailSendParams.builder()
            .publicSingleSendRequestEgg(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            SingleEmailSendParams.builder()
                .publicSingleSendRequestEgg(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SingleEmailSendParams.builder()
                .publicSingleSendRequestEgg(
                    PublicSingleSendRequestEgg.builder()
                        .emailId(0L)
                        .message(PublicSingleSendEmail.builder().to("to").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicSingleSendRequestEgg.builder()
                    .emailId(0L)
                    .message(PublicSingleSendEmail.builder().to("to").build())
                    .build()
            )
    }
}
