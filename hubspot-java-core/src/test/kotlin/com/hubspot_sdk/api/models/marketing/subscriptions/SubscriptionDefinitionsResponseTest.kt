// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionDefinitionsResponseTest {

    @Test
    fun create() {
        val subscriptionDefinitionsResponse =
            SubscriptionDefinitionsResponse.builder()
                .addSubscriptionDefinition(
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
                )
                .build()

        assertThat(subscriptionDefinitionsResponse.subscriptionDefinitions())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionDefinitionsResponse =
            SubscriptionDefinitionsResponse.builder()
                .addSubscriptionDefinition(
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
                )
                .build()

        val roundtrippedSubscriptionDefinitionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionDefinitionsResponse),
                jacksonTypeRef<SubscriptionDefinitionsResponse>(),
            )

        assertThat(roundtrippedSubscriptionDefinitionsResponse)
            .isEqualTo(subscriptionDefinitionsResponse)
    }
}
