// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.Paging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicImportResponseTest {

    @Test
    fun create() {
        val collectionResponsePublicImportResponse =
            CollectionResponsePublicImportResponse.builder()
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
                        .state(PublicImportResponse.State.STARTED)
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
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicImportResponse.results())
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
                    .state(PublicImportResponse.State.STARTED)
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
        assertThat(collectionResponsePublicImportResponse.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicImportResponse =
            CollectionResponsePublicImportResponse.builder()
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
                        .state(PublicImportResponse.State.STARTED)
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
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicImportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicImportResponse),
                jacksonTypeRef<CollectionResponsePublicImportResponse>(),
            )

        assertThat(roundtrippedCollectionResponsePublicImportResponse)
            .isEqualTo(collectionResponsePublicImportResponse)
    }
}
