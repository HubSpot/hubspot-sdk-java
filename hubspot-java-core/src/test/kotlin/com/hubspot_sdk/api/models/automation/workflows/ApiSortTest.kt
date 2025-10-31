// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiSortTest {

    @Test
    fun create() {
        val apiSort =
            ApiSort.builder()
                .order(ApiSort.Order.ASC)
                .property("property")
                .missing("missing")
                .build()

        assertThat(apiSort.order()).isEqualTo(ApiSort.Order.ASC)
        assertThat(apiSort.property()).isEqualTo("property")
        assertThat(apiSort.missing()).contains("missing")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiSort =
            ApiSort.builder()
                .order(ApiSort.Order.ASC)
                .property("property")
                .missing("missing")
                .build()

        val roundtrippedApiSort =
            jsonMapper.readValue(jsonMapper.writeValueAsString(apiSort), jacksonTypeRef<ApiSort>())

        assertThat(roundtrippedApiSort).isEqualTo(apiSort)
    }
}
