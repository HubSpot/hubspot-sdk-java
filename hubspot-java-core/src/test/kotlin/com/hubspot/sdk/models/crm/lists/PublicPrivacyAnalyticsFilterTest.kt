// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPrivacyAnalyticsFilterTest {

    @Test
    fun create() {
        val publicPrivacyAnalyticsFilter =
            PublicPrivacyAnalyticsFilter.builder()
                .filterType(PublicPrivacyAnalyticsFilter.FilterType.PRIVACY)
                .operator("operator")
                .privacyName("privacyName")
                .build()

        assertThat(publicPrivacyAnalyticsFilter.filterType())
            .isEqualTo(PublicPrivacyAnalyticsFilter.FilterType.PRIVACY)
        assertThat(publicPrivacyAnalyticsFilter.operator()).isEqualTo("operator")
        assertThat(publicPrivacyAnalyticsFilter.privacyName()).isEqualTo("privacyName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPrivacyAnalyticsFilter =
            PublicPrivacyAnalyticsFilter.builder()
                .filterType(PublicPrivacyAnalyticsFilter.FilterType.PRIVACY)
                .operator("operator")
                .privacyName("privacyName")
                .build()

        val roundtrippedPublicPrivacyAnalyticsFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPrivacyAnalyticsFilter),
                jacksonTypeRef<PublicPrivacyAnalyticsFilter>(),
            )

        assertThat(roundtrippedPublicPrivacyAnalyticsFilter).isEqualTo(publicPrivacyAnalyticsFilter)
    }
}
