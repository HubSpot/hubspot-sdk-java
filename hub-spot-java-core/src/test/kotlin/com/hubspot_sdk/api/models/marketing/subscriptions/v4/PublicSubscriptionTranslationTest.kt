// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSubscriptionTranslationTest {

    @Test
    fun create() {
        val publicSubscriptionTranslation =
            PublicSubscriptionTranslation.builder()
                .createdAt(0)
                .description("description")
                .languageCode("languageCode")
                .name("name")
                .subscriptionId(0)
                .updatedAt(0)
                .build()

        assertThat(publicSubscriptionTranslation.createdAt()).isEqualTo(0)
        assertThat(publicSubscriptionTranslation.description()).isEqualTo("description")
        assertThat(publicSubscriptionTranslation.languageCode()).isEqualTo("languageCode")
        assertThat(publicSubscriptionTranslation.name()).isEqualTo("name")
        assertThat(publicSubscriptionTranslation.subscriptionId()).isEqualTo(0)
        assertThat(publicSubscriptionTranslation.updatedAt()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSubscriptionTranslation =
            PublicSubscriptionTranslation.builder()
                .createdAt(0)
                .description("description")
                .languageCode("languageCode")
                .name("name")
                .subscriptionId(0)
                .updatedAt(0)
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
