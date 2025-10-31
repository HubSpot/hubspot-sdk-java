// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSingleSendRequestEggTest {

    @Test
    fun create() {
        val publicSingleSendRequestEgg =
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

        assertThat(publicSingleSendRequestEgg.emailId()).isEqualTo(0L)
        assertThat(publicSingleSendRequestEgg.message())
            .isEqualTo(
                PublicSingleSendEmail.builder()
                    .to("to")
                    .addBcc("string")
                    .addCc("string")
                    .from("from")
                    .addReplyTo("string")
                    .sendId("sendId")
                    .build()
            )
        assertThat(publicSingleSendRequestEgg.contactProperties())
            .contains(
                PublicSingleSendRequestEgg.ContactProperties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicSingleSendRequestEgg.customProperties())
            .contains(
                PublicSingleSendRequestEgg.CustomProperties.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSingleSendRequestEgg =
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

        val roundtrippedPublicSingleSendRequestEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSingleSendRequestEgg),
                jacksonTypeRef<PublicSingleSendRequestEgg>(),
            )

        assertThat(roundtrippedPublicSingleSendRequestEgg).isEqualTo(publicSingleSendRequestEgg)
    }
}
