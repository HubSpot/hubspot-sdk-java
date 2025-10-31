// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportFromUrlTaskLocatorTest {

    @Test
    fun create() {
        val importFromUrlTaskLocator =
            ImportFromUrlTaskLocator.builder()
                .id("57122e26-59f8-4cfc-ba53-96e30c816762")
                .links(
                    ImportFromUrlTaskLocator.Links.builder()
                        .putAdditionalProperty("0", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(importFromUrlTaskLocator.id()).isEqualTo("57122e26-59f8-4cfc-ba53-96e30c816762")
        assertThat(importFromUrlTaskLocator.links())
            .isEqualTo(
                ImportFromUrlTaskLocator.Links.builder()
                    .putAdditionalProperty("0", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val importFromUrlTaskLocator =
            ImportFromUrlTaskLocator.builder()
                .id("57122e26-59f8-4cfc-ba53-96e30c816762")
                .links(
                    ImportFromUrlTaskLocator.Links.builder()
                        .putAdditionalProperty("0", JsonValue.from("string"))
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
