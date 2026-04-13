// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicWebinarFilterTest {

    @Test
    fun create() {
        val publicWebinarFilter =
            PublicWebinarFilter.builder()
                .filterType(PublicWebinarFilter.FilterType.WEBINAR)
                .operator("operator")
                .webinarId("webinarId")
                .build()

        assertThat(publicWebinarFilter.filterType())
            .isEqualTo(PublicWebinarFilter.FilterType.WEBINAR)
        assertThat(publicWebinarFilter.operator()).isEqualTo("operator")
        assertThat(publicWebinarFilter.webinarId()).contains("webinarId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicWebinarFilter =
            PublicWebinarFilter.builder()
                .filterType(PublicWebinarFilter.FilterType.WEBINAR)
                .operator("operator")
                .webinarId("webinarId")
                .build()

        val roundtrippedPublicWebinarFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicWebinarFilter),
                jacksonTypeRef<PublicWebinarFilter>(),
            )

        assertThat(roundtrippedPublicWebinarFilter).isEqualTo(publicWebinarFilter)
    }
}
