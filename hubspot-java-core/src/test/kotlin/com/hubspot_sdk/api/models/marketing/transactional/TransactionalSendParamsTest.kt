// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.transactional

import com.hubspot_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionalSendParamsTest {

    @Test
    fun create() {
        TransactionalSendParams.builder()
            .publicSingleSendRequestEgg(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionalSendParams.builder()
                .publicSingleSendRequestEgg(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionalSendParams.builder()
                .publicSingleSendRequestEgg(
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
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                            .build()
                    )
                    .build()
            )
    }
}
