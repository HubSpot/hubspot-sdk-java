// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooksjournal

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionResponseTest {

    @Test
    fun create() {
        val subscriptionResponse =
            SubscriptionResponse.builder()
                .id(0L)
                .addAction(SubscriptionResponse.Action.CREATE)
                .appId(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectTypeId("objectTypeId")
                .subscriptionType(SubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .actionOverrides(
                    SubscriptionResponse.ActionOverrides.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "associatedObjectTypeIds" to listOf("string"),
                                    "listIds" to listOf(0),
                                    "objectIds" to listOf(0),
                                    "properties" to listOf("string"),
                                )
                            ),
                        )
                        .build()
                )
                .addAssociatedObjectTypeId("string")
                .createdBy(0L)
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addListId(0L)
                .addObjectId(0L)
                .portalId(0L)
                .addProperty("string")
                .build()

        assertThat(subscriptionResponse.id()).isEqualTo(0L)
        assertThat(subscriptionResponse.actions())
            .containsExactly(SubscriptionResponse.Action.CREATE)
        assertThat(subscriptionResponse.appId()).isEqualTo(0L)
        assertThat(subscriptionResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionResponse.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(subscriptionResponse.subscriptionType())
            .isEqualTo(SubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT)
        assertThat(subscriptionResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionResponse.actionOverrides())
            .contains(
                SubscriptionResponse.ActionOverrides.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "associatedObjectTypeIds" to listOf("string"),
                                "listIds" to listOf(0),
                                "objectIds" to listOf(0),
                                "properties" to listOf("string"),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(subscriptionResponse.associatedObjectTypeIds().getOrNull())
            .containsExactly("string")
        assertThat(subscriptionResponse.createdBy()).contains(0L)
        assertThat(subscriptionResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionResponse.listIds().getOrNull()).containsExactly(0L)
        assertThat(subscriptionResponse.objectIds().getOrNull()).containsExactly(0L)
        assertThat(subscriptionResponse.portalId()).contains(0L)
        assertThat(subscriptionResponse.properties().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionResponse =
            SubscriptionResponse.builder()
                .id(0L)
                .addAction(SubscriptionResponse.Action.CREATE)
                .appId(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectTypeId("objectTypeId")
                .subscriptionType(SubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .actionOverrides(
                    SubscriptionResponse.ActionOverrides.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "associatedObjectTypeIds" to listOf("string"),
                                    "listIds" to listOf(0),
                                    "objectIds" to listOf(0),
                                    "properties" to listOf("string"),
                                )
                            ),
                        )
                        .build()
                )
                .addAssociatedObjectTypeId("string")
                .createdBy(0L)
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addListId(0L)
                .addObjectId(0L)
                .portalId(0L)
                .addProperty("string")
                .build()

        val roundtrippedSubscriptionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionResponse),
                jacksonTypeRef<SubscriptionResponse>(),
            )

        assertThat(roundtrippedSubscriptionResponse).isEqualTo(subscriptionResponse)
    }
}
