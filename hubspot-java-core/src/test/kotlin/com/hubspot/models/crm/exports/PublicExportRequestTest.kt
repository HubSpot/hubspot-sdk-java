// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.errors.HubSpotInvalidDataException
import com.hubspot.models.crm.Filter
import com.hubspot.models.crm.FilterGroup
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PublicExportRequestTest {

    @Test
    fun ofView() {
        val view =
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

        val publicExportRequest = PublicExportRequest.ofView(view)

        assertThat(publicExportRequest.view()).contains(view)
        assertThat(publicExportRequest.list()).isEmpty
    }

    @Test
    fun ofViewRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicExportRequest =
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
            )

        val roundtrippedPublicExportRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicExportRequest),
                jacksonTypeRef<PublicExportRequest>(),
            )

        assertThat(roundtrippedPublicExportRequest).isEqualTo(publicExportRequest)
    }

    @Test
    fun ofList() {
        val list =
            PublicExportListRequest.builder()
                .addAssociatedObjectType("string")
                .addExportInternalValuesOption(
                    PublicExportListRequest.ExportInternalValuesOption.NAMES
                )
                .exportName("exportName")
                .exportType(PublicExportListRequest.ExportType.LIST)
                .format(PublicExportListRequest.Format.XLS)
                .includeLabeledAssociations(true)
                .includePrimaryDisplayPropertyForAssociatedObjects(true)
                .language(PublicExportListRequest.Language.EN)
                .listId("listId")
                .addObjectProperty("string")
                .objectType("objectType")
                .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                .build()

        val publicExportRequest = PublicExportRequest.ofList(list)

        assertThat(publicExportRequest.view()).isEmpty
        assertThat(publicExportRequest.list()).contains(list)
    }

    @Test
    fun ofListRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicExportRequest =
            PublicExportRequest.ofList(
                PublicExportListRequest.builder()
                    .addAssociatedObjectType("string")
                    .addExportInternalValuesOption(
                        PublicExportListRequest.ExportInternalValuesOption.NAMES
                    )
                    .exportName("exportName")
                    .exportType(PublicExportListRequest.ExportType.LIST)
                    .format(PublicExportListRequest.Format.XLS)
                    .includeLabeledAssociations(true)
                    .includePrimaryDisplayPropertyForAssociatedObjects(true)
                    .language(PublicExportListRequest.Language.EN)
                    .listId("listId")
                    .addObjectProperty("string")
                    .objectType("objectType")
                    .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                    .build()
            )

        val roundtrippedPublicExportRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicExportRequest),
                jacksonTypeRef<PublicExportRequest>(),
            )

        assertThat(roundtrippedPublicExportRequest).isEqualTo(publicExportRequest)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val publicExportRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PublicExportRequest>())

        val e = assertThrows<HubSpotInvalidDataException> { publicExportRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
