// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditLogListResponseTest {

    @Test
    fun create() {
        val auditLogListResponse =
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

        assertThat(auditLogListResponse.event()).isEqualTo(AuditLogListResponse.Event.UPDATED)
        assertThat(auditLogListResponse.fullName()).isEqualTo("John Doe")
        assertThat(auditLogListResponse.objectId()).isEqualTo("4065364319")
        assertThat(auditLogListResponse.objectName()).isEqualTo("My Landing Page")
        assertThat(auditLogListResponse.objectType())
            .isEqualTo(AuditLogListResponse.ObjectType.LANDING_PAGE)
        assertThat(auditLogListResponse.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(auditLogListResponse.userId()).isEqualTo("1011561")
        assertThat(auditLogListResponse._meta()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditLogListResponse =
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

        val roundtrippedAuditLogListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditLogListResponse),
                jacksonTypeRef<AuditLogListResponse>(),
            )

        assertThat(roundtrippedAuditLogListResponse).isEqualTo(auditLogListResponse)
    }
}
