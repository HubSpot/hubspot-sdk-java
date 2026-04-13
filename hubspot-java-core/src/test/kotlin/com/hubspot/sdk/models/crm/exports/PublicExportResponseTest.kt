// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicExportResponseTest {

    @Test
    fun create() {
        val publicExportResponse =
            PublicExportResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .exportState(PublicExportResponse.ExportState.CANCELED)
                .exportType(PublicExportResponse.ExportType.LIST)
                .addObjectProperty("string")
                .objectType("objectType")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .exportName("exportName")
                .recordCount(0)
                .build()

        assertThat(publicExportResponse.id()).isEqualTo("id")
        assertThat(publicExportResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicExportResponse.exportState())
            .isEqualTo(PublicExportResponse.ExportState.CANCELED)
        assertThat(publicExportResponse.exportType())
            .isEqualTo(PublicExportResponse.ExportType.LIST)
        assertThat(publicExportResponse.objectProperties()).containsExactly("string")
        assertThat(publicExportResponse.objectType()).isEqualTo("objectType")
        assertThat(publicExportResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicExportResponse.exportName()).contains("exportName")
        assertThat(publicExportResponse.recordCount()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicExportResponse =
            PublicExportResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .exportState(PublicExportResponse.ExportState.CANCELED)
                .exportType(PublicExportResponse.ExportType.LIST)
                .addObjectProperty("string")
                .objectType("objectType")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .exportName("exportName")
                .recordCount(0)
                .build()

        val roundtrippedPublicExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicExportResponse),
                jacksonTypeRef<PublicExportResponse>(),
            )

        assertThat(roundtrippedPublicExportResponse).isEqualTo(publicExportResponse)
    }
}
