// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEmailSubscriptionDetailsTest {

    @Test
    fun create() {
        val publicEmailSubscriptionDetails =
            PublicEmailSubscriptionDetails.builder()
                .officeLocationId("officeLocationId")
                .preferencesGroupId("preferencesGroupId")
                .subscriptionId("subscriptionId")
                .subscriptionName("subscriptionName")
                .build()

        assertThat(publicEmailSubscriptionDetails.officeLocationId()).contains("officeLocationId")
        assertThat(publicEmailSubscriptionDetails.preferencesGroupId())
            .contains("preferencesGroupId")
        assertThat(publicEmailSubscriptionDetails.subscriptionId()).contains("subscriptionId")
        assertThat(publicEmailSubscriptionDetails.subscriptionName()).contains("subscriptionName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEmailSubscriptionDetails =
            PublicEmailSubscriptionDetails.builder()
                .officeLocationId("officeLocationId")
                .preferencesGroupId("preferencesGroupId")
                .subscriptionId("subscriptionId")
                .subscriptionName("subscriptionName")
                .build()

        val roundtrippedPublicEmailSubscriptionDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEmailSubscriptionDetails),
                jacksonTypeRef<PublicEmailSubscriptionDetails>(),
            )

        assertThat(roundtrippedPublicEmailSubscriptionDetails)
            .isEqualTo(publicEmailSubscriptionDetails)
    }
}
