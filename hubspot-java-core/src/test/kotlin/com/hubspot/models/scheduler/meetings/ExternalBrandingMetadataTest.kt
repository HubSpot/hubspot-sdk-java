// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBrandingMetadataTest {

    @Test
    fun create() {
        val externalBrandingMetadata =
            ExternalBrandingMetadata.builder()
                .logoAltText("logoAltText")
                .showMarketingAd(true)
                .showSalesAd(true)
                .accent2Color("accent2Color")
                .accentColor("accentColor")
                .companyAddressLine1("companyAddressLine1")
                .companyAddressLine2("companyAddressLine2")
                .companyAvatar("companyAvatar")
                .companyCity("companyCity")
                .companyCountry("companyCountry")
                .companyDomain("companyDomain")
                .companyName("companyName")
                .companyState("companyState")
                .companyZip("companyZip")
                .logoHeight(0)
                .logoUrl("logoUrl")
                .logoWidth(0)
                .primaryColor("primaryColor")
                .secondaryColor("secondaryColor")
                .build()

        assertThat(externalBrandingMetadata.logoAltText()).isEqualTo("logoAltText")
        assertThat(externalBrandingMetadata.showMarketingAd()).isEqualTo(true)
        assertThat(externalBrandingMetadata.showSalesAd()).isEqualTo(true)
        assertThat(externalBrandingMetadata.accent2Color()).contains("accent2Color")
        assertThat(externalBrandingMetadata.accentColor()).contains("accentColor")
        assertThat(externalBrandingMetadata.companyAddressLine1()).contains("companyAddressLine1")
        assertThat(externalBrandingMetadata.companyAddressLine2()).contains("companyAddressLine2")
        assertThat(externalBrandingMetadata.companyAvatar()).contains("companyAvatar")
        assertThat(externalBrandingMetadata.companyCity()).contains("companyCity")
        assertThat(externalBrandingMetadata.companyCountry()).contains("companyCountry")
        assertThat(externalBrandingMetadata.companyDomain()).contains("companyDomain")
        assertThat(externalBrandingMetadata.companyName()).contains("companyName")
        assertThat(externalBrandingMetadata.companyState()).contains("companyState")
        assertThat(externalBrandingMetadata.companyZip()).contains("companyZip")
        assertThat(externalBrandingMetadata.logoHeight()).contains(0)
        assertThat(externalBrandingMetadata.logoUrl()).contains("logoUrl")
        assertThat(externalBrandingMetadata.logoWidth()).contains(0)
        assertThat(externalBrandingMetadata.primaryColor()).contains("primaryColor")
        assertThat(externalBrandingMetadata.secondaryColor()).contains("secondaryColor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBrandingMetadata =
            ExternalBrandingMetadata.builder()
                .logoAltText("logoAltText")
                .showMarketingAd(true)
                .showSalesAd(true)
                .accent2Color("accent2Color")
                .accentColor("accentColor")
                .companyAddressLine1("companyAddressLine1")
                .companyAddressLine2("companyAddressLine2")
                .companyAvatar("companyAvatar")
                .companyCity("companyCity")
                .companyCountry("companyCountry")
                .companyDomain("companyDomain")
                .companyName("companyName")
                .companyState("companyState")
                .companyZip("companyZip")
                .logoHeight(0)
                .logoUrl("logoUrl")
                .logoWidth(0)
                .primaryColor("primaryColor")
                .secondaryColor("secondaryColor")
                .build()

        val roundtrippedExternalBrandingMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBrandingMetadata),
                jacksonTypeRef<ExternalBrandingMetadata>(),
            )

        assertThat(roundtrippedExternalBrandingMetadata).isEqualTo(externalBrandingMetadata)
    }
}
