// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicImportResponseForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicImportResponseForwardPaging =
            CollectionResponsePublicImportResponseForwardPaging.builder()
                .addResult(
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
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicImportResponseForwardPaging.results())
            .containsExactly(
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
            )
        assertThat(collectionResponsePublicImportResponseForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicImportResponseForwardPaging =
            CollectionResponsePublicImportResponseForwardPaging.builder()
                .addResult(
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
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicImportResponseForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicImportResponseForwardPaging),
                jacksonTypeRef<CollectionResponsePublicImportResponseForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicImportResponseForwardPaging)
            .isEqualTo(collectionResponsePublicImportResponseForwardPaging)
    }
}
