// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.Paging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditLogListPageResponseTest {

    @Test
    fun create() {
        val auditLogListPageResponse =
            AuditLogListPageResponse.builder()
                .addResult(
                    AuditLogListResponse.builder()
                        .event(AuditLogListResponse.Event.UPDATED)
                        .fullName("John Doe")
                        .objectId("4065364319")
                        .objectName("My Landing Page")
                        .objectType(AuditLogListResponse.ObjectType.LANDING_PAGE)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("1011561")
                        .meta(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(auditLogListPageResponse.results())
            .containsExactly(
                AuditLogListResponse.builder()
                    .event(AuditLogListResponse.Event.UPDATED)
                    .fullName("John Doe")
                    .objectId("4065364319")
                    .objectName("My Landing Page")
                    .objectType(AuditLogListResponse.ObjectType.LANDING_PAGE)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("1011561")
                    .meta(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(auditLogListPageResponse.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditLogListPageResponse =
            AuditLogListPageResponse.builder()
                .addResult(
                    AuditLogListResponse.builder()
                        .event(AuditLogListResponse.Event.UPDATED)
                        .fullName("John Doe")
                        .objectId("4065364319")
                        .objectName("My Landing Page")
                        .objectType(AuditLogListResponse.ObjectType.LANDING_PAGE)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("1011561")
                        .meta(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedAuditLogListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditLogListPageResponse),
                jacksonTypeRef<AuditLogListPageResponse>(),
            )

        assertThat(roundtrippedAuditLogListPageResponse).isEqualTo(auditLogListPageResponse)
    }
}
