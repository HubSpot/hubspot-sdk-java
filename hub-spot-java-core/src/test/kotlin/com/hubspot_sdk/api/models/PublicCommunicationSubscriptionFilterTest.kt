// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCommunicationSubscriptionFilterTest {

    @Test
    fun create() {
        val publicCommunicationSubscriptionFilter =
            PublicCommunicationSubscriptionFilter.builder()
                .addAcceptedOptState("string")
                .channel("channel")
                .filterType(
                    PublicCommunicationSubscriptionFilter.FilterType.COMMUNICATION_SUBSCRIPTION
                )
                .addSubscriptionId("string")
                .subscriptionType("subscriptionType")
                .businessUnitId("businessUnitId")
                .build()

        assertThat(publicCommunicationSubscriptionFilter.acceptedOptStates())
            .containsExactly("string")
        assertThat(publicCommunicationSubscriptionFilter.channel()).isEqualTo("channel")
        assertThat(publicCommunicationSubscriptionFilter.filterType())
            .isEqualTo(PublicCommunicationSubscriptionFilter.FilterType.COMMUNICATION_SUBSCRIPTION)
        assertThat(publicCommunicationSubscriptionFilter.subscriptionIds())
            .containsExactly("string")
        assertThat(publicCommunicationSubscriptionFilter.subscriptionType())
            .isEqualTo("subscriptionType")
        assertThat(publicCommunicationSubscriptionFilter.businessUnitId())
            .contains("businessUnitId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCommunicationSubscriptionFilter =
            PublicCommunicationSubscriptionFilter.builder()
                .addAcceptedOptState("string")
                .channel("channel")
                .filterType(
                    PublicCommunicationSubscriptionFilter.FilterType.COMMUNICATION_SUBSCRIPTION
                )
                .addSubscriptionId("string")
                .subscriptionType("subscriptionType")
                .businessUnitId("businessUnitId")
                .build()

        val roundtrippedPublicCommunicationSubscriptionFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCommunicationSubscriptionFilter),
                jacksonTypeRef<PublicCommunicationSubscriptionFilter>(),
            )

        assertThat(roundtrippedPublicCommunicationSubscriptionFilter)
            .isEqualTo(publicCommunicationSubscriptionFilter)
    }
}
