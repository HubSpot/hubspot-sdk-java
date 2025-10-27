// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.taxrates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTaxRateGroupTest {

    @Test
    fun create() {
        val publicTaxRateGroup =
            PublicTaxRateGroup.builder()
                .id("id")
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .label("label")
                .name("name")
                .percentageRate(0.0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicTaxRateGroup.id()).isEqualTo("id")
        assertThat(publicTaxRateGroup.active()).isEqualTo(true)
        assertThat(publicTaxRateGroup.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicTaxRateGroup.label()).isEqualTo("label")
        assertThat(publicTaxRateGroup.name()).isEqualTo("name")
        assertThat(publicTaxRateGroup.percentageRate()).isEqualTo(0.0)
        assertThat(publicTaxRateGroup.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTaxRateGroup =
            PublicTaxRateGroup.builder()
                .id("id")
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .label("label")
                .name("name")
                .percentageRate(0.0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicTaxRateGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTaxRateGroup),
                jacksonTypeRef<PublicTaxRateGroup>(),
            )

        assertThat(roundtrippedPublicTaxRateGroup).isEqualTo(publicTaxRateGroup)
    }
}
