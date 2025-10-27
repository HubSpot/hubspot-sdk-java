// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAuditLogTest {

    @Test
    fun create() {
        val publicAuditLog =
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

        assertThat(publicAuditLog.event()).isEqualTo(PublicAuditLog.Event.UPDATED)
        assertThat(publicAuditLog.fullName()).isEqualTo("John Doe")
        assertThat(publicAuditLog.objectId()).isEqualTo("4065364319")
        assertThat(publicAuditLog.objectName()).isEqualTo("My Landing Page")
        assertThat(publicAuditLog.objectType()).isEqualTo(PublicAuditLog.ObjectType.LANDING_PAGE)
        assertThat(publicAuditLog.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicAuditLog.userId()).isEqualTo("1011561")
        assertThat(publicAuditLog._meta()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAuditLog =
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

        val roundtrippedPublicAuditLog =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAuditLog),
                jacksonTypeRef<PublicAuditLog>(),
            )

        assertThat(roundtrippedPublicAuditLog).isEqualTo(publicAuditLog)
    }
}
