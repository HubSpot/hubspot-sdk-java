// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyModificationMetadataTest {

    @Test
    fun create() {
        val propertyModificationMetadata =
            PropertyModificationMetadata.builder()
                .archivable(true)
                .readOnlyDefinition(true)
                .readOnlyValue(true)
                .readOnlyOptions(true)
                .build()

        assertThat(propertyModificationMetadata.archivable()).isEqualTo(true)
        assertThat(propertyModificationMetadata.readOnlyDefinition()).isEqualTo(true)
        assertThat(propertyModificationMetadata.readOnlyValue()).isEqualTo(true)
        assertThat(propertyModificationMetadata.readOnlyOptions()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyModificationMetadata =
            PropertyModificationMetadata.builder()
                .archivable(true)
                .readOnlyDefinition(true)
                .readOnlyValue(true)
                .readOnlyOptions(true)
                .build()

        val roundtrippedPropertyModificationMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyModificationMetadata),
                jacksonTypeRef<PropertyModificationMetadata>(),
            )

        assertThat(roundtrippedPropertyModificationMetadata).isEqualTo(propertyModificationMetadata)
    }
}
