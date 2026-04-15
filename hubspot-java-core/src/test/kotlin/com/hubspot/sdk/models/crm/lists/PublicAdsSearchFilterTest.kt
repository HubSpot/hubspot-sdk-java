// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAdsSearchFilterTest {

    @Test
    fun create() {
        val publicAdsSearchFilter =
            PublicAdsSearchFilter.builder()
                .adNetwork("adNetwork")
                .entityType("entityType")
                .filterType(PublicAdsSearchFilter.FilterType.ADS_SEARCH)
                .operator("operator")
                .addSearchTerm("string")
                .searchTermType("searchTermType")
                .build()

        assertThat(publicAdsSearchFilter.adNetwork()).isEqualTo("adNetwork")
        assertThat(publicAdsSearchFilter.entityType()).isEqualTo("entityType")
        assertThat(publicAdsSearchFilter.filterType())
            .isEqualTo(PublicAdsSearchFilter.FilterType.ADS_SEARCH)
        assertThat(publicAdsSearchFilter.operator()).isEqualTo("operator")
        assertThat(publicAdsSearchFilter.searchTerms()).containsExactly("string")
        assertThat(publicAdsSearchFilter.searchTermType()).isEqualTo("searchTermType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAdsSearchFilter =
            PublicAdsSearchFilter.builder()
                .adNetwork("adNetwork")
                .entityType("entityType")
                .filterType(PublicAdsSearchFilter.FilterType.ADS_SEARCH)
                .operator("operator")
                .addSearchTerm("string")
                .searchTermType("searchTermType")
                .build()

        val roundtrippedPublicAdsSearchFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAdsSearchFilter),
                jacksonTypeRef<PublicAdsSearchFilter>(),
            )

        assertThat(roundtrippedPublicAdsSearchFilter).isEqualTo(publicAdsSearchFilter)
    }
}
