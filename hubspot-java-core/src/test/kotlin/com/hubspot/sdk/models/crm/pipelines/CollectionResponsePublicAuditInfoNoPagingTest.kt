// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicAuditInfoNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicAuditInfoNoPaging =
            CollectionResponsePublicAuditInfoNoPaging.builder()
                .addResult(
                    PublicAuditInfo.builder()
                        .action("action")
                        .identifier("identifier")
                        .portalId(0)
                        .fromUserId(0)
                        .message("message")
                        .rawObject(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicAuditInfoNoPaging.results())
            .containsExactly(
                PublicAuditInfo.builder()
                    .action("action")
                    .identifier("identifier")
                    .portalId(0)
                    .fromUserId(0)
                    .message("message")
                    .rawObject(JsonValue.from(mapOf<String, Any>()))
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicAuditInfoNoPaging =
            CollectionResponsePublicAuditInfoNoPaging.builder()
                .addResult(
                    PublicAuditInfo.builder()
                        .action("action")
                        .identifier("identifier")
                        .portalId(0)
                        .fromUserId(0)
                        .message("message")
                        .rawObject(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicAuditInfoNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicAuditInfoNoPaging),
                jacksonTypeRef<CollectionResponsePublicAuditInfoNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicAuditInfoNoPaging)
            .isEqualTo(collectionResponsePublicAuditInfoNoPaging)
    }
}
