// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.marketing.events.PropertyValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicImportErrorForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicImportErrorForwardPaging =
            CollectionResponsePublicImportErrorForwardPaging.builder()
                .addResult(
                    PublicImportError.builder()
                        .id("id")
                        .createdAt(0)
                        .errorType(PublicImportError.ErrorType.AMBIGUOUS_ENUMERATION_OPTION)
                        .sourceData(
                            ImportRowCore.builder()
                                .containsEncryptedProperties(true)
                                .fileId(0)
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
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicImportErrorForwardPaging.results())
            .containsExactly(
                PublicImportError.builder()
                    .id("id")
                    .createdAt(0)
                    .errorType(PublicImportError.ErrorType.AMBIGUOUS_ENUMERATION_OPTION)
                    .sourceData(
                        ImportRowCore.builder()
                            .containsEncryptedProperties(true)
                            .fileId(0)
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
            )
        assertThat(collectionResponsePublicImportErrorForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicImportErrorForwardPaging =
            CollectionResponsePublicImportErrorForwardPaging.builder()
                .addResult(
                    PublicImportError.builder()
                        .id("id")
                        .createdAt(0)
                        .errorType(PublicImportError.ErrorType.AMBIGUOUS_ENUMERATION_OPTION)
                        .sourceData(
                            ImportRowCore.builder()
                                .containsEncryptedProperties(true)
                                .fileId(0)
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
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicImportErrorForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicImportErrorForwardPaging),
                jacksonTypeRef<CollectionResponsePublicImportErrorForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicImportErrorForwardPaging)
            .isEqualTo(collectionResponsePublicImportErrorForwardPaging)
    }
}
