// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionDefinitionTest {

    @Test
    fun create() {
        val subscriptionDefinition =
            SubscriptionDefinition.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .isActive(true)
                .isDefault(true)
                .isInternal(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .businessUnitId(0L)
                .communicationMethod("communicationMethod")
                .purpose("purpose")
                .build()

        assertThat(subscriptionDefinition.id()).isEqualTo("id")
        assertThat(subscriptionDefinition.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionDefinition.description()).isEqualTo("description")
        assertThat(subscriptionDefinition.isActive()).isEqualTo(true)
        assertThat(subscriptionDefinition.isDefault()).isEqualTo(true)
        assertThat(subscriptionDefinition.isInternal()).isEqualTo(true)
        assertThat(subscriptionDefinition.name()).isEqualTo("name")
        assertThat(subscriptionDefinition.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionDefinition.businessUnitId()).contains(0L)
        assertThat(subscriptionDefinition.communicationMethod()).contains("communicationMethod")
        assertThat(subscriptionDefinition.purpose()).contains("purpose")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionDefinition =
            SubscriptionDefinition.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .isActive(true)
                .isDefault(true)
                .isInternal(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .businessUnitId(0L)
                .communicationMethod("communicationMethod")
                .purpose("purpose")
                .build()

        val roundtrippedSubscriptionDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionDefinition),
                jacksonTypeRef<SubscriptionDefinition>(),
            )

        assertThat(roundtrippedSubscriptionDefinition).isEqualTo(subscriptionDefinition)
    }
}
