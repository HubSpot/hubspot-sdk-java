// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.PropertyValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicImportErrorTest {

    @Test
    fun create() {
        val publicImportError =
            PublicImportError.builder()
                .id("id")
                .createdAt(0L)
                .errorType(PublicImportError.ErrorType.AMBIGUOUS_ENUMERATION_OPTION)
                .sourceData(
                    ImportRowCore.builder()
                        .addAdditionalRowData("string")
                        .containsEncryptedProperties(true)
                        .fileId(0L)
                        .lineNumber(0)
                        .addRowData("string")
                        .pageName("pageName")
                        .build()
                )
                .errorMessage("errorMessage")
                .extraContext("extraContext")
                .invalidPropertyValue(
                    PropertyValue.builder()
                        .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                        .isEncrypted(true)
                        .isLargeValue(true)
                        .name("name")
                        .persistenceTimestamp(0L)
                        .requestId("requestId")
                        .selectedByUser(true)
                        .selectedByUserTimestamp(0L)
                        .source(PropertyValue.Source.ACADEMY)
                        .sourceId("sourceId")
                        .sourceLabel("sourceLabel")
                        .sourceMetadata("sourceMetadata")
                        .sourceUpstreamDeployable("sourceUpstreamDeployable")
                        .addSourceVid(0L)
                        .timestamp(0L)
                        .unit("unit")
                        .updatedByUserId(0)
                        .useTimestampAsPersistenceTimestamp(true)
                        .value("value")
                        .build()
                )
                .invalidValue("invalidValue")
                .invalidValueToDisplay("invalidValueToDisplay")
                .knownColumnNumber(0)
                .objectType(PublicImportError.ObjectType.ABANDONED_CART)
                .objectTypeId("objectTypeId")
                .build()

        assertThat(publicImportError.id()).isEqualTo("id")
        assertThat(publicImportError.createdAt()).isEqualTo(0L)
        assertThat(publicImportError.errorType())
            .isEqualTo(PublicImportError.ErrorType.AMBIGUOUS_ENUMERATION_OPTION)
        assertThat(publicImportError.sourceData())
            .isEqualTo(
                ImportRowCore.builder()
                    .addAdditionalRowData("string")
                    .containsEncryptedProperties(true)
                    .fileId(0L)
                    .lineNumber(0)
                    .addRowData("string")
                    .pageName("pageName")
                    .build()
            )
        assertThat(publicImportError.errorMessage()).contains("errorMessage")
        assertThat(publicImportError.extraContext()).contains("extraContext")
        assertThat(publicImportError.invalidPropertyValue())
            .contains(
                PropertyValue.builder()
                    .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                    .isEncrypted(true)
                    .isLargeValue(true)
                    .name("name")
                    .persistenceTimestamp(0L)
                    .requestId("requestId")
                    .selectedByUser(true)
                    .selectedByUserTimestamp(0L)
                    .source(PropertyValue.Source.ACADEMY)
                    .sourceId("sourceId")
                    .sourceLabel("sourceLabel")
                    .sourceMetadata("sourceMetadata")
                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                    .addSourceVid(0L)
                    .timestamp(0L)
                    .unit("unit")
                    .updatedByUserId(0)
                    .useTimestampAsPersistenceTimestamp(true)
                    .value("value")
                    .build()
            )
        assertThat(publicImportError.invalidValue()).contains("invalidValue")
        assertThat(publicImportError.invalidValueToDisplay()).contains("invalidValueToDisplay")
        assertThat(publicImportError.knownColumnNumber()).contains(0)
        assertThat(publicImportError.objectType())
            .contains(PublicImportError.ObjectType.ABANDONED_CART)
        assertThat(publicImportError.objectTypeId()).contains("objectTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicImportError =
            PublicImportError.builder()
                .id("id")
                .createdAt(0L)
                .errorType(PublicImportError.ErrorType.AMBIGUOUS_ENUMERATION_OPTION)
                .sourceData(
                    ImportRowCore.builder()
                        .addAdditionalRowData("string")
                        .containsEncryptedProperties(true)
                        .fileId(0L)
                        .lineNumber(0)
                        .addRowData("string")
                        .pageName("pageName")
                        .build()
                )
                .errorMessage("errorMessage")
                .extraContext("extraContext")
                .invalidPropertyValue(
                    PropertyValue.builder()
                        .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                        .isEncrypted(true)
                        .isLargeValue(true)
                        .name("name")
                        .persistenceTimestamp(0L)
                        .requestId("requestId")
                        .selectedByUser(true)
                        .selectedByUserTimestamp(0L)
                        .source(PropertyValue.Source.ACADEMY)
                        .sourceId("sourceId")
                        .sourceLabel("sourceLabel")
                        .sourceMetadata("sourceMetadata")
                        .sourceUpstreamDeployable("sourceUpstreamDeployable")
                        .addSourceVid(0L)
                        .timestamp(0L)
                        .unit("unit")
                        .updatedByUserId(0)
                        .useTimestampAsPersistenceTimestamp(true)
                        .value("value")
                        .build()
                )
                .invalidValue("invalidValue")
                .invalidValueToDisplay("invalidValueToDisplay")
                .knownColumnNumber(0)
                .objectType(PublicImportError.ObjectType.ABANDONED_CART)
                .objectTypeId("objectTypeId")
                .build()

        val roundtrippedPublicImportError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicImportError),
                jacksonTypeRef<PublicImportError>(),
            )

        assertThat(roundtrippedPublicImportError).isEqualTo(publicImportError)
    }
}
