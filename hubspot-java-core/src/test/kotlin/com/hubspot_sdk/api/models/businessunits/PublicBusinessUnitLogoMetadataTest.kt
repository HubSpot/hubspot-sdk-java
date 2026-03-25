// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.businessunits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBusinessUnitLogoMetadataTest {

    @Test
    fun create() {
        val publicBusinessUnitLogoMetadata =
            PublicBusinessUnitLogoMetadata.builder()
                .logoAltText("logoAltText")
                .logoUrl("logoUrl")
                .resizedUrl("resizedUrl")
                .build()

        assertThat(publicBusinessUnitLogoMetadata.logoAltText()).contains("logoAltText")
        assertThat(publicBusinessUnitLogoMetadata.logoUrl()).contains("logoUrl")
        assertThat(publicBusinessUnitLogoMetadata.resizedUrl()).contains("resizedUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBusinessUnitLogoMetadata =
            PublicBusinessUnitLogoMetadata.builder()
                .logoAltText("logoAltText")
                .logoUrl("logoUrl")
                .resizedUrl("resizedUrl")
                .build()

        val roundtrippedPublicBusinessUnitLogoMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBusinessUnitLogoMetadata),
                jacksonTypeRef<PublicBusinessUnitLogoMetadata>(),
            )

        assertThat(roundtrippedPublicBusinessUnitLogoMetadata)
            .isEqualTo(publicBusinessUnitLogoMetadata)
    }
}
