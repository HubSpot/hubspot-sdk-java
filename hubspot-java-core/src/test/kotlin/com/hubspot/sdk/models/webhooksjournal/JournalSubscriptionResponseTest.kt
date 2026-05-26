// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooksjournal

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JournalSubscriptionResponseTest {

    @Test
    fun create() {
        val journalSubscriptionResponse =
            JournalSubscriptionResponse.builder()
                .id(0L)
                .addAction(JournalSubscriptionResponse.Action.CREATE)
                .appId(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectTypeId("objectTypeId")
                .subscriptionType(JournalSubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT)
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

        assertThat(journalSubscriptionResponse.id()).isEqualTo(0L)
        assertThat(journalSubscriptionResponse.actions())
            .containsExactly(JournalSubscriptionResponse.Action.CREATE)
        assertThat(journalSubscriptionResponse.appId()).isEqualTo(0L)
        assertThat(journalSubscriptionResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(journalSubscriptionResponse.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(journalSubscriptionResponse.subscriptionType())
            .isEqualTo(JournalSubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT)
        assertThat(journalSubscriptionResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(journalSubscriptionResponse.actionOverrides())
            .contains(
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
        assertThat(journalSubscriptionResponse.associatedObjectTypeIds().getOrNull())
            .containsExactly("string")
        assertThat(journalSubscriptionResponse.createdBy()).contains(0L)
        assertThat(journalSubscriptionResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(journalSubscriptionResponse.listIds().getOrNull()).containsExactly(0L)
        assertThat(journalSubscriptionResponse.objectIds().getOrNull()).containsExactly(0L)
        assertThat(journalSubscriptionResponse.portalId()).contains(0L)
        assertThat(journalSubscriptionResponse.properties().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journalSubscriptionResponse =
            JournalSubscriptionResponse.builder()
                .id(0L)
                .addAction(JournalSubscriptionResponse.Action.CREATE)
                .appId(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectTypeId("objectTypeId")
                .subscriptionType(JournalSubscriptionResponse.SubscriptionType.APP_LIFECYCLE_EVENT)
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

        val roundtrippedJournalSubscriptionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journalSubscriptionResponse),
                jacksonTypeRef<JournalSubscriptionResponse>(),
            )

        assertThat(roundtrippedJournalSubscriptionResponse).isEqualTo(journalSubscriptionResponse)
    }
}
