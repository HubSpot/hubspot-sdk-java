// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrmFilterTest {

    @Test
    fun create() {
        val crmFilter =
            CrmFilter.builder()
                .operator(CrmFilter.Operator.BETWEEN)
                .propertyName("propertyName")
                .highValue("highValue")
                .value("value")
                .addValue("string")
                .build()

        assertThat(crmFilter.operator()).isEqualTo(CrmFilter.Operator.BETWEEN)
        assertThat(crmFilter.propertyName()).isEqualTo("propertyName")
        assertThat(crmFilter.highValue()).contains("highValue")
        assertThat(crmFilter.value()).contains("value")
        assertThat(crmFilter.values().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val crmFilter =
            CrmFilter.builder()
                .operator(CrmFilter.Operator.BETWEEN)
                .propertyName("propertyName")
                .highValue("highValue")
                .value("value")
                .addValue("string")
                .build()

        val roundtrippedCrmFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(crmFilter),
                jacksonTypeRef<CrmFilter>(),
            )

        assertThat(roundtrippedCrmFilter).isEqualTo(crmFilter)
    }
}
