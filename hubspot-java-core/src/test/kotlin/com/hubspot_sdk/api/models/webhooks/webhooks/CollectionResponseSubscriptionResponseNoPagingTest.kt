// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseSubscriptionResponseNoPagingTest {

    @Test
    fun create() {
        val collectionResponseSubscriptionResponseNoPaging =
            CollectionResponseSubscriptionResponseNoPaging.builder()
                .addResult(
                    SubscriptionResponse1.builder()
                        .id(0L)
                        .addAction(SubscriptionResponse1.Action.CREATE)
                        .appId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .objectTypeId("objectTypeId")
                        .subscriptionType(
                            SubscriptionResponse1.SubscriptionType.APP_LIFECYCLE_EVENT
                        )
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
                )
                .build()

        assertThat(collectionResponseSubscriptionResponseNoPaging.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseSubscriptionResponseNoPaging =
            CollectionResponseSubscriptionResponseNoPaging.builder()
                .addResult(
                    SubscriptionResponse1.builder()
                        .id(0L)
                        .addAction(SubscriptionResponse1.Action.CREATE)
                        .appId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .objectTypeId("objectTypeId")
                        .subscriptionType(
                            SubscriptionResponse1.SubscriptionType.APP_LIFECYCLE_EVENT
                        )
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
                )
                .build()

        val roundtrippedCollectionResponseSubscriptionResponseNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseSubscriptionResponseNoPaging),
                jacksonTypeRef<CollectionResponseSubscriptionResponseNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseSubscriptionResponseNoPaging)
            .isEqualTo(collectionResponseSubscriptionResponseNoPaging)
    }
}
