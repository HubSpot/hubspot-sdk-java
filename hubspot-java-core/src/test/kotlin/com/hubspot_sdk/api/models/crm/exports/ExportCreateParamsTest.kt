// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.exports

import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportCreateParamsTest {

    @Test
    fun create() {
        ExportCreateParams.builder()
            .publicExportRequest(
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
                                            .operator(Filter.Operator.EQ)
                                            .propertyName("")
                                            .highValue("")
                                            .value("")
                                            .addValue("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .addFilter(
                                Filter.builder()
                                    .operator(Filter.Operator.EQ)
                                    .propertyName("")
                                    .highValue("")
                                    .value("")
                                    .addValue("string")
                                    .build()
                            )
                            .addSort("string")
                            .query("query")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExportCreateParams.builder()
                .publicExportRequest(
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
                                                .operator(Filter.Operator.EQ)
                                                .propertyName("")
                                                .highValue("")
                                                .value("")
                                                .addValue("string")
                                                .build()
                                        )
                                        .build()
                                )
                                .addFilter(
                                    Filter.builder()
                                        .operator(Filter.Operator.EQ)
                                        .propertyName("")
                                        .highValue("")
                                        .value("")
                                        .addValue("string")
                                        .build()
                                )
                                .addSort("string")
                                .query("query")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicExportRequest.ofView(
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
                                                .operator(Filter.Operator.EQ)
                                                .propertyName("")
                                                .highValue("")
                                                .value("")
                                                .addValue("string")
                                                .build()
                                        )
                                        .build()
                                )
                                .addFilter(
                                    Filter.builder()
                                        .operator(Filter.Operator.EQ)
                                        .propertyName("")
                                        .highValue("")
                                        .value("")
                                        .addValue("string")
                                        .build()
                                )
                                .addSort("string")
                                .query("query")
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExportCreateParams.builder()
                .publicExportRequest(
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicExportRequest.ofView(
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
                        .build()
                )
            )
    }
}
