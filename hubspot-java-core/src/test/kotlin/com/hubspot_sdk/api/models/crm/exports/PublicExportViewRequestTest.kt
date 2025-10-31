// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.crm.Filter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicExportViewRequestTest {

    @Test
    fun create() {
        val publicExportViewRequest =
            PublicExportViewRequest.builder()
                .addExportInternalValuesOption(
                    PublicExportViewRequest.ExportInternalValuesOption.NAMES
                )
                .exportName("exportName")
                .exportType(PublicExportViewRequest.ExportType.VIEW)
                .format(PublicExportViewRequest.Format.XLS)
                .language(PublicExportViewRequest.Language.EN)
                .addObjectProperty("string")
                .objectType("objectType")
                .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                .associatedObjectType("associatedObjectType")
                .publicCrmSearchRequest(
                    PublicCrmSearchRequest.builder()
                        .addFilter(
                            Filter.builder()
                                .operator(Filter.Operator.EQ)
                                .propertyName("")
                                .highValue("")
                                .value("")
                                .addValue("string")
                                .build()
                        )
                        .query("query")
                        .addSort("string")
                        .build()
                )
                .build()

        assertThat(publicExportViewRequest.exportInternalValuesOptions())
            .containsExactly(PublicExportViewRequest.ExportInternalValuesOption.NAMES)
        assertThat(publicExportViewRequest.exportName()).isEqualTo("exportName")
        assertThat(publicExportViewRequest.exportType())
            .isEqualTo(PublicExportViewRequest.ExportType.VIEW)
        assertThat(publicExportViewRequest.format()).isEqualTo(PublicExportViewRequest.Format.XLS)
        assertThat(publicExportViewRequest.language())
            .isEqualTo(PublicExportViewRequest.Language.EN)
        assertThat(publicExportViewRequest.objectProperties()).containsExactly("string")
        assertThat(publicExportViewRequest.objectType()).isEqualTo("objectType")
        assertThat(publicExportViewRequest.overrideAssociatedObjectsPerDefinitionPerRowLimit())
            .isEqualTo(true)
        assertThat(publicExportViewRequest.associatedObjectType()).contains("associatedObjectType")
        assertThat(publicExportViewRequest.publicCrmSearchRequest())
            .contains(
                PublicCrmSearchRequest.builder()
                    .addFilter(
                        Filter.builder()
                            .operator(Filter.Operator.EQ)
                            .propertyName("")
                            .highValue("")
                            .value("")
                            .addValue("string")
                            .build()
                    )
                    .query("query")
                    .addSort("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicExportViewRequest =
            PublicExportViewRequest.builder()
                .addExportInternalValuesOption(
                    PublicExportViewRequest.ExportInternalValuesOption.NAMES
                )
                .exportName("exportName")
                .exportType(PublicExportViewRequest.ExportType.VIEW)
                .format(PublicExportViewRequest.Format.XLS)
                .language(PublicExportViewRequest.Language.EN)
                .addObjectProperty("string")
                .objectType("objectType")
                .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                .associatedObjectType("associatedObjectType")
                .publicCrmSearchRequest(
                    PublicCrmSearchRequest.builder()
                        .addFilter(
                            Filter.builder()
                                .operator(Filter.Operator.EQ)
                                .propertyName("")
                                .highValue("")
                                .value("")
                                .addValue("string")
                                .build()
                        )
                        .query("query")
                        .addSort("string")
                        .build()
                )
                .build()

        val roundtrippedPublicExportViewRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicExportViewRequest),
                jacksonTypeRef<PublicExportViewRequest>(),
            )

        assertThat(roundtrippedPublicExportViewRequest).isEqualTo(publicExportViewRequest)
    }
}
