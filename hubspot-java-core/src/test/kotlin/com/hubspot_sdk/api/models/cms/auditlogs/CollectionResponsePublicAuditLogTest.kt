// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
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
                        .event(PublicAuditLog.Event.UPDATED)
                        .fullName("John Doe")
                        .objectId("4065364319")
                        .objectName("My Landing Page")
                        .objectType(PublicAuditLog.ObjectType.LANDING_PAGE)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("1011561")
                        .meta(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicAuditLog.results())
            .containsExactly(
                PublicAuditLog.builder()
                    .event(PublicAuditLog.Event.UPDATED)
                    .fullName("John Doe")
                    .objectId("4065364319")
                    .objectName("My Landing Page")
                    .objectType(PublicAuditLog.ObjectType.LANDING_PAGE)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("1011561")
                    .meta(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(collectionResponsePublicAuditLog.paging())
            .contains(
                EmailsPaging.builder()
                    .next(NextPage.builder().after("").link("").build())
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
                        .event(PublicAuditLog.Event.UPDATED)
                        .fullName("John Doe")
                        .objectId("4065364319")
                        .objectName("My Landing Page")
                        .objectType(PublicAuditLog.ObjectType.LANDING_PAGE)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("1011561")
                        .meta(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
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
