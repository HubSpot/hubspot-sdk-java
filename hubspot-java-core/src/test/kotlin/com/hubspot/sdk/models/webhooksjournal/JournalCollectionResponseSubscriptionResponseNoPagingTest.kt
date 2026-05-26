// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooksjournal

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JournalCollectionResponseSubscriptionResponseNoPagingTest {

    @Test
    fun create() {
        val journalCollectionResponseSubscriptionResponseNoPaging =
            JournalCollectionResponseSubscriptionResponseNoPaging.builder()
                .addResult(
                    JournalSubscriptionResponse.builder()
                        .id(0L)
                        .addAction(JournalSubscriptionResponse.Action.CREATE)
                        .appId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .objectTypeId("objectTypeId")
                        .subscriptionType(
                            JournalSubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .actionOverrides(
                            JournalSubscriptionResponse.ActionOverrides.builder()
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

        assertThat(journalCollectionResponseSubscriptionResponseNoPaging.results())
            .containsExactly(
                JournalSubscriptionResponse.builder()
                    .id(0L)
                    .addAction(JournalSubscriptionResponse.Action.CREATE)
                    .appId(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .objectTypeId("objectTypeId")
                    .subscriptionType(
                        JournalSubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .actionOverrides(
                        JournalSubscriptionResponse.ActionOverrides.builder()
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
        val journalCollectionResponseSubscriptionResponseNoPaging =
            JournalCollectionResponseSubscriptionResponseNoPaging.builder()
                .addResult(
                    JournalSubscriptionResponse.builder()
                        .id(0L)
                        .addAction(JournalSubscriptionResponse.Action.CREATE)
                        .appId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .objectTypeId("objectTypeId")
                        .subscriptionType(
                            JournalSubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .actionOverrides(
                            JournalSubscriptionResponse.ActionOverrides.builder()
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

        val roundtrippedJournalCollectionResponseSubscriptionResponseNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    journalCollectionResponseSubscriptionResponseNoPaging
                ),
                jacksonTypeRef<JournalCollectionResponseSubscriptionResponseNoPaging>(),
            )

        assertThat(roundtrippedJournalCollectionResponseSubscriptionResponseNoPaging)
            .isEqualTo(journalCollectionResponseSubscriptionResponseNoPaging)
    }
}
