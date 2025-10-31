// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.crm.Filter
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

        val e = assertThrows<HubspotInvalidDataException> { publicExportRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
