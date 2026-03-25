// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicAuditLogTest {

    @Test
    fun create() {
        val collectionResponsePublicAuditLog =
            CollectionResponsePublicAuditLog.builder()
                .addResult(
                    PublicAuditLog.builder()
                        .event(PublicAuditLog.Event.CREATED)
                        .fullName("fullName")
                        .meta(JsonValue.from(mapOf<String, Any>()))
                        .objectId("objectId")
                        .objectName("objectName")
                        .objectType(PublicAuditLog.ObjectType.BLOG)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("userId")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicAuditLog.results())
            .containsExactly(
                PublicAuditLog.builder()
                    .event(PublicAuditLog.Event.CREATED)
                    .fullName("fullName")
                    .meta(JsonValue.from(mapOf<String, Any>()))
                    .objectId("objectId")
                    .objectName("objectName")
                    .objectType(PublicAuditLog.ObjectType.BLOG)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("userId")
                    .build()
            )
        assertThat(collectionResponsePublicAuditLog.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicAuditLog =
            CollectionResponsePublicAuditLog.builder()
                .addResult(
                    PublicAuditLog.builder()
                        .event(PublicAuditLog.Event.CREATED)
                        .fullName("fullName")
                        .meta(JsonValue.from(mapOf<String, Any>()))
                        .objectId("objectId")
                        .objectName("objectName")
                        .objectType(PublicAuditLog.ObjectType.BLOG)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("userId")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicAuditLog =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicAuditLog),
                jacksonTypeRef<CollectionResponsePublicAuditLog>(),
            )

        assertThat(roundtrippedCollectionResponsePublicAuditLog)
            .isEqualTo(collectionResponsePublicAuditLog)
    }
}
