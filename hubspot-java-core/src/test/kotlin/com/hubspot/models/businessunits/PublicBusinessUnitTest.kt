// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.businessunits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBusinessUnitTest {

    @Test
    fun create() {
        val publicBusinessUnit =
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

        assertThat(publicBusinessUnit.id()).isEqualTo("id")
        assertThat(publicBusinessUnit.name()).isEqualTo("name")
        assertThat(publicBusinessUnit.logoMetadata())
            .contains(
                PublicBusinessUnitLogoMetadata.builder()
                    .logoAltText("logoAltText")
                    .logoUrl("logoUrl")
                    .resizedUrl("resizedUrl")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBusinessUnit =
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

        val roundtrippedPublicBusinessUnit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBusinessUnit),
                jacksonTypeRef<PublicBusinessUnit>(),
            )

        assertThat(roundtrippedPublicBusinessUnit).isEqualTo(publicBusinessUnit)
    }
}
