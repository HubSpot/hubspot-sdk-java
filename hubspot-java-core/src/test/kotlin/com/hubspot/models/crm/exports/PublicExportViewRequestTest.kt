// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.crm.Filter
import com.hubspot.models.crm.FilterGroup
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicExportViewRequestTest {

    @Test
    fun create() {
        val publicExportViewRequest =
            PublicExportViewRequest.builder()
                .addAssociatedObjectType("string")
                .addExportInternalValuesOption(
                    PublicExportViewRequest.ExportInternalValuesOption.NAMES
                )
                .exportName("exportName")
                .exportType(PublicExportViewRequest.ExportType.VIEW)
                .format(PublicExportViewRequest.Format.XLS)
                .includeLabeledAssociations(true)
                .includePrimaryDisplayPropertyForAssociatedObjects(true)
                .language(PublicExportViewRequest.Language.EN)
                .addObjectProperty("string")
                .objectType("objectType")
                .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                .publicCrmSearchRequest(
                    PublicCrmSearchRequest.builder()
                        .addFilterGroup(
                            FilterGroup.builder()
                                .addFilter(
                                    Filter.builder()
                                        .operator(Filter.Operator.BETWEEN)
                                        .propertyName("propertyName")
                                        .highValue("highValue")
                                        .value("value")
                                        .addValue("string")
                                        .build()
                                )
                                .build()
                        )
                        .addFilter(
                            Filter.builder()
                                .operator(Filter.Operator.BETWEEN)
                                .propertyName("propertyName")
                                .highValue("highValue")
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .addSort("string")
                        .query("query")
                        .build()
                )
                .build()

        assertThat(publicExportViewRequest.associatedObjectType()).containsExactly("string")
        assertThat(publicExportViewRequest.exportInternalValuesOptions())
            .containsExactly(PublicExportViewRequest.ExportInternalValuesOption.NAMES)
        assertThat(publicExportViewRequest.exportName()).isEqualTo("exportName")
        assertThat(publicExportViewRequest.exportType())
            .isEqualTo(PublicExportViewRequest.ExportType.VIEW)
        assertThat(publicExportViewRequest.format()).isEqualTo(PublicExportViewRequest.Format.XLS)
        assertThat(publicExportViewRequest.includeLabeledAssociations()).isEqualTo(true)
        assertThat(publicExportViewRequest.includePrimaryDisplayPropertyForAssociatedObjects())
            .isEqualTo(true)
        assertThat(publicExportViewRequest.language())
            .isEqualTo(PublicExportViewRequest.Language.EN)
        assertThat(publicExportViewRequest.objectProperties()).containsExactly("string")
        assertThat(publicExportViewRequest.objectType()).isEqualTo("objectType")
        assertThat(publicExportViewRequest.overrideAssociatedObjectsPerDefinitionPerRowLimit())
            .isEqualTo(true)
        assertThat(publicExportViewRequest.publicCrmSearchRequest())
            .contains(
                PublicCrmSearchRequest.builder()
                    .addFilterGroup(
                        FilterGroup.builder()
                            .addFilter(
                                Filter.builder()
                                    .operator(Filter.Operator.BETWEEN)
                                    .propertyName("propertyName")
                                    .highValue("highValue")
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .addFilter(
                        Filter.builder()
                            .operator(Filter.Operator.BETWEEN)
                            .propertyName("propertyName")
                            .highValue("highValue")
                            .value("value")
                            .addValue("string")
                            .build()
                    )
                    .addSort("string")
                    .query("query")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicExportViewRequest =
            PublicExportViewRequest.builder()
                .addAssociatedObjectType("string")
                .addExportInternalValuesOption(
                    PublicExportViewRequest.ExportInternalValuesOption.NAMES
                )
                .exportName("exportName")
                .exportType(PublicExportViewRequest.ExportType.VIEW)
                .format(PublicExportViewRequest.Format.XLS)
                .includeLabeledAssociations(true)
                .includePrimaryDisplayPropertyForAssociatedObjects(true)
                .language(PublicExportViewRequest.Language.EN)
                .addObjectProperty("string")
                .objectType("objectType")
                .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                .publicCrmSearchRequest(
                    PublicCrmSearchRequest.builder()
                        .addFilterGroup(
                            FilterGroup.builder()
                                .addFilter(
                                    Filter.builder()
                                        .operator(Filter.Operator.BETWEEN)
                                        .propertyName("propertyName")
                                        .highValue("highValue")
                                        .value("value")
                                        .addValue("string")
                                        .build()
                                )
                                .build()
                        )
                        .addFilter(
                            Filter.builder()
                                .operator(Filter.Operator.BETWEEN)
                                .propertyName("propertyName")
                                .highValue("highValue")
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .addSort("string")
                        .query("query")
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
