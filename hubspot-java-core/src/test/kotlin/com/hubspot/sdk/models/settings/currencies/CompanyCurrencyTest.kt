// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyCurrencyTest {

    @Test
    fun create() {
        val companyCurrency =
            CompanyCurrency.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(companyCurrency.id()).isEqualTo("id")
        assertThat(companyCurrency.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyCurrency =
            CompanyCurrency.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCompanyCurrency =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyCurrency),
                jacksonTypeRef<CompanyCurrency>(),
            )

        assertThat(roundtrippedCompanyCurrency).isEqualTo(companyCurrency)
    }
}
