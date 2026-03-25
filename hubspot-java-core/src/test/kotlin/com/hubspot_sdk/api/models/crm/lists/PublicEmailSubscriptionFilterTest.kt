// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEmailSubscriptionFilterTest {

    @Test
    fun create() {
        val publicEmailSubscriptionFilter =
            PublicEmailSubscriptionFilter.builder()
                .addAcceptedStatus("string")
                .filterType(PublicEmailSubscriptionFilter.FilterType.EMAIL_SUBSCRIPTION)
                .addSubscriptionId("string")
                .subscriptionType("subscriptionType")
                .build()

        assertThat(publicEmailSubscriptionFilter.acceptedStatuses()).containsExactly("string")
        assertThat(publicEmailSubscriptionFilter.filterType())
            .isEqualTo(PublicEmailSubscriptionFilter.FilterType.EMAIL_SUBSCRIPTION)
        assertThat(publicEmailSubscriptionFilter.subscriptionIds()).containsExactly("string")
        assertThat(publicEmailSubscriptionFilter.subscriptionType()).contains("subscriptionType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEmailSubscriptionFilter =
            PublicEmailSubscriptionFilter.builder()
                .addAcceptedStatus("string")
                .filterType(PublicEmailSubscriptionFilter.FilterType.EMAIL_SUBSCRIPTION)
                .addSubscriptionId("string")
                .subscriptionType("subscriptionType")
                .build()

        val roundtrippedPublicEmailSubscriptionFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEmailSubscriptionFilter),
                jacksonTypeRef<PublicEmailSubscriptionFilter>(),
            )

        assertThat(roundtrippedPublicEmailSubscriptionFilter)
            .isEqualTo(publicEmailSubscriptionFilter)
    }
}
