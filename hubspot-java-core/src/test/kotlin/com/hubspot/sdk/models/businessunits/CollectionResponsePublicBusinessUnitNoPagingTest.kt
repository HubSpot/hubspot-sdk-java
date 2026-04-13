// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.businessunits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicBusinessUnitNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicBusinessUnitNoPaging =
            CollectionResponsePublicBusinessUnitNoPaging.builder()
                .addResult(
                    PublicBusinessUnit.builder()
                        .id("id")
                        .name("name")
                        .logoMetadata(
                            PublicBusinessUnitLogoMetadata.builder()
                                .logoAltText("logoAltText")
                                .logoUrl("logoUrl")
                                .resizedUrl("resizedUrl")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicBusinessUnitNoPaging.results())
            .containsExactly(
                PublicBusinessUnit.builder()
                    .id("id")
                    .name("name")
                    .logoMetadata(
                        PublicBusinessUnitLogoMetadata.builder()
                            .logoAltText("logoAltText")
                            .logoUrl("logoUrl")
                            .resizedUrl("resizedUrl")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicBusinessUnitNoPaging =
            CollectionResponsePublicBusinessUnitNoPaging.builder()
                .addResult(
                    PublicBusinessUnit.builder()
                        .id("id")
                        .name("name")
                        .logoMetadata(
                            PublicBusinessUnitLogoMetadata.builder()
                                .logoAltText("logoAltText")
                                .logoUrl("logoUrl")
                                .resizedUrl("resizedUrl")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicBusinessUnitNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicBusinessUnitNoPaging),
                jacksonTypeRef<CollectionResponsePublicBusinessUnitNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicBusinessUnitNoPaging)
            .isEqualTo(collectionResponsePublicBusinessUnitNoPaging)
    }
}
