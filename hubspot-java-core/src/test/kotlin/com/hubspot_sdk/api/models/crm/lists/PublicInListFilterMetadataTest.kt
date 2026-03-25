// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInListFilterMetadataTest {

    @Test
    fun create() {
        val publicInListFilterMetadata =
            PublicInListFilterMetadata.builder().id("id").inListType("inListType").build()

        assertThat(publicInListFilterMetadata.id()).isEqualTo("id")
        assertThat(publicInListFilterMetadata.inListType()).isEqualTo("inListType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInListFilterMetadata =
            PublicInListFilterMetadata.builder().id("id").inListType("inListType").build()

        val roundtrippedPublicInListFilterMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInListFilterMetadata),
                jacksonTypeRef<PublicInListFilterMetadata>(),
            )

        assertThat(roundtrippedPublicInListFilterMetadata).isEqualTo(publicInListFilterMetadata)
    }
}
