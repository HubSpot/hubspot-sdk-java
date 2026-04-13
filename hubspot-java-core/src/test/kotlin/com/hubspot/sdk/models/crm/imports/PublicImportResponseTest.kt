// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicImportResponseTest {

    @Test
    fun create() {
        val publicImportResponse =
            PublicImportResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMappedObjectTypeId("string")
                .metadata(
                    PublicImportMetadata.builder()
                        .counters(
                            PublicImportMetadata.Counters.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .addFileId("string")
                        .addObjectList(
                            PublicObjectListRecord.builder()
                                .listId("listId")
                                .objectType("objectType")
                                .build()
                        )
                        .build()
                )
                .optOutImport(true)
                .state(PublicImportResponse.State.CANCELED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .importName("importName")
                .importRequestJson(JsonValue.from(mapOf<String, Any>()))
                .importSource(PublicImportResponse.ImportSource.API)
                .importTemplate(
                    ImportTemplate.builder()
                        .templateId(0)
                        .templateType(ImportTemplate.TemplateType.ADMIN_DEFINED)
                        .build()
                )
                .build()

        assertThat(publicImportResponse.id()).isEqualTo("id")
        assertThat(publicImportResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicImportResponse.mappedObjectTypeIds()).containsExactly("string")
        assertThat(publicImportResponse.metadata())
            .isEqualTo(
                PublicImportMetadata.builder()
                    .counters(
                        PublicImportMetadata.Counters.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .addFileId("string")
                    .addObjectList(
                        PublicObjectListRecord.builder()
                            .listId("listId")
                            .objectType("objectType")
                            .build()
                    )
                    .build()
            )
        assertThat(publicImportResponse.optOutImport()).isEqualTo(true)
        assertThat(publicImportResponse.state()).isEqualTo(PublicImportResponse.State.CANCELED)
        assertThat(publicImportResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicImportResponse.importName()).contains("importName")
        assertThat(publicImportResponse._importRequestJson())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicImportResponse.importSource())
            .contains(PublicImportResponse.ImportSource.API)
        assertThat(publicImportResponse.importTemplate())
            .contains(
                ImportTemplate.builder()
                    .templateId(0)
                    .templateType(ImportTemplate.TemplateType.ADMIN_DEFINED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicImportResponse =
            PublicImportResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMappedObjectTypeId("string")
                .metadata(
                    PublicImportMetadata.builder()
                        .counters(
                            PublicImportMetadata.Counters.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .addFileId("string")
                        .addObjectList(
                            PublicObjectListRecord.builder()
                                .listId("listId")
                                .objectType("objectType")
                                .build()
                        )
                        .build()
                )
                .optOutImport(true)
                .state(PublicImportResponse.State.CANCELED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .importName("importName")
                .importRequestJson(JsonValue.from(mapOf<String, Any>()))
                .importSource(PublicImportResponse.ImportSource.API)
                .importTemplate(
                    ImportTemplate.builder()
                        .templateId(0)
                        .templateType(ImportTemplate.TemplateType.ADMIN_DEFINED)
                        .build()
                )
                .build()

        val roundtrippedPublicImportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicImportResponse),
                jacksonTypeRef<PublicImportResponse>(),
            )

        assertThat(roundtrippedPublicImportResponse).isEqualTo(publicImportResponse)
    }
}
