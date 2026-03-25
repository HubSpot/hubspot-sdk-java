// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderUpdateTaskLocatorTest {

    @Test
    fun create() {
        val folderUpdateTaskLocator =
            FolderUpdateTaskLocator.builder()
                .id("id")
                .links(
                    FolderUpdateTaskLocator.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(folderUpdateTaskLocator.id()).isEqualTo("id")
        assertThat(folderUpdateTaskLocator.links())
            .contains(
                FolderUpdateTaskLocator.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderUpdateTaskLocator =
            FolderUpdateTaskLocator.builder()
                .id("id")
                .links(
                    FolderUpdateTaskLocator.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedFolderUpdateTaskLocator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderUpdateTaskLocator),
                jacksonTypeRef<FolderUpdateTaskLocator>(),
            )

        assertThat(roundtrippedFolderUpdateTaskLocator).isEqualTo(folderUpdateTaskLocator)
    }
}
