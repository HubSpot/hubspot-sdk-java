// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSingleSendRequestEggTest {

    @Test
    fun create() {
        val publicSingleSendRequestEgg =
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

        assertThat(publicSingleSendRequestEgg.contactProperties())
            .isEqualTo(
                PublicSingleSendRequestEgg.ContactProperties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicSingleSendRequestEgg.customProperties())
            .isEqualTo(
                PublicSingleSendRequestEgg.CustomProperties.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(publicSingleSendRequestEgg.emailId()).isEqualTo(0L)
        assertThat(publicSingleSendRequestEgg.message())
            .isEqualTo(
                PublicSingleSendEmail.builder()
                    .addBcc("string")
                    .addCc("string")
                    .addReplyTo("string")
                    .from("from")
                    .sendId("sendId")
                    .to("to")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSingleSendRequestEgg =
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

        val roundtrippedPublicSingleSendRequestEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSingleSendRequestEgg),
                jacksonTypeRef<PublicSingleSendRequestEgg>(),
            )

        assertThat(roundtrippedPublicSingleSendRequestEgg).isEqualTo(publicSingleSendRequestEgg)
    }
}
