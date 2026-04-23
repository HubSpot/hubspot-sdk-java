// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSubscriptionTranslationTest {

    @Test
    fun create() {
        val publicSubscriptionTranslation =
            PublicSubscriptionTranslation.builder()
                .createdAt(0L)
                .description("description")
                .languageCode("languageCode")
                .name("name")
                .subscriptionId(0L)
                .updatedAt(0L)
                .build()

        assertThat(publicSubscriptionTranslation.createdAt()).isEqualTo(0L)
        assertThat(publicSubscriptionTranslation.description()).isEqualTo("description")
        assertThat(publicSubscriptionTranslation.languageCode()).isEqualTo("languageCode")
        assertThat(publicSubscriptionTranslation.name()).isEqualTo("name")
        assertThat(publicSubscriptionTranslation.subscriptionId()).isEqualTo(0L)
        assertThat(publicSubscriptionTranslation.updatedAt()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSubscriptionTranslation =
            PublicSubscriptionTranslation.builder()
                .createdAt(0L)
                .description("description")
                .languageCode("languageCode")
                .name("name")
                .subscriptionId(0L)
                .updatedAt(0L)
                .build()

        val roundtrippedPublicSubscriptionTranslation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSubscriptionTranslation),
                jacksonTypeRef<PublicSubscriptionTranslation>(),
            )

        assertThat(roundtrippedPublicSubscriptionTranslation)
            .isEqualTo(publicSubscriptionTranslation)
    }
}
