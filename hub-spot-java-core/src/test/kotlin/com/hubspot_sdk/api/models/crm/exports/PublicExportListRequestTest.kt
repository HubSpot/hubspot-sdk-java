// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicExportListRequestTest {

    @Test
    fun create() {
        val publicExportListRequest =
            PublicExportListRequest.builder()
                .addExportInternalValuesOption(
                    PublicExportListRequest.ExportInternalValuesOption.NAMES
                )
                .exportName("exportName")
                .exportType(PublicExportListRequest.ExportType.LIST)
                .format(PublicExportListRequest.Format.XLS)
                .language(PublicExportListRequest.Language.EN)
                .listId("listId")
                .addObjectProperty("string")
                .objectType("objectType")
                .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                .associatedObjectType("associatedObjectType")
                .build()

        assertThat(publicExportListRequest.exportInternalValuesOptions())
            .containsExactly(PublicExportListRequest.ExportInternalValuesOption.NAMES)
        assertThat(publicExportListRequest.exportName()).isEqualTo("exportName")
        assertThat(publicExportListRequest.exportType())
            .isEqualTo(PublicExportListRequest.ExportType.LIST)
        assertThat(publicExportListRequest.format()).isEqualTo(PublicExportListRequest.Format.XLS)
        assertThat(publicExportListRequest.language())
            .isEqualTo(PublicExportListRequest.Language.EN)
        assertThat(publicExportListRequest.listId()).isEqualTo("listId")
        assertThat(publicExportListRequest.objectProperties()).containsExactly("string")
        assertThat(publicExportListRequest.objectType()).isEqualTo("objectType")
        assertThat(publicExportListRequest.overrideAssociatedObjectsPerDefinitionPerRowLimit())
            .isEqualTo(true)
        assertThat(publicExportListRequest.associatedObjectType()).contains("associatedObjectType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicExportListRequest =
            PublicExportListRequest.builder()
                .addExportInternalValuesOption(
                    PublicExportListRequest.ExportInternalValuesOption.NAMES
                )
                .exportName("exportName")
                .exportType(PublicExportListRequest.ExportType.LIST)
                .format(PublicExportListRequest.Format.XLS)
                .language(PublicExportListRequest.Language.EN)
                .listId("listId")
                .addObjectProperty("string")
                .objectType("objectType")
                .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                .associatedObjectType("associatedObjectType")
                .build()

        val roundtrippedPublicExportListRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicExportListRequest),
                jacksonTypeRef<PublicExportListRequest>(),
            )

        assertThat(roundtrippedPublicExportListRequest).isEqualTo(publicExportListRequest)
    }
}
