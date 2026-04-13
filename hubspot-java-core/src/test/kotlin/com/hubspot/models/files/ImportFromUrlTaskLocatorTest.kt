// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportFromUrlTaskLocatorTest {

    @Test
    fun create() {
        val importFromUrlTaskLocator =
            ImportFromUrlTaskLocator.builder()
                .id("id")
                .links(
                    ImportFromUrlTaskLocator.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(importFromUrlTaskLocator.id()).isEqualTo("id")
        assertThat(importFromUrlTaskLocator.links())
            .contains(
                ImportFromUrlTaskLocator.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val importFromUrlTaskLocator =
            ImportFromUrlTaskLocator.builder()
                .id("id")
                .links(
                    ImportFromUrlTaskLocator.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedImportFromUrlTaskLocator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(importFromUrlTaskLocator),
                jacksonTypeRef<ImportFromUrlTaskLocator>(),
            )

        assertThat(roundtrippedImportFromUrlTaskLocator).isEqualTo(importFromUrlTaskLocator)
    }
}
