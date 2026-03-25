// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicImportMetadataTest {

    @Test
    fun create() {
        val publicImportMetadata =
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

        assertThat(publicImportMetadata.counters())
            .isEqualTo(
                PublicImportMetadata.Counters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(publicImportMetadata.fileIds()).containsExactly("string")
        assertThat(publicImportMetadata.objectLists())
            .containsExactly(
                PublicObjectListRecord.builder().listId("listId").objectType("objectType").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicImportMetadata =
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

        val roundtrippedPublicImportMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicImportMetadata),
                jacksonTypeRef<PublicImportMetadata>(),
            )

        assertThat(roundtrippedPublicImportMetadata).isEqualTo(publicImportMetadata)
    }
}
