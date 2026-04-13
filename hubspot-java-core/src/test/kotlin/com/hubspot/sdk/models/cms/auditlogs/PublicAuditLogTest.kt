// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAuditLogTest {

    @Test
    fun create() {
        val publicAuditLog =
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

        assertThat(publicAuditLog.event()).isEqualTo(PublicAuditLog.Event.CREATED)
        assertThat(publicAuditLog.fullName()).isEqualTo("fullName")
        assertThat(publicAuditLog._meta()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicAuditLog.objectId()).isEqualTo("objectId")
        assertThat(publicAuditLog.objectName()).isEqualTo("objectName")
        assertThat(publicAuditLog.objectType()).isEqualTo(PublicAuditLog.ObjectType.BLOG)
        assertThat(publicAuditLog.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicAuditLog.userId()).isEqualTo("userId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAuditLog =
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

        val roundtrippedPublicAuditLog =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAuditLog),
                jacksonTypeRef<PublicAuditLog>(),
            )

        assertThat(roundtrippedPublicAuditLog).isEqualTo(publicAuditLog)
    }
}
