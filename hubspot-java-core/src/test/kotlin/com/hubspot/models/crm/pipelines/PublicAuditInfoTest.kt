// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAuditInfoTest {

    @Test
    fun create() {
        val publicAuditInfo =
            PublicAuditInfo.builder()
                .action("action")
                .identifier("identifier")
                .portalId(0)
                .fromUserId(0)
                .message("message")
                .rawObject(JsonValue.from(mapOf<String, Any>()))
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicAuditInfo.action()).isEqualTo("action")
        assertThat(publicAuditInfo.identifier()).isEqualTo("identifier")
        assertThat(publicAuditInfo.portalId()).isEqualTo(0)
        assertThat(publicAuditInfo.fromUserId()).contains(0)
        assertThat(publicAuditInfo.message()).contains("message")
        assertThat(publicAuditInfo._rawObject()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicAuditInfo.timestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAuditInfo =
            PublicAuditInfo.builder()
                .action("action")
                .identifier("identifier")
                .portalId(0)
                .fromUserId(0)
                .message("message")
                .rawObject(JsonValue.from(mapOf<String, Any>()))
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicAuditInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAuditInfo),
                jacksonTypeRef<PublicAuditInfo>(),
            )

        assertThat(roundtrippedPublicAuditInfo).isEqualTo(publicAuditInfo)
    }
}
