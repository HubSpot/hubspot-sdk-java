// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionResponse1Test {

    @Test
    fun create() {
        val subscriptionResponse1 =
            SubscriptionResponse1.builder()
                .id(0L)
                .addAction(SubscriptionResponse1.Action.CREATE)
                .appId(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectTypeId("objectTypeId")
                .subscriptionType(SubscriptionResponse1.SubscriptionType.APP_LIFECYCLE_EVENT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .actionOverrides(
                    SubscriptionResponse1.ActionOverrides.builder()
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

        assertThat(subscriptionResponse1.id()).isEqualTo(0L)
        assertThat(subscriptionResponse1.actions())
            .containsExactly(SubscriptionResponse1.Action.CREATE)
        assertThat(subscriptionResponse1.appId()).isEqualTo(0L)
        assertThat(subscriptionResponse1.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionResponse1.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(subscriptionResponse1.subscriptionType())
            .isEqualTo(SubscriptionResponse1.SubscriptionType.APP_LIFECYCLE_EVENT)
        assertThat(subscriptionResponse1.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionResponse1.actionOverrides())
            .contains(
                SubscriptionResponse1.ActionOverrides.builder()
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
        assertThat(subscriptionResponse1.associatedObjectTypeIds().getOrNull())
            .containsExactly("string")
        assertThat(subscriptionResponse1.createdBy()).contains(0L)
        assertThat(subscriptionResponse1.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionResponse1.listIds().getOrNull()).containsExactly(0L)
        assertThat(subscriptionResponse1.objectIds().getOrNull()).containsExactly(0L)
        assertThat(subscriptionResponse1.portalId()).contains(0L)
        assertThat(subscriptionResponse1.properties().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionResponse1 =
            SubscriptionResponse1.builder()
                .id(0L)
                .addAction(SubscriptionResponse1.Action.CREATE)
                .appId(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectTypeId("objectTypeId")
                .subscriptionType(SubscriptionResponse1.SubscriptionType.APP_LIFECYCLE_EVENT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .actionOverrides(
                    SubscriptionResponse1.ActionOverrides.builder()
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

        val roundtrippedSubscriptionResponse1 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionResponse1),
                jacksonTypeRef<SubscriptionResponse1>(),
            )

        assertThat(roundtrippedSubscriptionResponse1).isEqualTo(subscriptionResponse1)
    }
}
